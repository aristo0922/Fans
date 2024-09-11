package com.jarfans.solo.project.based.on.jypfans.comment;

import com.jarfans.solo.project.based.on.jypfans.comment.data.SaveCommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {
  private final CommentService commentService;

  @Autowired
  public CommentController(CommentService commentService){
    this.commentService = commentService;
  }

//  @PostMapping("/")
//  public void saveComment(@RequestBody SaveCommentDTO comment){
//    commentService.upload(comment);
//  }

}
