package lab.example.experiments.rest.registers;


import com.lab.wild.experiments.Conference;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class ConferenceRegister {
    private Set<Conference> wildCapuchinPopulation = new HashSet<>();

    @PostConstruct
    public void populate(){
        wildCapuchinPopulation.addAll(
                Arrays.asList(new Conference("Micro-services in action", "A comprehensive introduction into microservices"),
                        new Conference("API management", "Hands on codding API gateways via RestEasy"),
                        new Conference("Distributed security", "Web SSO with JWT")
                ));
    }

    public Set<Conference> findAll() {
        return wildCapuchinPopulation;
    }

    public void register(String speakerId, String conferenceId) {

    }
}
