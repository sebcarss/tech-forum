package com.rsc.techforum.repositories;

import com.rsc.techforum.models.TechForumEvent;

import java.util.List;

public interface Repository {
    List<TechForumEvent> findAll();
}
