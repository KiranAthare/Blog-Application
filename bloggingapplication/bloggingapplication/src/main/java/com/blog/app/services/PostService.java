package com.blog.app.services;

import java.util.List;

import com.blog.app.payloads.PostResponse;
import com.blog.app.payloads.PostDto;

public interface PostService {

	//Create post
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);	
	
	//Update Post
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//Delete Post by Id
	void deletePost(Integer postId);
	
	//Get All Post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//Get Post by PostId
	PostDto getPostById(Integer postId);
	
	//Get post by Category 
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//Get post by User
	List<PostDto> getPostByUser(Integer userId);
	
	//Search Post
	List<PostDto> searchPosts(String keyword);
	
	
}
