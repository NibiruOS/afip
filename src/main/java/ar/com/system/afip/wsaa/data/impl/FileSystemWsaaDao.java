package ar.com.system.afip.wsaa.data.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.WsaaDao;

import com.google.common.base.Throwables;
import com.google.gson.Gson;

public class FileSystemWsaaDao implements WsaaDao {
	private final String path;
	private final Gson gson;

	public FileSystemWsaaDao(String path, Gson gson) {
		this.path = checkNotNull(path);
		this.gson = checkNotNull(gson);
	}

	@Override
	public void saveCompanyInfo(CompanyInfo companyInfo) {
		try (Writer out = new OutputStreamWriter(new FileOutputStream(path))) {
			gson.toJson(companyInfo, out);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	}

	@Override
	public CompanyInfo loadActiveCompanyInfo() {
		try (Reader in = new InputStreamReader(new FileInputStream(path))) {
			return gson.fromJson(in, CompanyInfo.class);
		} catch (IOException e) {
			throw Throwables.propagate(e);
		}
	}
}
