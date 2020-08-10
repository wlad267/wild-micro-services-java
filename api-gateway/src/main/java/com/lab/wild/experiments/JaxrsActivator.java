package com.lab.wild.experiments;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationScoped
@ApplicationPath("/gateway")
public class JaxrsActivator extends Application {
}
