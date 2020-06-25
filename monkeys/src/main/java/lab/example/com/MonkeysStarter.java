package lab.example.com;

import lab.example.com.rest.CapuchinResource;
import lab.example.com.rest.health.MainHealthIndicator;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class MonkeysStarter {
    public static void main(String[] args) throws Exception {

        Swarm swarm = new Swarm();
        swarm.start();

        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addClass(CapuchinResource.class);
        deployment.addClass(MainHealthIndicator.class);

        swarm.deploy(deployment);
    }
}
