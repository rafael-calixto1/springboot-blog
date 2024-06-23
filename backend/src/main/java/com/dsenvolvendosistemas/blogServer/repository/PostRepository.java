package com.dsenvolvendosistemas.blogServer.repository;

import com.dsenvolvendosistemas.blogServer.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
