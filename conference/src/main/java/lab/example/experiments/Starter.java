package lab.example.experiments;

import lab.example.experiments.rest.ConferenceResource;
import lab.example.experiments.rest.health.MainHealthIndicator;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class Starter {
    public static void main(String[] args) throws Exception {

        Swarm swarm = new Swarm();
        swarm.start();

        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addClass(ConferenceResource.class);
        deployment.addClass(MainHealthIndicator.class);

        swarm.deploy(deployment);
    }
}
