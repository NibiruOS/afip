package ar.com.system.afip.wsaa.data.api;

public interface WsaaDao {
	void saveCompanyInfo(CompanyInfo companyInfo);

	CompanyInfo loadCompanyInfo();
}
