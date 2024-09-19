package com.jarfans.solo.project.based.on.jypfans.post.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class PostRepositoryTest {
  @Autowired
  PostRepository postRepository;

  @Test
  public void InsertPost(){
    Post post =  Post.builder()
        .title("XH123")
        .content("angel").build();
    postRepository.save(post);
  }

}