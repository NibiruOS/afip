/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.system.afip.wsaa.utils;

/**
 *
 * @author ivan
 */
public class Utils {
    
    public static final int TIMEOUT = 15000;
    public static final boolean MODE_DEBUG = false;
    
    public static void setJdkTimeout(int connectionTimeout) {
        // Estas son las que funcionan en mi JDK 11
        System.setProperty("sun.net.client.defaultConnectTimeout ", String.valueOf(connectionTimeout));
        System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(connectionTimeout));
        // JDK 6 ? No funciona en el JDK 11
        System.setProperty("com.sun.xml.internal.ws.connect.timeout ", String.valueOf(connectionTimeout));
        System.setProperty("com.sun.xml.internal.ws.request.timeout", String.valueOf(connectionTimeout));
    }
    
    public static void setdebugMode(boolean enable) {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", String.valueOf(enable));
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", String.valueOf(enable));
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", String.valueOf(enable));
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", String.valueOf(enable));
    }
    
}
