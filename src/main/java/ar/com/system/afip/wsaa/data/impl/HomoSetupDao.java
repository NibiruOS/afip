package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.data.api.Setup;
import ar.com.system.afip.wsaa.data.api.SetupDao;

public class HomoSetupDao implements SetupDao {
	@Override
	public Setup readSetup() {
		return new Setup(
				"https://wsaahomo.afip.gov.ar/ws/services/LoginCms?wsdl",
				"https://wsaahomo.afip.gov.ar/ws/services/LoginCms",
				"https://wswhomo.afip.gov.ar/wsfev1/service.asmx?WSDL",
				"wsaahomo");
	}
}
