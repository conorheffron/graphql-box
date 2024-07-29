package com.graphql.box.intro.controller;

import com.graphql.box.intro.dto.Author;
import com.graphql.box.intro.dto.Post;
import com.graphql.box.intro.dao.PostDao;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    private final PostDao postDao;

    public AuthorController(PostDao postDao) {
        this.postDao = postDao;
    }

    @SchemaMapping
    public List<Post> posts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
