package com.rsc.techforum;

import com.rsc.techforum.controllers.TechForumController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TechForumApplicationTests {

	// TODO Review whether field autowiring is acceptable in tests and why
	@Autowired
	private TechForumController techForumController;

	@Test
	void contextLoads() {
		assertThat(techForumController).isNotNull();
	}

}
