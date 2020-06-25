package lab.example.com.rest.registers;


import lab.example.com.Capuchin;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class CapuchinRegister {
    private Set<Capuchin> wildCapuchinPopulation = new HashSet<>();

    @PostConstruct
    public void populate(){
        wildCapuchinPopulation.addAll(
                Arrays.asList(new Capuchin(1),
                        new Capuchin(2),
                        new Capuchin(3)
                ));
    }

    public Set<Capuchin> findAll() {
        return wildCapuchinPopulation;
    }
}
