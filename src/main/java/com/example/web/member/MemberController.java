package com.example.web.member;

import org.hibernate.annotations.OnDelete;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @PostMapping
    public void postMember() {}
    @GetMapping
    public void getMember() {}
    @PutMapping
    public void updateMember() {}
    @DeleteMapping
    public void deleteMember() {}

}