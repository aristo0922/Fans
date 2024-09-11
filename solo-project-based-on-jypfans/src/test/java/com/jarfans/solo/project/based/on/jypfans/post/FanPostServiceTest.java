package com.jarfans.solo.project.based.on.jypfans.post;

import static org.junit.jupiter.api.Assertions.*;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.PostRepository;
import com.jarfans.solo.project.based.on.jypfans.post.data.SavePostDTO;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class FanPostServiceTest {

  @Autowired
  PostRepository postRepository;

  @Autowired
  FanPostService fanPostService;
  Post post, invalidPost;
  SavePostDTO savePostDTO, invalidPostDTO;

  @BeforeEach
  public void beforeEach() {
    fanPostService = new FanPostService(postRepository);
    post = Post.builder()
        .subject("XH")
        .content("hello XH")
        .teamId(1)
        .fanId(1)
        .build();

    savePostDTO = SavePostDTO.builder()
        .subject("Xdinary heroes, close beta test.")
        .content("is completed! instead! is published")
        .fanId(1)
        .teamId(1).build();

    invalidPostDTO = SavePostDTO.builder()
        .subject("")
        .content("is completed! instead! is published")
        .fanId(1)
        .teamId(1).build();

    invalidPost = Post.builder()
        .id(-1)
        .subject("XH")
        .content("hello XH")
        .build();
  }

  @Test
  public void 게시글_등록() {
    Post result = fanPostService.save(savePostDTO);
    long id = result.getId();
    assertTrue(postRepository.findById(id).isPresent());
    Assertions.assertThat(savePostDTO.getSubject()).isEqualTo(result.getSubject());
  }

  @Test
  public void 전체_게시글_조회() {
    List<Post> posts = fanPostService.getPosts();
    Assertions.assertThat(posts.size()).isGreaterThan(0);
  }

  @Test
  public void 단일_게시글_조회() {
    long id = 2L;
    Post post = fanPostService.getPostEntity(id);
    Assertions.assertThat(post.getId()).isEqualTo(id);
  }

  @Test
  public void 게시글_수정() {
    long id = 2L;

    SavePostDTO updated = SavePostDTO.builder()
        .id(id)
        .subject("XH Consert")
        .content("is this weekend")
        .fanId(1)
        .teamId(1)
        .build();

    fanPostService.update(updated);
    Post saved = postRepository.findById(id).get();
    Assertions.assertThat(saved.getSubject()).isEqualTo(updated.getSubject());
  }


  @Test
  public void 포스트_객체_생성_날짜를_저장한다(){
    LocalDateTime now = LocalDateTime.of(2024,9,10,0,0,0);

    Post result = fanPostService.save(savePostDTO);
    long id = result.getId();

    result = postRepository.findById(id).get();
    Assertions.assertThat(result.getCreatedAt()).isAfter(now);
    Assertions.assertThat(result.getUpdatedAt()).isAfter(now);
//    Assertions.assertThat(result.isDeleted()).isEqualTo(false);
  }

  @Test
  public void 게시글_삭제() {
    long id = 2L;
    assertTrue(postRepository.findById(id).isPresent());
    fanPostService.delete(id);
    assertTrue(postRepository.findById(id).isEmpty());
  }

  /*
  1. 존재하지 않는 사용자일 때
  2. 관련 아티스트를 팔로하지 않았을 때
  3. (수정 시) 게시물 작성자와 수정하려는 사람이 일치하지 않을 때
  4. 존재하지 않는 포스트에 접근하려고 할 때
   */
  @Test
  public void 포스팅_작성자가_없습니다() {
    long id = -1L;
    Exception e = assertThrows(NoSuchElementException.class, () -> {
      fanPostService.getPostEntity(id);
    });
  }
}