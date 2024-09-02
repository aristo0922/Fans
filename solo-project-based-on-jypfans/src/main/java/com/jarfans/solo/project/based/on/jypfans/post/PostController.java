package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
  private final PostService postService;

  @Autowired
  public PostController(PostService postService){
    this.postService = postService;
  }

  @PostMapping("/api/v1/post")
  public void uploadPost(@RequestBody Post post){
    postService.upload(post);
  }
}
