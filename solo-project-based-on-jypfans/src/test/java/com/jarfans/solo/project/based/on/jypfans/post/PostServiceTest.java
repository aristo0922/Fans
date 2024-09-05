package com.jarfans.solo.project.based.on.jypfans.post;

import static org.junit.jupiter.api.Assertions.*;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.PostRepository;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class PostServiceTest {
  @Autowired
  PostRepository postRepository;

  @Autowired
  PostService postService;
  Post post, postNone;

  @BeforeEach
  public void beforeEach(){
    postService = new PostService(postRepository);
    post = Post.builder()
        .subject("XH")
        .content("hello XH")
        .teamId(1)
        .fanId(1)
        .build();
    postNone = Post.builder()
        .id(-1)
        .subject("XH")
        .content("hello XH")
        .build();
  }

  @Test
  public void 게시글_등록(){
    postService.save(post);
    Post result = postRepository.findById(post.getId()).get();
    Assertions.assertThat(post.getSubject()).isEqualTo(result.getSubject());
  }

  @Test
  public void 전체_게시글_조회(){
    List<Post> posts = postService.getPosts();
    Assertions.assertThat(posts.size()).isGreaterThan(0);
  }

  @Test
  public void 단일_게시글_조회(){
    long id = 2L;
    Optional<Post> post = postService.getPostEntity(id);
    Assertions.assertThat(post.isPresent());
  }

  @Test
  public void 게시글_수정(){
    postService.upload(post);
    long id = post.getId();

    Post updated = Post.builder()
        .id(id)
        .subject("XH Consert")
        .content("is this weekend").build();

    postService.upload(updated);
    Post saved = postRepository.findById(id).get();
    Assertions.assertThat(saved.getSubject()).isEqualTo("XH Consert");
  }

  @Test
  public void 게시글_삭제(){
    postService.save(post);
    long id = post.getId();
    assertTrue(postRepository.findById(id).isPresent());
    postService.delete(id);
    assertTrue(postRepository.findById(id).isEmpty());
  }
}