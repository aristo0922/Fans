package com.jarfans.solo.project.based.on.jypfans.fans;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = FanController.class)
public class FanControllerTest {
  @Autowired
  private MockMvc mockMvc;


  @Test
  public void greetingShouldReturnDefaultMessage() throws Exception{
    String hello="hello";
    mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
        .andExpect(status().isOk())
        .andExpect(content().string(containsString(hello)));
  }

}