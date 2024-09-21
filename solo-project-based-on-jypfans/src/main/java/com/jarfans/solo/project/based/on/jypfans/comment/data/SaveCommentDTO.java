package com.jarfans.solo.project.based.on.jypfans.comment.data;

import lombok.Getter;

@Getter
public class SaveCommentDTO {
  private long writerId;
  private long postId;
  private long parentComment;
  private String comment;
}
