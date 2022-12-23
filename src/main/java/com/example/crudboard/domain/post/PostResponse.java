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
    private Boolean isNotice; // 공지글 여부
    private Boolean isDeleted; // 삭제 여부
    private LocalDateTime createdDate; // 작성일시
    private LocalDateTime modifiedDate; // 수정일시

}
