package com.example.crudboard.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // 게시글 목록 페이지
    @GetMapping("/post/list.do")
    public String openPostList(Model model) {
        List<PostResponse> posts = postService.findAllPost();
        model.addAttribute("posts", posts);
        return "post/list";
    }

    // 글쓰기 페이지
    @GetMapping("/post/write.do")
    public String openPostWrite(@RequestParam(value="id", required = false) final Long id, Model model) {
        if(id != null){
            PostResponse post = postService.findPostById(id);
            model.addAttribute("post", post);
        }

        return "post/write";
    }

    // 글쓰기 저장
    @PostMapping("/post/save.do")
    public String savePost(final PostRequest params){
        if(params.getIsNotice() == null){
            params.setIsNotice(false);
        }
        postService.savePost(params);
        return "redirect:/post/list.do";
    }

    // 글 읽기
    @GetMapping("/post/view.do")
    public String openPostView(@RequestParam final Long id, Model model){
        PostResponse post = postService.findPostById(id);
        model.addAttribute("post", post);
        return "post/view";
    }
}