package com.example.crudboard.domain.post;

import com.example.crudboard.common.dto.SearchDto;
import com.example.crudboard.paging.PagingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/") // 메인이 없기 때문에 바로 리스트 페이지로 리다이렉트
    public String redirectList() {
        return "redirect:/post/list.do";
    }

    // 게시글 목록 페이지
    @GetMapping("/post/list.do")
    public String openPostList(@ModelAttribute("params") final SearchDto params, Model model) {
        PagingResponse<PostResponse> response = postService.findAllPost(params);
        model.addAttribute("response", response);
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
        //return "redirect:/post/view.do?id="+params.getId();
    }

    // 글 읽기
    @GetMapping("/post/view.do")
    public String openPostView(@RequestParam final Long id, Model model){
        postService.addViewer(id); // 조회수 증가 -> DB에 조회수 값을 미리 증가시킨 후, 클라이언트에게 보여질 post 객체를 생성한다.
        PostResponse post = postService.findPostById(id);
        model.addAttribute("post", post);
        return "post/view";
    }

    // 글 수정
    @PostMapping("/post/update.do")
    public String updatePost(final PostRequest params){
        if(params.getIsNotice() == null){
            params.setIsNotice(false);
        }
        postService.updatePost(params);
        return "redirect:/post/list.do";
        //return "redirect:/post/view.do?id="+params.getId();
    }

    // 글 삭제
    @PostMapping("/post/delete.do")
    public String deletePost(@RequestParam final Long id) {
        postService.deletePost(id);
        return "redirect:/post/list.do";
    }
}
