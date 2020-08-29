package com.example.web.board;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Component

public class BoardEntity {
    private String id, pw, title, content;
    @Builder
    public BoardEntity(String id, String pw, String title, String content) {
        this.id = id;
        this.pw = pw;
        this.title = title;
        this.content = content;
    }

}
