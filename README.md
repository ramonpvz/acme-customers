# acme-customers
Summary:
Microservices running on Payara Server.
Build:
mvn clean package
Deploy:
java -jar ../../Documents/home/Arkives/_buffer/payara-micro-5.181.jar --deploy api/target/acme-customers-api-1.0.0-SNAPSHOT.war
