package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.entity.Post;
import com.jarfans.solo.project.based.on.jypfans.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {

  private final PostRepository postRepository;
  public void addPost(Post postInfo){

  }

  public void findAll(){}

  public void update(Post postInfo){}

  public void delete(){}

}
