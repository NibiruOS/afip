package ar.com.system.afip.wsaa.data.api;

import static com.google.common.base.Preconditions.checkNotNull;

public class Setup {
	private final String wsaaWsdl;
	private final String wsaaTargetNamespace;
	private final String wsfeWsdl;
	private final String environment;

	public Setup(String wsaaWsdl,
			String wsaaTargetNamespace,
			String wsfeWsdl,
			String environment) {
		this.wsaaWsdl = checkNotNull(wsaaWsdl);
		this.wsaaTargetNamespace = checkNotNull(wsaaTargetNamespace);
		this.wsfeWsdl = checkNotNull(wsfeWsdl);
		this.environment = checkNotNull(environment);
	}

	public String getWsaaWsdl() {
		return wsaaWsdl;
	}

	public String getWsaaTargetNamespace() {
		return wsaaTargetNamespace;
	}

	public String getWsfeWsdl() {
		return wsfeWsdl;
	}

	public String getEnvironment() {
		return environment;
	}
}
