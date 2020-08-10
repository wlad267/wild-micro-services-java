package com.lab.wild.experiments.speakers.rest;

import com.lab.wild.experiments.Speaker;
import com.lab.wild.experiments.speakers.SpeakersRegistry;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.Optional;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class SpeakersResource {

    @Inject
    private SpeakersRegistry registry;
    @GET
    public Collection<Speaker> getAllSpeakers(){
        return registry.getAll();
    }

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") String id){
        Optional<Speaker> speaker = registry.getAll()
                .stream()
                .filter(speaker1 -> speaker1.getId().equals(id))
                .findFirst();
        if (!speaker.isPresent()){
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok(speaker).build();
    }
}
