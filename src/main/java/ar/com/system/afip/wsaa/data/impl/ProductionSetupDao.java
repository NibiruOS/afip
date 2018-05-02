package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.Setup;

public class ProductionSetupDao extends AbstractSetupDao {
	
	public ProductionSetupDao(Service billingService) {
		super(billingService);
	}

	@Override
	public Setup readSetup() {
		return new Setup("https://wsaa.afip.gov.ar/ws/services/LoginCms?wsdl",
				"https://wsaa.afip.gov.ar/ws/services/LoginCms",
				billingService.getProductionWsdl(),
				"wsaa");
	}
}
