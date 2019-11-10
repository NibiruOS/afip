package ar.com.system.afip.wsaa.data.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static com.google.common.base.Preconditions.checkNotNull;

public class Setup {
    private final String wsaaWsdl;
    private final String wsaaTargetNamespace;
    private final String billingWsdl;
    private final String environment;

    public Setup(@Nonnull String wsaaWsdl,
                 @Nonnull String wsaaTargetNamespace,
                 @Nonnull String billingWsdl,
                 @Nullable String environment) {
        this.wsaaWsdl = checkNotNull(wsaaWsdl);
        this.wsaaTargetNamespace = checkNotNull(wsaaTargetNamespace);
        this.billingWsdl = checkNotNull(billingWsdl);
        this.environment = environment;
    }

    @Nonnull
    public String getWsaaWsdl() {
        return wsaaWsdl;
    }

    @Nonnull
    public String getWsaaTargetNamespace() {
        return wsaaTargetNamespace;
    }

    @Nonnull
    public String geBillingWsdl() {
        return billingWsdl;
    }

    @Nullable
    public String getEnvironment() {
        return environment;
    }

    public boolean useSourceAndDestination() {
        return environment != null;
    }

}
