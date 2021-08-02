#./gradlew clean install
#./gradlew clean build -x test
./gradlew build -x test

cp ar.com.system.afip/build/libs/*.jar ../starpos/lib
cp ar.com.system.afip.jre/build/libs/*.jar ../starpos/lib
#cp ar.com.system.afip.android/build/libs/*.jar ../starpos/lib
