//package com.jarfans.solo.project.based.on.jypfans.post;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
///* @WebMvcTest
//* Web(Spring MVC)에 집중할 수 있는 어노테이션
//* @SpringBootTest는 모든 빈을 로드한다.
//* 따라서 Controller 레이어만 테스트 하고 싶다면 @WebMvcTest를 사용하는 것이 좋다.
//* 스캔 대상
//1. @Controller
//2. @ControllerAdvice
//3. @JsonComponent
//4. Converter / GenericConverter
//5. Filter
//6. WebSecurityConfigurerAdapter
//7. WebMvcConfigurer
//8. HandlerMethodArgumentResolver
//* */
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(controllers = PostController.class)
//public class PostControllerTest {
//  /* use Spring’s MockMvc
//  and ask for that to be injected for you
//  by using the @AutoConfigureMockMvc annotation on the test case.
//   * */
//  @Autowired
//  private MockMvc mvc;
//
//  @BeforeEach
//  public void setUp(){
//  }
//
//  @Test
//  public void helloTest(){
//
//  }
//
//}