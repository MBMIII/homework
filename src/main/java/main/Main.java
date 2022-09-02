package main;

import animal.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Jack", 3));
        animals.add(new Cat("Charlie", 2));
        animals.add(new Cow("Molly", 8));
        animals.add(new AngryDog("Angry Dog Bark", 1));
        animals.forEach(Animal::voice);
    }
}