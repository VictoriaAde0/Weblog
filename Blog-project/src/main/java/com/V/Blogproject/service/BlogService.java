package com.V.Blogproject.service;

import com.V.Blogproject.Dto.BlogDto;
import com.V.Blogproject.model.Blog;
import com.V.Blogproject.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }
    public Object createBlog(BlogDto blogDto) {
        Blog blog = new Blog();
        blog.setTitle(blogDto.getTitle());
        blog.setContent(blogDto.getContent());
        blog.setDatecreated(blogDto.getDatecreated());

        return blogRepository.save(blog);
    }
    public Object getBlog(BlogDto blogDto) {
        Blog blog = new Blog();
        blog.setTitle(blogDto.getTitle());
        blog.setContent(blogDto.getContent());
        blog.setDatecreated(blogDto.getDatecreated());

        return blogRepository.save(blog);
    }

    public Object updateBlog(BlogDto blogDto) {
        Blog blog = new Blog();
        blog.setId(blogDto.getId());
        blog.setTitle(blogDto.getTitle());
        blog.setContent(blogDto.getContent());
        blog.setDatecreated(blogDto.getDatecreated());
        blog.setDatecreated(blogDto.getDatecreated());

        return blogRepository.save(blog);
    }


    public Object deleteBlog(BlogDto blogDto) {
        Blog blog =new Blog();
        blog.setId(blogDto.getId());
        blog.setTitle(blogDto.getTitle());
        blog.setContent(blogDto.getContent());
        blog.setDatecreated(blogDto.getDatecreated());


        return blogRepository.save(blog);
    }
}

