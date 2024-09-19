package com.jarfans.solo.project.based.on.jypfans.subscribe.data;


import com.jarfans.solo.project.based.on.jypfans.user.data.Team;
import com.jarfans.solo.project.based.on.jypfans.user.data.User;
import com.jarfans.solo.project.based.on.jypfans.util.BaseTimeEntity;
import jakarta.persistence.CascadeType;
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
import lombok.RequiredArgsConstructor;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "subscribe")
@Entity
public class Subscribe extends BaseTimeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, unique = true)
  private long id;

  @ManyToOne(cascade = CascadeType.REMOVE)
  @JoinColumn(name = "fan_id")
  private User fan;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;
}
