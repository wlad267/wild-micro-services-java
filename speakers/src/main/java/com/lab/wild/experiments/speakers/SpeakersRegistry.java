package com.lab.wild.experiments.speakers;

import com.lab.wild.experiments.Speaker;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SpeakersRegistry {
    private Set<Speaker> speakers = new HashSet<>();

    public SpeakersRegistry() {
        speakers.addAll(Arrays.asList(new Speaker("X Man", "xman@gmail.com"),
                new Speaker("John Doe", "jon.doe@yahoo.com")));
    }

    public Collection<Speaker> getAll(){
        return speakers;
    }
}
