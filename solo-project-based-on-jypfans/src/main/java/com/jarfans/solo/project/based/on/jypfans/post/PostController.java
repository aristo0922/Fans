package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
  private final PostService postService;

  @Autowired
  public PostController(PostService postService){
    this.postService = postService;
  }

  @PostMapping("/")
  public void uploadPost(@RequestBody Post post){
    postService.save(post);
  }

  @PatchMapping("/")
  public void updatePost(@RequestBody Post post){
    postService.update(post);
  }

  @GetMapping("/")
  public List<Post> getPostList(){
    return postService.getPosts();
  }

  @GetMapping("/{id}")
  public Post findPosting(@PathVariable long id){
    return postService.getPostEntity(id);
  }
}
