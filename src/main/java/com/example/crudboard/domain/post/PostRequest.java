package com.example.crudboard.domain.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {

    private Long id; // 게시글 번호
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private String password; // 비밀번호
    private Boolean is_notice; // 공지글 여부

}
