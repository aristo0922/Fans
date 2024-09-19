package com.jarfans.solo.project.based.on.jypfans.comment.data;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.util.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

  @ManyToOne
  @JoinColumn(name="post_id", nullable = false)
  private Post postId;

  @ManyToOne
  @JoinColumn(name = "parent_commnt", referencedColumnName = "id")
  private Comment parentComment;

  @Column(length = 500, nullable = false)
  private Long content;
}


