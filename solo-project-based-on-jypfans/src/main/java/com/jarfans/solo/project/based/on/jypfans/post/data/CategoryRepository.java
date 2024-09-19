package com.jarfans.solo.project.based.on.jypfans.post.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  Category findByCategory(String category);
}
