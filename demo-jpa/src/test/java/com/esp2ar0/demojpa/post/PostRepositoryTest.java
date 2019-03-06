package com.esp2ar0.demojpa.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

	@Autowired
	PostRepository postRepository;

	@Test
	public void update() {
		Post post = new Post();
		post.setTitle("jpa");
		postRepository.save(post);

		List<Post> all = postRepository.findAll();
		assertThat(all.get(0).getTitle()).isEqualTo("jpa");

		post.setTitle("hibernate");

		List<Post> all2 = postRepository.findAll();
		assertThat(all2.get(0).getTitle()).isEqualTo("hibernate");
	}

}