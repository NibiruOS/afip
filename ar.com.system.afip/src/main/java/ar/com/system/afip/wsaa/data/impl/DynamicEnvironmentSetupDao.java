package ar.com.system.afip.wsaa.data.impl;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.Setup;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.utils.Utils;

public class DynamicEnvironmentSetupDao implements SetupDao {
	private final HomoSetupDao homoSetupDao;
	private final ProductionSetupDao productionSetupDao;
	private SetupDao activeDao;

	public DynamicEnvironmentSetupDao(Service billingService, boolean homoDefault, int connectionTimeout, boolean debugMode) {
            homoSetupDao = new HomoSetupDao(billingService);
            productionSetupDao = new ProductionSetupDao(billingService);
            setHomo(homoDefault);
            Utils.setJdkTimeout(connectionTimeout);
            Utils.setdebugMode(debugMode);
	}
        
        public DynamicEnvironmentSetupDao(Service billingService, boolean homoDefault) {
            this(billingService, homoDefault, Utils.TIMEOUT, Utils.MODE_DEBUG);
	}
        
        public DynamicEnvironmentSetupDao(Service billingService, boolean homoDefault, int connectionTimeout) {
            this(billingService, homoDefault, connectionTimeout, Utils.MODE_DEBUG);
	}
        
        public DynamicEnvironmentSetupDao(Service billingService, boolean homoDefault, boolean debugMode) {
            this(billingService, homoDefault, Utils.TIMEOUT, debugMode);
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
