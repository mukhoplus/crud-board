package com.example.crudboard.domain.post;

import java.time.LocalDateTime;

public class PostResponse {

    private Long id; // 게시글 번호
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private int viewer; // 조회수
    private Boolean is_notice; // 공지글 여부
    private Boolean is_deleted; // 삭제 여부
    private LocalDateTime created_date; // 작성일시
    private LocalDateTime modified_date; // 수정일시

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

    public int getViewer() {
        return viewer;
    }

    public void setViewer(int viewer) {
        this.viewer = viewer;
    }

    public Boolean getIs_notice() {
        return is_notice;
    }

    public void setIs_notice(Boolean is_notice) {
        this.is_notice = is_notice;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date) {
        this.created_date = created_date;
    }

    public LocalDateTime getModified_date() {
        return modified_date;
    }

    public void setModified_date(LocalDateTime modified_date) {
        this.modified_date = modified_date;
    }
}
