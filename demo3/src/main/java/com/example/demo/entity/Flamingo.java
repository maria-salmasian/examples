package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Flamingo extends  Animal{
    @Override
    public String sound() {
        return "squawk";
    }
}
