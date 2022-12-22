package com.example.crudboard.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long id; // 게시글 번호
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private String password; // 비밀번호
    private int viewer; // 조회수
    private Boolean is_notice; // 공지글 여부
    private Boolean is_deleted; // 삭제 여부
    private LocalDateTime created_date; // 작성일시
    private LocalDateTime modified_date; // 수정일시

}
