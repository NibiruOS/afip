package ar.com.system.afip.wsaa.data.impl;

import static com.google.common.base.Preconditions.checkNotNull;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;

public class InMemoryWsaaDao implements WsaaDao {
	private CompanyInfo companyInfo;
	
	@Override
	public void saveCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = checkNotNull(companyInfo);
	}

	@Override
	public CompanyInfo loadCompanyInfo() {
		return companyInfo;
	}

}
