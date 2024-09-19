package com.jarfans.solo.project.based.on.jypfans.comment.data;

import com.jarfans.solo.project.based.on.jypfans.util.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "comment")
@Entity
public class Comment extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "writer_id", nullable = false)
  private Long writerId;

  @Column(name = "post_id", nullable = false)
  private Long postId;

  @Column(name = "parent_commnt")
  private Long parentComment;

  @Column(length = 500, nullable = false)
  private Long content;
}


