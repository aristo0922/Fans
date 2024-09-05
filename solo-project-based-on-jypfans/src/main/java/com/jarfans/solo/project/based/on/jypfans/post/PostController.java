package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/api/v1/post")
  public void getPostList(){
    postService.getPosts();
  }

  @GetMapping("/api/v1/post/{id}")
  public void findPosting(@PathVariable long id){
    postService.getPostEntity(id);
  }
}
