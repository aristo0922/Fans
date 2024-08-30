package com.jarfans.solo.project.based.on.jypfans.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Builder
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class Post {
  private long id;
  private long teamId;
  private long fanId;
  private String subject;
  private String content;
  private int like;


}
