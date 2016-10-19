package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.data.api.Setup;
import ar.com.system.afip.wsaa.data.api.SetupDao;

public class ProductionSetupDao implements SetupDao {
	@Override
	public Setup readSetup() {
		return new Setup("https://wsaa.afip.gov.ar/ws/services/LoginCms?wsdl",
				"https://wsaa.afip.gov.ar/ws/services/LoginCms",
				"https://servicios1.afip.gov.ar/wsfev1/service.asmx?WSDL",
				"wsaa");
	}
}
