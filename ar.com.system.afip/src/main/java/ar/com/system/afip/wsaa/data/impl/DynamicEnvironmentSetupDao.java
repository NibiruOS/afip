package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.Setup;
import ar.com.system.afip.wsaa.data.api.SetupDao;

public class DynamicEnvironmentSetupDao implements SetupDao {
	private final HomoSetupDao homoSetupDao;
	private final ProductionSetupDao productionSetupDao;
	private SetupDao activeDao;

	public DynamicEnvironmentSetupDao(Service billingService, boolean homoDefault) {
		homoSetupDao = new HomoSetupDao(billingService);
		productionSetupDao = new ProductionSetupDao(billingService);
		setHomo(homoDefault);
	}

	public boolean isHomo() {
		return activeDao == homoSetupDao;
	}

	public void setHomo(boolean homo) {
		activeDao = homo ? homoSetupDao : productionSetupDao;
	}

	@Override
	public Setup readSetup() {
		return activeDao.readSetup();
	}
}
