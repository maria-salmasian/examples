package com.example.demo.service;

import com.example.demo.entity.Animal;
import com.example.demo.entity.Flamingo;
import com.example.demo.entity.Lion;
import com.example.demo.entity.Panda;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoService {
    private Map<String, Animal> zoo;


    public DemoService() {
        this.zoo = new HashMap<>();
    }

    public Animal getAnimal(String name) {
        if (name != null && zoo.containsKey(name))
        return zoo.get(name);
        else throw new RuntimeException("null name");
    }

    public Animal addAnimal(Animal animal) {
        if (animal != null)
        {if (animal.getName().equalsIgnoreCase("lion")) {
            Animal animal1 = new Lion();
            return zoo.put(animal.getName(), animal1);}

        }
        if (animal.getName().equalsIgnoreCase("flamingo")) {
            Animal animal1 = new Flamingo();
            return zoo.put(animal.getName(), animal1);
        }
        if (animal.getName().equalsIgnoreCase("panda")) {
            Animal animal1 = new Panda();
            return zoo.put(animal.getName(), animal1);
        }
        else throw new RuntimeException("animal not found");

    }

    public Animal updateAnimal(String name, Animal animal){
        Animal xAnimal =  zoo.get(name);
        if ( xAnimal != null){
            xAnimal.setChildren(animal.getChildren());
            xAnimal.setHome(animal.getHome());
            xAnimal.setName(animal.getName());
            xAnimal.setColor(animal.getColor());
            return zoo.put(name, animal);
        }
        else throw new RuntimeException("animal not found");


    }

    public Animal deleteAnimal(String name){

        if (name!= null)return zoo.remove(name);
        else throw new RuntimeException("name not found");
    }

}
