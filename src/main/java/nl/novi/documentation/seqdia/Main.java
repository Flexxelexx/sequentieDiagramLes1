package nl.novi.documentation.seqdia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputScanner =  new Scanner(System.in);

        boolean running = true;

        printOptions();
        while (running) {
            String userInput = inputScanner.nextLine();
            System.out.println(processInput(userInput));
            printOptions();
        }
    }

    private static String processInput(String userInput) {
        MainController mainController = new MainController();
        return mainController.processInput(userInput);
    }

    private static void printOptions() {
        System.out.println("");
        System.out.println("Wat wilt u doen?");
        System.out.println("[0] Gooi een dobbelsteen");
        System.out.println("[1] Geef een willekeurige diernaam");
        System.out.println("[2] Willekeurig getal onder de 100");
    }

}
