package com.example.web;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;

@Entity
@Component
@Getter
@Setter
public class MemberEntity {
    private String id, pw, name, adress;
    @Builder
    public MemberEntity(String id, String pw, String name, String address) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.adress = address;
    }


}
