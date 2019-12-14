package com.rsc.techforum.controllers;

import com.rsc.techforum.models.TechForumEvent;
import com.rsc.techforum.repositories.TechForumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TechForumControllerTests {

    @Autowired private MockMvc mockMvc;
    @MockBean private TechForumRepository techForumRepository;

    @Test
    void shouldReturnSuccessAndResponseContainsAnEventNumber() throws Exception {
        List<TechForumEvent> techForumEvents = createTechForumEvents();
        when(techForumRepository.findAll()).thenReturn(techForumEvents);

        mockMvc.perform(get("/api/v1/events")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"eventNumber\":2}]")));
    }

    private List<TechForumEvent> createTechForumEvents() {
        List<TechForumEvent> techForumEvents = new ArrayList<>();

        TechForumEvent techForumEvent = new TechForumEvent();
        techForumEvent.setEventNumber(2);

        techForumEvents.add(techForumEvent);

        return techForumEvents;
    }
}
