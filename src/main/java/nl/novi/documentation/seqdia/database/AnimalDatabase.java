package nl.novi.documentation.seqdia.database;

import nl.novi.documentation.seqdia.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDatabase {

    private List<Animal> animalList = new ArrayList<>();

    public AnimalDatabase() {
        animalList.add(new Animal("Hond"));
        animalList.add(new Animal("Kat"));
        animalList.add(new Animal("Parkiet"));
        animalList.add(new Animal("Giraffe"));
        animalList.add(new Animal("Olifant"));
        animalList.add(new Animal("Leeuw"));
        animalList.add(new Animal("Beer"));
        animalList.add(new Animal("Eekhoorn"));
        animalList.add(new Animal("Eenhoorn"));
        animalList.add(new Animal("Paard"));
        animalList.add(new Animal("Muis"));
    }

    public List<Animal> getAllAnimals() {
        return animalList;
    }
}
