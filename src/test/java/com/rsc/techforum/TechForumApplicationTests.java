package com.rsc.techforum;

import com.rsc.techforum.controllers.TechForumController;
import com.rsc.techforum.models.TechForumEvent;
import com.rsc.techforum.repositories.TechForumRepository;
import com.rsc.techforum.services.TechForumService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TechForumApplicationTests {

	// TODO Review whether field autowiring is acceptable in tests and why
	@Autowired private TechForumController techForumController;
	@Autowired private TechForumEvent techForumEvent;
	@Autowired private TechForumService techForumService;
	@Autowired private TechForumRepository techForumRepository;

	@Test
	void contextLoads() {
		assertThat(techForumController).isNotNull();
		assertThat(techForumEvent).isNotNull();
		assertThat(techForumService).isNotNull();
		assertThat(techForumRepository).isNotNull();
	}

}
