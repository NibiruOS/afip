# AFIP
AFIP es un módulo de integración con los [servicios](http://www.afip.gob.ar/ws/), obviamente, de [AFIP](http://www.afip.gob.ar/).

Fue donado al proyecto Nibiru por la empresa [System](http://www.systemrosario.com/).

Actualmente, soporta 2 servicios de AFIP:
 * [WSAA](http://www.afip.gov.ar/ws/WSAA/Especificacion_Tecnica_WSAA_1.2.0.pdf) (Autenticación)
 * [WSFE](http://www.afip.gov.ar/ws/WSFE/WSFE-GuiaAdicionalParaElProgramador.pdf) (Facturación electrónica).

El módulo WSAA incluye toda la lógica necesaria para la generación de claves y credenciales, por lo que no es necesario usar un programa externo, por ejemplo como [OpenSSL](https://www.openssl.org/).

Para entender cómo funciona cada componente, por favor referirse a los [tests unitarios](../../tree/master/src/test/java/ar/com/system/afip). Para ejecutar dichos tests, será necesario completar los datos de la empresa en la clase [BouncyCastleWsaaManagerTest](../master/src/test/java/ar/com/system/afip/wsaa/business/impl/BouncyCastleWsaaManagerTest.java).
