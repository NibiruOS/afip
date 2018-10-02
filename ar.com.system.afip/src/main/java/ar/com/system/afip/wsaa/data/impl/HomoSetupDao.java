package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.Setup;

public class HomoSetupDao extends BaseSetupDao {
	
	
	public HomoSetupDao(Service billingService) {
		super(billingService);
	}

	@Override
	public Setup readSetup() {
		return new Setup(
				"https://wsaahomo.afip.gov.ar/ws/services/LoginCms?wsdl",
				"https://wsaahomo.afip.gov.ar/ws/services/LoginCms",
				billingService.getHomoWsdl(),
				"wsaahomo");
	}
}
