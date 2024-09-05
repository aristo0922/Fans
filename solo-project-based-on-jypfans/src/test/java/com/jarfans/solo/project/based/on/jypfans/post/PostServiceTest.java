package com.jarfans.solo.project.based.on.jypfans.post;

import static org.junit.jupiter.api.Assertions.*;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.PostRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

@Transactional
class PostServiceTest {
  PostRepository postRepository;
  PostService postService;
  Post post, postNone;

  @BeforeEach
  public void beforeEach(){
    postService = new PostService(postRepository);
    post = Post.builder()
        .subject("XH")
        .content("hello XH")
        .build();
    postNone = Post.builder()
        .id(-1)
        .subject("XH")
        .content("hello XH")
        .build();
  }

  @Test
  public void 게시글_등록(){
    postService.upload(post);
    Post result = postRepository.findById(post.getId()).get();
    Assertions.assertThat(post.getSubject()).isEqualTo(result.getSubject());
  }
}