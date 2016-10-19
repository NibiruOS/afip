package ar.com.system.afip.wsaa.business.impl;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.inject.Provider;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.common.base.Throwables;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class XStreamProvider implements Provider<XStream> {
	@Override
	public XStream get() {
		XStream xstream = new XStream();
		xstream.useAttributeFor(LoginTicketRequest.class, "version");
		xstream.alias("loginTicketRequest", LoginTicketRequest.class);
		xstream.alias("loginTicketResponse", LoginTicketResponse.class);

		xstream.registerConverter(new XmlDateConverter());
		return xstream;
	}

	private static class XmlDateConverter extends AbstractSingleValueConverter {
		private final DatatypeFactory datatypeFactory;

		public XmlDateConverter() {
			try {
				this.datatypeFactory = DatatypeFactory.newInstance();
			} catch (DatatypeConfigurationException e) {
				throw Throwables.propagate(e);
			}
		}

		@Override
		public boolean canConvert(@SuppressWarnings("rawtypes") Class clazz) {
			return Date.class.isAssignableFrom(clazz);
		}

		@Override
		public Object fromString(String value) {
			return datatypeFactory.newXMLGregorianCalendar(value)
					.toGregorianCalendar().getTime();
		}

		@Override
		public String toString(Object value) {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime((Date) value);
			XMLGregorianCalendar xmlCalendar = datatypeFactory
					.newXMLGregorianCalendar(calendar);
			// Al enviar el requerimiento, si los milisegundos no son 0, falla
			// el parseo del lado del servidor.
			// Sin embargo, en la respuesta del login, el header SI contiene
			// milisegundos!!!
			xmlCalendar.setMillisecond(0);
			return xmlCalendar.toXMLFormat();
		}
	}
}
