package org.apache.camel.example.reportincident;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2015-06-10T14:12:22.564+02:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "ReportIncidentService", 
                  wsdlLocation = "file:/opt/esb/apache/camel-example-reportincident/src/main/webapp/WEB-INF/wsdl/report_incident.wsdl",
                  targetNamespace = "http://reportincident.example.camel.apache.org") 
public class ReportIncidentService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentService");
    public final static QName ReportIncidentPort = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/opt/esb/apache/camel-example-reportincident/src/main/webapp/WEB-INF/wsdl/report_incident.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReportIncidentService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/opt/esb/apache/camel-example-reportincident/src/main/webapp/WEB-INF/wsdl/report_incident.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReportIncidentService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReportIncidentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportIncidentService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportIncidentService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportIncidentService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportIncidentService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentPort")
    public ReportIncidentEndpoint getReportIncidentPort() {
        return super.getPort(ReportIncidentPort, ReportIncidentEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentPort")
    public ReportIncidentEndpoint getReportIncidentPort(WebServiceFeature... features) {
        return super.getPort(ReportIncidentPort, ReportIncidentEndpoint.class, features);
    }

}
