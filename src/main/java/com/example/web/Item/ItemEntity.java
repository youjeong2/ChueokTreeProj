package com.example.web.Item;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Component
public class ItemEntity {
    private String id, name, price;

    @Builder
    public ItemEntity(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }


}
