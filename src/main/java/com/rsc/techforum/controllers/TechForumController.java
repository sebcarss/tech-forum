package com.rsc.techforum.controllers;

import com.rsc.techforum.models.TechForumEvent;
import com.rsc.techforum.services.TechForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("techForumController")
@RequestMapping("/api/v1")
public class TechForumController {

    private TechForumService techForumService;

    @Autowired
    public TechForumController(TechForumService techForumService) {
        this.techForumService = techForumService;
    }

    @GetMapping("/events")
    public List<TechForumEvent> getEvents() {
        return techForumService.findAll();
    }
}

