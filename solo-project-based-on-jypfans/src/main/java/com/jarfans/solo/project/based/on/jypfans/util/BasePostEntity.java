package com.jarfans.solo.project.based.on.jypfans.util;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasePostEntity extends BaseTimeEntity{
  @Column(length = 100, nullable = false)
  private String subject;
  @Column(length = 500, nullable = false)
  private String content;

  public void update(String subject, String content) {
    this.subject = subject;
    this.content = content;
  }
}
