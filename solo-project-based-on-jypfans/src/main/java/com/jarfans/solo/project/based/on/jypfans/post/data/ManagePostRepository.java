package com.jarfans.solo.project.based.on.jypfans.post.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ManagePostRepository implements PostRepository{

  private HashMap<Long, Post> postRepository = new HashMap<>();
  private static long tempId = 0L;
  @Override
  public void save(Post post) {
    post.setId(tempId);
    postRepository.put(tempId++, post);
  }

  @Override
  public Optional<Post> findById(long id) {
    return Optional.ofNullable(postRepository.get(id));
  }

  @Override
  public List<Post> findAll() {
    return new ArrayList<>(postRepository.values());
  }

  @Override
  public void clearStore(){
    postRepository.clear();
  }
}
