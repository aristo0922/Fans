package com.jarfans.solo.project.based.on.jypfans.post;

import lombok.Builder;
import org.springframework.stereotype.Repository;

@Builder
@Repository
public class Post {
  private long id;
  private int like;
  private String subject;
  private String content;
  private long commentId;


}
