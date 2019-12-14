package com.rsc.techforum.repositories;

import com.rsc.techforum.models.TechForumEvent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("techForumRepository")
public class TechForumRepository implements com.rsc.techforum.repositories.Repository {

    @Override
    public List<TechForumEvent> findAll() {
        return createStubEvents();
    }

    // TODO Replace this stub event with a database call to PostgreSQL
    private List<TechForumEvent> createStubEvents() {
        System.out.println("Getting stub event from the TechForumRepository class");

        List<TechForumEvent> techForumEvents = new ArrayList<>();

        TechForumEvent techForumEvent = new TechForumEvent();
        techForumEvent.setEventNumber(1);

        techForumEvents.add(techForumEvent);

        return techForumEvents;
    }
}
