package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Animal {
    String name;
    String color;
    String home;
    Integer children;

    public String sound(){
        return "animal sound";
    }
}
