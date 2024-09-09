package com.jarfans.solo.project.based.on.jypfans.post.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Builder
@Getter
@Table(name = "post")
@RequiredArgsConstructor
@AllArgsConstructor
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, unique = true)
  private long id;

  @Column(name = "team_id", nullable = false)
  private long teamId;
  @Column(name = "fan_id", nullable = false)
  private long fanId;
  @Column(length = 100, nullable = false)
  private String subject;
  @Column(length = 500, nullable = false)
  private String content;

  @Column(name = "created_at")
  private LocalDate createdAt;

  @Column(name = "updated_at")
  @LastModifiedDate
  private LocalDate updatedAt;

  @Column(name = "deleted_at")
  private LocalDate deletedAt;

//  public void setId(long id){
//    this.id = id;
//  }

  public void update(String subject, String content){
    this.subject = subject;
    this.content = content;
  }
}
