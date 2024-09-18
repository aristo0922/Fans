package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.PostRepository;
import com.jarfans.solo.project.based.on.jypfans.post.data.SavePostDTO;
import com.jarfans.solo.project.based.on.jypfans.util.PostService;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FanPostService implements PostService {

  private final PostRepository postRepository;

  public FanPostService(PostRepository repository) {
    this.postRepository = repository;
  }

  public void save(SavePostDTO request) {
    Post post = Post.builder()
        .subject(request.getSubject())
        .content(request.getContent())
        .fanId(request.getWriter())
        .teamId(request.getTeamId())
        .build();
    postRepository.save(post);
  }

  @Override
  public void update() {

  }

  public Post update(SavePostDTO updated) {
    Post post = postRepository.findById(updated.getId()).get();
    post.update(updated.getSubject(), updated.getContent());
    return postRepository.save(post);
  }

  @Override

  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public Post getPostEntity(long id) {
    Optional<Post> result = postRepository.findById(id);
    if (result.isEmpty()) {
      throw new NoSuchElementException("해당 id 를 가진 객체가 존재하지 않습니다.");
    }
    return result.get();
  }

  @Override
  public void delete(long id) {
    postRepository.deleteById(id);
  }
}

