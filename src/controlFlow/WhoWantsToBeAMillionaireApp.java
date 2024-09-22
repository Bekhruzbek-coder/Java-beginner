package controlFlow;

import java.util.Scanner;

public class WhoWantsToBeAMillionaireApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Who is named as the inventor of the light bulb?");
        System.out.println("A: Tomas Edison.");
        System.out.println("B: Marie Curie.");
        System.out.println("C: Nikola Tesla.");
        System.out.println("D: Robert Oppenheimer.");
        System.out.println("==============================================");
        System.out.println();

        System.out.printf("What is your answer: ");
        String name = scan.next();

        switch(name){
            case "A":
                System.out.println("You were right. You won $1.");
                break;
            case "B":
            case "C":
            case "D":
                System.out.println("Sorry, the right answer is Tomas Edison. Thanks you for coming.");
                break;
            default:
                System.out.println("Not defined, enter another answer.");
        }
    }
}
