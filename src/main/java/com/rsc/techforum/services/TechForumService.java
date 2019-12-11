package com.rsc.techforum.services;

import com.rsc.techforum.models.TechForumEvent;
import com.rsc.techforum.repositories.TechForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("techForumService")
public class TechForumService {

    private TechForumRepository repository;

    @Autowired
    public TechForumService(TechForumRepository repository) {
        this.repository = repository;
    }

    public List<TechForumEvent> findAll() {
        return repository.findAll();
    }
}
