package com.equipodiscreto.IcesiPalace.Post;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.equipodiscreto.IcesiPalace.Dto.PostDTO;
import com.equipodiscreto.IcesiPalace.Post.enums.Category;
import com.equipodiscreto.IcesiPalace.Post.interfaces.PostServiceInterface;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostServiceInterface {

    private PostRepository postRepository;

    @Override
    public PostMessage addPost(PostDTO postDTO) {
        Post post = new Post(
                postDTO.getTitle(),
                postDTO.getDescription(),
                postDTO.getUser_email(),
                postDTO.getImage(),
                LocalDateTime.now(),
                Category.valueOf(postDTO.getCategory()));
        postRepository.save(post);
        return PostMessage.builder()
                .posts(List.of(post))
                .status(true)
                .build();
    }

    @Override
    public PostMessage getPost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPost'");
    }

    @Override
    public PostMessage deletePost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePost'");
    }

    @Override
    public PostMessage updatePost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePost'");
    }

    @Override
    public PostMessage getPosts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPosts'");
    }

    @Override
    public PostMessage getPostsByUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostsByUser'");
    }

    @Override
    public PostMessage getPostsByCategory() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostsByCategory'");
    }

    @Override
    public List<Post> listAllPost() {
        return postRepository.findAll();
    }

}