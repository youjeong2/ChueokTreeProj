package com.example.web.board;
@RestController
@RequestMapping("/board")
public class BoardController {
    @PostMapping
    public void postBoard() {}
    @GetMapping
    public void getBoard() {}
    @UpdateMapping
    public void updateBoard() {}
    @DeleteMapping
    public void deleteBoard() {}
}
