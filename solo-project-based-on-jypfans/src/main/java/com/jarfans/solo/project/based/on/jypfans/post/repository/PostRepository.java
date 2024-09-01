package com.jarfans.solo.project.based.on.jypfans.post.repository;

import com.jarfans.solo.project.based.on.jypfans.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository{
  Post save(Post post);
  public void findById();
  public void findAllById();
  public void update();
}
