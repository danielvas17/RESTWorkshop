FROM jboss/wildfly
ADD /dist/Test.war /opt/jboss/wildfly/standalone/deployments/
EXPOSE 8080 9990
