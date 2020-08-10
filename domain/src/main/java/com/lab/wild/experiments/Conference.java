package com.lab.wild.experiments;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Conference {
    private UUID id = UUID.randomUUID();
    private String title;
    private String description;
    private List<Speaker> speakers = new ArrayList<>();

    public Conference(String title, String description){
        this.title = title;
        this.description = description;
    }


    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
