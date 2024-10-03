//package com.jarfans.solo.project.based.on.jypfans.user.data;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.NoSuchElementException;
//import java.util.Optional;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//
//@SpringBootTest
//class UserRepositoryTest {
//  @Autowired
//  UserRepository userRepository;
//
//  @Test
//  @DisplayName("정상 회원 가입 케이스 테스트")
//  @Transactional
//  public void joinUser(){
//    // given
//    User insertUser = userRepository.save(User.builder()
//        .UserId("dkfud2121")
//        .password("hello")
//        .name("JAR")
//        .build());
//
//    // when
//    User saveUser = userRepository.findById(insertUser.getNo()).get();
//
//    // then
//    assertThat(insertUser).isEqualTo(saveUser);
//  }
//
//  @Test
//  @DisplayName("회원 이름으로 조회 테스트")
//  @Transactional
//  public void joinUser(){
//    // given
//    User insertUser = userRepository.save(User.builder()
//        .UserId("dkfud2121")
//        .password("hello")
//        .name("JAR")
//        .build());
//
//    // when
//    User saveUser = userRepository.findByName("JAR");
//
//    // then
//    assertThat(insertUser).isEqualTo(saveUser);
//  }
//
//  @Test
//  @DisplayName("없는 회원 조회 예외 테스트")
//  @Transactional
//  public void notExistUserFindTest(){
//    //given
//    Long userNo = 99L;
//
//    // when
//    Optional<User> findUser = userRepository.findById(userNo);
//
//    //then
//    assertThatThrownBy(() -> findUser.get())
//        .isInstanceOf(NoSuchElementException.class);
//
//  }
//
//
//}