package com.example.crudboard.domain.post;

import com.example.crudboard.common.dto.SearchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    // 게시글 저장
    void save(PostRequest params);

    // 게시글 리스트
    List<PostResponse> findAll(SearchDto params);

    // 순차글 리스트
    List<PostResponse> findAllLinear(SearchDto params);

    // 게시글 조회
    PostResponse findById(Long id);

    // 조회수 증가
    public boolean addViewer(final Long id);

    // 게시글 수정
    void update(PostRequest params);

    // 게시글 삭제
    void deleteById(Long id);

    // 게시글 수
    int count(SearchDto params);

}
