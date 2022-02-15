#./gradlew clean install
#./gradlew clean build -x test
./gradlew build -x test

echo Copying in $1

cp ar.com.system.afip/build/libs/*.jar ../$1
cp ar.com.system.afip.jre/build/libs/*.jar ../$1
#cp ar.com.system.afip.android/build/libs/*.jar ../$1
