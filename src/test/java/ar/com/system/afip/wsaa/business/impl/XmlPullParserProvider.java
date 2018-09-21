package ar.com.system.afip.wsaa.business.impl;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import javax.inject.Provider;

public class XmlPullParserProvider implements Provider<XmlPullParser> {
    @Override
    public XmlPullParser get() {
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            return factory.newPullParser();
        } catch (XmlPullParserException e) {
            throw new RuntimeException(e);
        }
    }
}
