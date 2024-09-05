package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PostService {
  private final PostRepository postRepository;

  @Autowired
  public PostService(PostRepository repository){
    this.postRepository = repository;
  }

  public void save(Post post){
    postRepository.save(post);
    long id = post.getId();
    Optional<Post> result = postRepository.findById(id);
    if(!result.isPresent()) throw new IllegalStateException("생성되지 않았습니다.");
  }

  public Post upload(Post post){
    postRepository.save(post);
    long id = post.getId();
    Optional<Post> result = postRepository.findById(id);
    if(!result.isPresent()) throw new IllegalStateException("생성되지 않았습니다.");
    Post updated = result.get();
    updated.update(post.getSubject(), post.getContent());
    return updated;
  }

  public List<Post> getPosts(){
    return postRepository.findAll();
  }

  public Optional<Post> getPostEntity(long id){
    return postRepository.findById(id);
  }

  public void delete(long id){
    postRepository.deleteById(id);
  }
}

