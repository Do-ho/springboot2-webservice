package com.skykimpro.book.springboot.web.dto;

import com.skykimpro.book.springboot.domain.posts.Posts;
import lombok.Getter;
import org.springframework.boot.web.server.LocalServerPort;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
