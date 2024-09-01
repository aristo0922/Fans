package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.entity.Post;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/post")
public class PostingController {

  private final PostService postService;

  @PostMapping("")
  public void addPost(@NonNull @RequestBody Post postInfo){
    postService.addPost(postInfo);
  }

  @GetMapping("")
  public void findAll(){
    postService.findAll();

  }

  @PatchMapping("/{id}")
  public void update(@NonNull @RequestBody Post postInfo){
    postService.update(postInfo);
  }

  @DeleteMapping("/{id}")
  public void delete(){
    postService.delete();
  }

}
