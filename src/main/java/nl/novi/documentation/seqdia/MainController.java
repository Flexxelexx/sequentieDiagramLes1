package nl.novi.documentation.seqdia;

import nl.novi.documentation.seqdia.database.AnimalDatabase;
import nl.novi.documentation.seqdia.model.Animal;

import java.util.List;
import java.util.Random;

public class MainController {

    private Random rand = new Random();

    public String processInput(String userInput) {
        if(isValidInput(userInput)) {
            int input = Integer.parseInt(userInput);
            switch (input) {
                case 0:
                    return throwDice();
                case 1:
                    return randomAnimalName();
                case 2:
                    return randomBelowHundred();
            }
        }
        return "This is an error message";
    }

    private String throwDice() {

        int upperbound = 6;
        int randomNumber = rand.nextInt(upperbound) + 1;

        return "Er is " + randomNumber + " gegooid.";
    }

    private String randomAnimalName() {
        AnimalDatabase animalDatabase = new AnimalDatabase();
        List<Animal> animals = animalDatabase.getAllAnimals();

        Animal animal = animals.get(rand.nextInt(animals.size()));

        return "We hebben een " + animal.getName() + " in de database gevonden.";
    }

    private String randomBelowHundred() {

        int upperbound = 100;
        int randomNumber = rand.nextInt(upperbound);

        return "Een willekeurig getal onder de 100: " + randomNumber;
    }

    private boolean isValidInput(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
