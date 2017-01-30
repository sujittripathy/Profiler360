package com.hyperion.repository;

import com.hyperion.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{
}
