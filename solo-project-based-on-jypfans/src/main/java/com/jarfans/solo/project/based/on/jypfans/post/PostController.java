package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.SavePostDTO;
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
  private final FanPostService fanPostService;

  @Autowired
  public PostController(FanPostService fanPostService){
    this.fanPostService = fanPostService;
  }

  @PostMapping("/")
  public void uploadPost(@RequestBody SavePostDTO post){
    fanPostService.save(post);
  }

  @PatchMapping("/")
  public void updatePost(@RequestBody SavePostDTO post){
    fanPostService.update(post);
  }

  @GetMapping("/")
  public List<Post> getPostList(){
    return fanPostService.getPosts();
  }

  @GetMapping("/{id}")
  public Post findPosting(@PathVariable long id){
    return fanPostService.getPostEntity(id);
  }
}
