package com.jarfans.solo.project.based.on.jypfans.comment;

import static org.junit.jupiter.api.Assertions.*;

import com.jarfans.solo.project.based.on.jypfans.comment.data.CommentRepository;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

  @Before
  public void before(){

  }

  // create
  @Test
  @DisplayName("댓글 생성 성공")
  public void successComment(){

  }
  @Test
  @DisplayName("댜댓글 생성 성공")
  public void successChildComment(){

  }

  @Test
  @DisplayName("댓글 생성 실패- 사용자 null")
  public void failCommentByUserInfo(){

  }

  @Test
  @DisplayName("댓글 생성 실패- content null")
  public void failComentByEnptyContent(){

  }

  @Test
  @DisplayName("댓글 생성 실패- invalid post")
  public void failCommentByInvalidPost(){

  }

  // update
  @Test
  @DisplayName("댓글 수정 성공")
  public void successUpdateComment(){

  }

  @Test
  @DisplayName("댓글 수정 실패- 불변정보 수정 시도- 작성자, postId, parentComment")
  public void failUpdateByImmutableValue(){

  }

  @Test
  @DisplayName("댓글 수정 실패- 삭제된 댓글 수정")
  public void failUpdateByNotExist(){

  }

  @Test
  @DisplayName("댓글 수정 실패- 타인의 댓글 수정")
  public void failUpdateByAuth(){

  }


//  read
  @Test
  @DisplayName("댓글 조회 성공")
  public void successReadComment(){

  }

  @Test
  @DisplayName("댓글 조회 실패- 부모 댓글 삭제")
  public void failReadByParentDeleted(){

  }

  @Test
  @DisplayName("부모 댓글 조회 성공 - 댓글 순서 보장 확인")
  public void successGetParent(){

  }

  @Test
  @DisplayName("최종 수정일 확인")
  public void getTimeAsLastUpdate(){

  }


  /* 남이 작성한 댓글은 삭제할 수 없다.
 삭제하는 댓글 아래로 연결된 자식 댓글들은 마찬가지로 삭제된 것으로 간주한다.*/
  // delete

  @Test
  @DisplayName("댓글 삭제 성공")
  public void successDelet(){

  }

  @Test
  @DisplayName("댓글 삭제 실패- 타인의 댓글 접근")
  public void failDeleteByAuth(){

  }

  @Test
  @DisplayName("자기와 자식 댓글까지 삭제")
  public void deleteWithChildren(){

  }

}