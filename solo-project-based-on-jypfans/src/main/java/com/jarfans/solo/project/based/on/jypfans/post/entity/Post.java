package com.jarfans.solo.project.based.on.jypfans.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.springframework.data.annotation.Immutable;
import org.springframework.stereotype.Repository;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="post")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long teamId;
  private long fanId;
  private String subject;
  private String content;
  private int heart;


}


