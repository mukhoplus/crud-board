package com.example.crudboard.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    // 게시글 저장
    @Transactional
    public Long savePost(final PostRequest params){
        postMapper.save(params);
        return params.getId();
    }

    // 게시글 조회
    public PostResponse findPostById(final Long id){
        return postMapper.findById(id);
    }

    // 조회수 증가
    public boolean addViewer(final Long id) { return postMapper.addViewer(id); }

    // 게시글 목록 조회
    public List<PostResponse> findAllPost(){
        return postMapper.findAll();
    }

    // 게시글 수정
    @Transactional
    public Long updatePost(final PostRequest params) {
        postMapper.update(params);
        return params.getId();
    }

    // 게시글 삭제
    public Long deletePost(final Long id){
        postMapper.deleteById(id);
        return id;
    }

}
