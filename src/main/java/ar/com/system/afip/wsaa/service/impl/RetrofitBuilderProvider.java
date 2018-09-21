package ar.com.system.afip.wsaa.service.impl;

import io.github.nibiruos.retrosoap.RetroSoapFactory;
import io.github.nibiruos.retrosoap.SoapSpec;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;
import java.util.concurrent.TimeUnit;

import static com.google.common.base.Preconditions.checkNotNull;

public class RetrofitBuilderProvider
        implements Provider<Retrofit.Builder> {
    private final Provider<XmlSerializer> serializerProvider;
    private final Provider<XmlPullParser> pullParserProvider;

    @Inject
    public RetrofitBuilderProvider(@Nonnull Provider<XmlSerializer> serializerProvider,
                                   @Nonnull Provider<XmlPullParser> pullParserProvider) {
        this.serializerProvider = checkNotNull(serializerProvider);
        this.pullParserProvider = checkNotNull(pullParserProvider);
    }

    @Override
    public Retrofit.Builder get() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new Retrofit.Builder()
                .client(new OkHttpClient.Builder()
                        .addInterceptor(logging)
                        .addInterceptor(chain -> {
                            Request request = chain.request();
                            Response response = chain.proceed(request);

                            if (!response.isSuccessful()) {
                                return new Response.Builder()
                                        .request(request)
                                        .protocol(response.protocol())
                                        .message(response.message())
                                        .code(200)
                                        .headers(response.headers())
                                        .body(response.body())
                                        .build();
                            } else {
                                return response;
                            }
                        })
                        .readTimeout(1, TimeUnit.MINUTES)
                        .build())
                .addConverterFactory(RetroSoapFactory
                        .create(SimpleXmlConverterFactory.create(new Persister(new AnnotationStrategy())),
                                serializerProvider,
                                pullParserProvider,
                                SoapSpec.V_1_1))
                .addCallAdapterFactory(new PojoCallAdapterFactory());
    }
}
