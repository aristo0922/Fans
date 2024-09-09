package com.jarfans.solo.project.based.on.jypfans.post;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.PostRepository;
import com.jarfans.solo.project.based.on.jypfans.post.data.SavePostDTO;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PostService {
  private final PostRepository postRepository;
  
  public PostService(PostRepository repository){
    this.postRepository = repository;
  }

  public Post save(SavePostDTO request){
    Post post = Post.builder()
        .subject(request.getSubject())
        .content(request.getContent())
        .fanId(request.getFanId())
        .teamId(request.getTeamId())
        .build();
    return postRepository.save(post);
  }

  public Post update(SavePostDTO updated){
    Post post = new Post().builder()
        .id(updated.getId())
        .subject(updated.getSubject())
        .content(updated.getContent())
        .teamId(updated.getTeamId())
        .fanId(updated.getFanId())
        .build();
    return postRepository.save(post);
  }

  public List<Post> getPosts(){
    return postRepository.findAll();
  }

  public Post getPostEntity(long id){
    Optional<Post> result = postRepository.findById(id);
    if(result.isEmpty()){
      throw new NoSuchElementException("해당 id 를 가진 객체가 존재하지 않습니다.");
    }
    return result.get();
  }

  public void delete(long id){
    postRepository.deleteById(id);
  }
}

