package com.lab.wild.experiments.speakers.rest;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.jboss.shrinkwrap.resolver.api.maven.ScopeType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.arquillian.CreateSwarm;

import java.io.File;
import java.util.Properties;

@RunWith(Arquillian.class)
public class SpeakersResourceTest {

    @Deployment
    public static WebArchive deploy() {

        File[] deps = Maven.resolver()
                .loadPomFromFile("pom.xml")
                .importDependencies(ScopeType.COMPILE, ScopeType.RUNTIME)
                .resolve().withTransitivity().asFile();

        WebArchive wrap = ShrinkWrap.create(WebArchive.class
                , SpeakersResourceTest.class.getName() + ".war")
                .addPackages(true, "io.microprofile.showcase.speaker")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                //.addAsManifestResource("META-INF/microprofile-config.properties","microprofile-config.properties")
                .addAsLibraries(deps);
        return wrap;

    }

    @CreateSwarm
    public static Swarm newContainer() throws Exception {
        Properties properties = new Properties();
        properties.put("swarm.http.port", 8080);
        properties.put("java.util.logging.manager", "org.jboss.logmanager.LogManager");
        Swarm swarm = new Swarm(properties);
        return swarm.withProfile("defaults");
    }
    @Test
    public void shall_return_all_default_speakers(){

    }
}
