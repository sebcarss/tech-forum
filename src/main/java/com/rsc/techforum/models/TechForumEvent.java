package com.rsc.techforum.models;

import org.springframework.stereotype.Component;

@Component("techForumEvent")
public class TechForumEvent {
    private int eventNumber;

    public int getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(int eventNumber) {
        this.eventNumber = eventNumber;
    }
}
