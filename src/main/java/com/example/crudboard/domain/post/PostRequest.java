package com.example.crudboard.domain.post;

public class PostRequest {

    private Long id; // 게시글 번호
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private Boolean is_notice; // 공지글 여부

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Boolean getIs_notice() {
        return is_notice;
    }

    public void setIs_notice(Boolean is_notice) {
        this.is_notice = is_notice;
    }
}
