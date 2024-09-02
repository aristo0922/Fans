package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
  private final PostRepository postRepository;

  @Autowired
  public PostService(PostRepository repository){
    this.postRepository = repository;
  }

  public void upload(Post post){
    postRepository.save(post);
    long id = post.getId();
    Optional<Post> result = postRepository.findById(id);
    if(result == null) throw new IllegalStateException("생성되지 않았습니다.");
  }

  public List<Post> findAllPosts(){
    return postRepository.findAll();
  }

  public Optional<Post> findPostById(long id){
    return postRepository.findById(id);
  }
}

