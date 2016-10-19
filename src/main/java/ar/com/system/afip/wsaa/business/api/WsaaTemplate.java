package ar.com.system.afip.wsaa.business.api;

import javax.annotation.Nullable;

import ar.com.system.afip.wsaa.service.api.Credentials;

import com.google.common.base.Function;

public interface WsaaTemplate {
	interface Factory {
		WsaaTemplate create(Service service);
	};

	@Nullable
	<T> T runAuhtenticated(Function<Credentials, T> callback);
}
