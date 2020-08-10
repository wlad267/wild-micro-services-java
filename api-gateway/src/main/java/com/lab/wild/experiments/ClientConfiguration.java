package com.lab.wild.experiments;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class ClientConfiguration {

    @Inject
    @ConfigProperty(name = "speakerServiceHostname", defaultValue = "localhost")
    private String speakerServiceHostname;

    @Inject
    @ConfigProperty(name = "speakerServicePort", defaultValue = "8081")
    private String speakerServicePort;

    @Produces
    public SpeakerService speakerService(){
        Client client = ClientBuilder.newClient();
        ResteasyWebTarget webTarget = (ResteasyWebTarget) client.target("http://" + speakerServiceHostname +":" +speakerServicePort +"/api");
        SpeakerService speakerService = webTarget.proxy(SpeakerService.class);
        return speakerService;

    }

}
