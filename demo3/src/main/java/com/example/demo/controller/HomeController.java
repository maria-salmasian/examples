package com.example.demo.controller;

import com.example.demo.entity.Animal;
import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HomeController {
    private DemoService demoService;

    public HomeController() {
        this.demoService = new DemoService();
    }

    @GetMapping("/{name}")
    public Animal getAnimal(@PathVariable String name){
        return demoService.getAnimal(name);
    }


    @PostMapping("/")
    public Animal postAnimal(@RequestBody Animal animal){
        return demoService.addAnimal(animal);

    }

    @PutMapping ("/{name}")
    public Animal updateAnimal(@PathVariable String name, @RequestBody Animal animal){
        return demoService.updateAnimal(name, animal);

    }

    @DeleteMapping("/{name}")
    public Animal deleteAnimal(@PathVariable String name){
        return demoService.deleteAnimal(name);

    }

}
