package com.jarfans.solo.project.based.on.jypfans.post.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class SavePostDTO {
  private long id;
  private String subject;
  private String content;
  private long fanId;
  private long teamId;
}
