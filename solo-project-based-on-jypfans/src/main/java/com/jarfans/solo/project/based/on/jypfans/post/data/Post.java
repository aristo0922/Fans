package com.jarfans.solo.project.based.on.jypfans.post.data;

import com.jarfans.solo.project.based.on.jypfans.util.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "post")
@Entity
public class Post extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, unique = true)
  private long id;

  @Column(name = "writer_id", nullable = false)
  private long writerId;

  @Column(length = 50, nullable = false)
  private String title;

  @Column(length = 300, nullable = false)
  private String content;

//  @ManyToOne
  private long category;

  @Column(name = "artist_id", nullable = false)
  private long artistId;

  public void update(String subject, String content) {
    this.title = subject;
    this.content = content;
  }
}
