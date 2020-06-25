package lab.example.com.rest;

import lab.example.com.Capuchin;
import lab.example.com.rest.registers.CapuchinMealRegister;
import lab.example.com.rest.registers.CapuchinRegister;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Capuchin monkeys are one of the most known monkey species.
 * They will be serving our animal cognition laboratory as object behaviour actor.
 *
 * The resource will register the capucin daily diet and will determine
 * mood based on the food quantity.
 * (it is scientifically proved that happy capuchin have at least 2 ditches per day)
 */

@Path("/capuchin")
public class CapuchinResource {

    @Inject
    private CapuchinRegister capuchinRegister;
    @Inject
    private CapuchinMealRegister capuchinMealRegister;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String getHello() {
            return "Ho-ka-ho-ka";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Collection<Capuchin> consultCapuchingInTheWildeest(){
        return capuchinRegister.findAll();
    }

    @POST
    @Path("/{id}/eat")
    public void registerReal(@PathParam("capId") int capId, @FormParam("meal") String meal){
        capuchinMealRegister.registerMeal(capId, meal);
    }


}
