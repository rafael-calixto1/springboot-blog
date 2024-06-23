package com.dsenvolvendosistemas.blogServer.service;

import com.dsenvolvendosistemas.blogServer.entity.Post;
import com.dsenvolvendosistemas.blogServer.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post){
        post.setLikeCount(0);
        post.setViewCount(0);
        post.setDate(new Date());

        return postRepository.save(post);
    }
}
