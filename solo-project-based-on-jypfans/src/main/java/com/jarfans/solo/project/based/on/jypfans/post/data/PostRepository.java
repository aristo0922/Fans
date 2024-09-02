package com.jarfans.solo.project.based.on.jypfans.post.data;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository {
  void save(Post post);
  Optional<Post> findById(long id);
  List<Post> findAll();
  void clearStore();
}
