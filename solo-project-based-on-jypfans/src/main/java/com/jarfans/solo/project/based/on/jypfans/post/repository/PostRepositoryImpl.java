package com.jarfans.solo.project.based.on.jypfans.post.repository;

import com.jarfans.solo.project.based.on.jypfans.post.entity.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepositoryImpl implements PostRepository{
  public Post save(Post post){
    return post;
  }

  public void findById(){

  }

  public void findAllById(){

  }

  public void update(){

  }


}
