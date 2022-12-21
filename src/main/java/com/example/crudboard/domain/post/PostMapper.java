package com.example.crudboard.domain.post;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    // 게시글 저장
    void save(PostRequest params);

    // 게시글 리스트
    List<PostResponse> findAll();

    // 게시글 조회
    PostResponse findById(Long id);

    // 게시글 수정
    void update(PostRequest params);

    // 게시글 삭제
    void deleteById(Long id);

    // 게시글 수
    int count();

}
