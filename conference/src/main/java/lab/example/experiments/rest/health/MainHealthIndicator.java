package lab.example.experiments.rest.health;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;


@Health
@ApplicationScoped
public class MainHealthIndicator implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("alive")
                .withData("description","this service is always up - no need to worry")
                .up()
                .build();
    }
}
