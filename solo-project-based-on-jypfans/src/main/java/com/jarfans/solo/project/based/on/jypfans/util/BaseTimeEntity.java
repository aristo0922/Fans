package com.jarfans.solo.project.based.on.jypfans.util;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
  @Column(name = "created_at")
  @CreatedDate
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  @LastModifiedDate
  private LocalDateTime updatedAt;

  @Column(name = "is_deleted")
  private boolean isDeleted = false;
}
