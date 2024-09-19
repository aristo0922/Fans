package com.jarfans.solo.project.based.on.jypfans.user.data;

import com.jarfans.solo.project.based.on.jypfans.util.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="user")
@Entity
public class User extends BaseTimeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name= " id", nullable = false, unique = true)
  private long id;

  @Column(name = "user_id", nullable = false, length = 30)
  private String userId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_id")
  private Team team;

  @Column(name = "password", nullable = false, length = 30)
  private String password;

  @Column(name = "name", nullable = false, length = 30)
  private String name;

  @Column(name = "nick_name", nullable = false, length = 30)
  private String nickName;

  @ManyToOne
  @JoinColumn(name = "type_id", nullable = false)
  private UserType type;

  @Column(name = "birth_day")
  private LocalDateTime birthDay;


}
