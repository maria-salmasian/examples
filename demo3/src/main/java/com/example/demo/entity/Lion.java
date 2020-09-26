package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Lion extends Animal {
    @Override
    public String sound() {
        return "rawr";
    }
}
