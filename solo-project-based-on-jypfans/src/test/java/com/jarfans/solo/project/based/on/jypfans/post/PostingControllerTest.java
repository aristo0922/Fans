package com.jarfans.solo.project.based.on.jypfans.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/* @WebMvcTest
* Web(Spring MVC)에 집중할 수 있는 어노테이션
* @SpringBootTest는 모든 빈을 로드한다.
* 따라서 Controller 레이어만 테스트 하고 싶다면 @WebMvcTest를 사용하는 것이 좋다.
* 스캔 대상
1. @Controller
2. @ControllerAdvice
3. @JsonComponent
4. Converter / GenericConverter
5. Filter
6. WebSecurityConfigurerAdapter
7. WebMvcConfigurer
8. HandlerMethodArgumentResolver
* */
@WebMvcTest(PostingController.class)
@AutoConfigureMockMvc
public class PostingControllerTest {

  /* use Spring’s MockMvc
  and ask for that to be injected for you
  by using the @AutoConfigureMockMvc annotation on the test case.
   * */
  @Autowired
  private MockMvc mockMvc;

  Post postInfo = Post.builder()
      .subject("XDinery Heroes")
      .content("We are All Heroes")
      .build();

  @BeforeEach
  public void setUp() {
  }

  public void 게시글_작성하기() throws Exception {
    mockMvc.perform(
            MockMvcRequestBuilders.post("/api/v1/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content(getContent(postInfo)))
        .andExpect(status().isOk());
  }

  public void 게시글_수정하기() throws Exception {
    mockMvc.perform(
        MockMvcRequestBuilders.patch("/api/v1/post")
            .contentType(MediaType.APPLICATION_JSON)
            .content(getContent(postInfo))
    ).andExpect(status().isOk());
  }

  public void 게시글_목록조회() throws Exception{
    mockMvc.perform(
        MockMvcRequestBuilders.get("/api/v1/post/list")
            .contentType(MediaType.APPLICATION_JSON)
    ).andExpect(status().isOk());

  }

  public void 게시글_조회() throws Exception{
    mockMvc.perform(
        MockMvcRequestBuilders.get("/api/v1/post/1")
            .contentType(MediaType.APPLICATION_JSON)
            .content(getContent(postInfo))
    ).andExpect(status().isOk());
  }

  private String getContent(Post postInfo) throws JsonProcessingException {
    return new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(postInfo);
  }

}