package com.jarfans.solo.project.based.on.jypfans.user;

import static org.junit.jupiter.api.Assertions.*;

import com.jarfans.solo.project.based.on.jypfans.user.data.NewUser;
import com.jarfans.solo.project.based.on.jypfans.user.data.User;
import com.jarfans.solo.project.based.on.jypfans.user.data.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {
  @Autowired
  private UserService userService;

  @Autowired
  private UserRepository userRepository;

  @BeforeEach
  void clean(){
    userRepository.deleteAll();
  }

//  @Test
//  @DisplayName("글 작성")
//  void test1() {
//    //given
//    NewUser newUser = NewUser.builder()
//        .getUserId("dkfud2121")
//        .getName("JAR")
//        .build();
//
//    // when
//    userService.write(newUser);
//
//    // then
//    assertEquals(1L, userRepository.count());
//
//    User user = userRepository.findAll().get(0);
//    assertEquals("dkfud2121", user.getUserId());
//    assertEquals("JAR", user.getName());
//  }
}