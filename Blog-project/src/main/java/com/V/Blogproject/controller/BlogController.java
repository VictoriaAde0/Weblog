package com.V.Blogproject.controller;
import com.V.Blogproject.Dto.BlogDto;
import com.V.Blogproject.service.BlogService;
import org.springframework.web.bind.annotation.*;



    @RestController
    @RequestMapping("/api")
    public class BlogController {


        private final BlogController BlogService;

        public BlogController(BlogController BlogService) {
            this.BlogService = BlogService;
        }


        @PostMapping("/Blog/create")
        public Object createBlog(@RequestBody BlogController BlogDTO) {
            return BlogService.createBlog(BlogDTO);
        }

        @GetMapping("/Blog")
        public Object getBlog() {
            return BlogService.getBlog();
        }


        @PutMapping("Blog/{id}")
        public Object updateBlog(@RequestBody BlogDto blogDto, @PathVariable long id) {
            return BlogService.updateBlog(blogDto, id);
        }


        @DeleteMapping("/Blog/{id}")
        public Object deleteBlog(@PathVariable long id) {
            return BlogService.deleteBlog(id);
        }
}

