package com.lab.wild.experiments;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/speaker")
public class SpeakerGateway {

    @Inject
    private SpeakerService speakerService;

    @GET
    List<Speaker> getAllSpekers(){
        return speakerService.getAllSpekers();
    }
}
