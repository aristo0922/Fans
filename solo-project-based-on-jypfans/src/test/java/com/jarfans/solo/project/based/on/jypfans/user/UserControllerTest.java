//package com.jarfans.solo.project.based.on.jypfans.user;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.jarfans.solo.project.based.on.jypfans.user.data.NewUser;
//import com.jarfans.solo.project.based.on.jypfans.user.data.User;
//import com.jarfans.solo.project.based.on.jypfans.user.data.UserRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//// ㅇㅞㅂ 어플리케이션에서 컨트롤러를 테스트할 때 서블릿 컨테이너를 모킹하기 위해 사용
//// @WebMvcTes + @SpringBootTest : xxxx각자 서로의 MockMvc 를 모킹하여 충돌 발생
//@AutoConfigureMockMvc
//@SpringBootTest
//class UserControllerTest {
//  @Autowired
//  private ObjectMapper objectMapper; // object to json
//
//  @Autowired
//  private MockMvc mockMvc;
//
//  @Autowired
//  private UserRepository userRepository;
//
//  @BeforeEach
//  void clean(){
//    userRepository.deleteAll();
//  }
//
//  @Test
//  @DisplayName("/user 요청 시 DB에 값이 저장된다.")
//  void insertUser() throws Exception{
//    NewUser user = NewUser.builder()
//        .userId("dkfud2121")
//        .name("JAR")
//        .build();
//    String json = objectMapper.writeValueAsString(user);
//
//    mockMvc.perform(MockMvcRequestBuilders.post("/user")
//        .contentType(MediaType.APPLICATION_JSON)
//        .content(json)
//    )
//        .andExpect(status().isOk())
//        .andDo(print());
//    assertEquals(1L, userRepository.count());
//
//    User result = userRepository.findAll().get(0);
//    assertEquals("dkfud2121", result.getUserId());
//    assertEquals("JAR", result.getName());
//  }
//}