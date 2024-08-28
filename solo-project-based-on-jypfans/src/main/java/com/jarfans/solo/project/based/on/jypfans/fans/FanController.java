package com.jarfans.solo.project.based.on.jypfans.fans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanController {
  @GetMapping("/hello")
  public @ResponseBody String greeting(){
    return "hello XD";
  }

}
