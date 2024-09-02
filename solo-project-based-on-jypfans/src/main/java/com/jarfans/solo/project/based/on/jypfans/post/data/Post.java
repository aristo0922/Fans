package com.jarfans.solo.project.based.on.jypfans.post.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Builder
@Getter
@Table(name = "post")
@RequiredArgsConstructor
@AllArgsConstructor
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "team_id")
  private long teamId;
  @Column(name = "fan_id")
  private long fanId;
  @Column(length = 100)
  private String subject;
  @Column(length = 500)
  private String content;

  public void setId(long id){
    this.id = id;
  }
}
