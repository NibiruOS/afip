package ar.com.system.afip.wsaa.data.impl;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.SetupDao;

public abstract class AbstractSetupDao implements SetupDao {
	
	protected Service billingService;
	
	public AbstractSetupDao(Service billingService) {
		checkNotNull(billingService);
		checkArgument(billingService == Service.WSFE || billingService == Service.WSMTXCA,
				"Invalid billing service: %s", billingService);
		this.billingService = billingService;
	}

}
