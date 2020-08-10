package com.lab.wild.experiments;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
public interface SpeakerService {

    @GET
    List<Speaker> getAllSpekers();

    @PUT
    Response registerSpeaker(Speaker speaker);
}
