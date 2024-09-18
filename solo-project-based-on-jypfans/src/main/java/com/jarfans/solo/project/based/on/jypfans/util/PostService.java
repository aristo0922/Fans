package com.jarfans.solo.project.based.on.jypfans.util;

import com.jarfans.solo.project.based.on.jypfans.post.data.Post;
import com.jarfans.solo.project.based.on.jypfans.post.data.SavePostDTO;
import java.util.List;

public interface PostService {

  public void save(SavePostDTO dto);

  public void update();

  public void delete(long id);

  public List<Post> getPosts();

  Post getPostEntity(long id);
}
