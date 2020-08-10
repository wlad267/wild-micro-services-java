package lab.example.experiments.rest;

import com.lab.wild.experiments.Conference;
import lab.example.experiments.rest.registers.ConferenceRegister;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;


@Path("/conference")
public class ConferenceResource {

    @Inject
    private ConferenceRegister conferenceRegister;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String getHello() {
            return "Ho-ka-ho-ka";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Collection<Conference> consultCapuchingInTheWildeest(){
        return conferenceRegister.findAll();
    }

    @POST
    @Path("/register/speaker/{speakerId}/conference/{conferenceId}")
    public void registerReal(@PathParam("speakerId") String speakerId,
                             @PathParam("conferenceId") String conferenceId){
        conferenceRegister.register(speakerId, conferenceId);
    }


}
