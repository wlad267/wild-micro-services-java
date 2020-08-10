package com.lab.wild.experiments;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Speaker {
    private UUID id = UUID.randomUUID();
    private String name;
    private String email;
    private List<Conference> conferences = new ArrayList<>();

    public Speaker(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void particiate(Conference conference){
        this.conferences.add(conference);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Conference> getConferences() {
        return conferences;
    }
}
