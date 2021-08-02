:: call gradle clean install
::call gradle clean build -x test
call gradle build -x test

set LIB_PATH=..\starpos\lib

echo Copiado en %LIB_PATH%
copy /Y ar.com.system.afip\build\libs\*.jar %LIB_PATH%
::copy /Y ar.com.system.afip.jre\build\libs\*.jar %LIB_PATH%
::copy /Y ar.com.system.afip.android\build\libs\*.jar %LIB_PATH%
