package com.jarfans.solo.project.based.on.jypfans.comment;

import com.jarfans.solo.project.based.on.jypfans.comment.data.CommentRepository;
import com.jarfans.solo.project.based.on.jypfans.comment.data.SaveCommentDTO;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
  private final CommentRepository commentRepository;

  public CommentService(CommentRepository commentRepository){
    this.commentRepository = commentRepository;
  }

  public void comment(SaveCommentDTO saveRequest){

  }

  public void update(){

  }

  public void read(){

  }

  public void delete(){

  }
}
