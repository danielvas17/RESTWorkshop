FROM jboss/wildfly
ADD /dist/Test.war /opt/jboss/wildfly/standalone/deployments/
