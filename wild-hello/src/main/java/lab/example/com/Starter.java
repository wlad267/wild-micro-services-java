package lab.example.com;

import lab.example.com.rest.HelloWorldResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class Starter {
    public static void main(String[] args) throws Exception {

        Swarm swarm = new Swarm();
        swarm.start();

        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addClass(HelloWorldResource.class);
        swarm.deploy(deployment);
    }
}
