package com.example.web.Item;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    @PostMapping
    public void postItem() {};
    @GetMapping
    public void getItem() {};
    @PutMapping
    public void updateItem() {};
    @DeleteMapping
    public void deleteItem() {};

}
