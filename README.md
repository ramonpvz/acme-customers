# acme-customers
Summary:
Microservices running on Payara Server.
Build:
mvn clean package
Deploy Windows:
java -jar ../../Documents/home/Arkives/_buffer/payara-micro-5.181.jar --deploy api/target/acme-customers-api-1.0.0-SNAPSHOT.war
Deploy OSx
java -jar /Users/nomar/Documents/Arkives/_buffer/payara-micro-5.181.jar --deploy /Users/nomar/Documents/workspace_microservices/acme-customers/api/target/acme-customers-api-1.0.0-SNAPSHOT.war
