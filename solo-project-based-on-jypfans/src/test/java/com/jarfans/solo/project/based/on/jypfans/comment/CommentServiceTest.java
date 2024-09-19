package com.jarfans.solo.project.based.on.jypfans.comment;

import static org.junit.jupiter.api.Assertions.*;

import com.jarfans.solo.project.based.on.jypfans.comment.data.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class CommentServiceTest {
  @Autowired
  CommentRepository commentRepository;

  @Autowired
  CommentService commentService;



}