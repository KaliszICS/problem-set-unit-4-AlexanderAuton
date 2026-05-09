/**
        * File: ProblemSet unit 4
        * Author: Alexander D. Auton
        * Date Created: April 20, 2026
        * Date Last Modified: April 27, 2026
        */

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Thank-a you so much for-to playing-a my game.");//lolSmg4MarioReference
//thisRideIsRightAboutToStart

        int rounds = 0;
        int plays=0;
        boolean validation = false;

        while (!validation) { 
            System.out.print("Input amount of plays you desire: ");

            if (scanner.hasNextInt()) { //#ofIntegerPlaysLeft
                plays = scanner.nextInt();
                if (plays > 0) {
                    validation = true;
                } else {
                    System.out.println("Invalid Input!");
                }
            } else {
                System.out.println("Invalid Input!");
                scanner.next();
            }
        }

        int score = 0;

        for (int i = 1; i <= plays; i++) {
            System.out.println("\nPlays" + i + ":");

            int selection = 0;
            boolean greatSelection = false;//variableNameIsNotSaidByDentistsOrDoctorsOrTeachersButByTheGuyAtTheLiquorStore

            while (!greatSelection) {  
                System.out.println("\nPlease select High, Low or Even:");//showcases user selection
                System.out.println("1. High (11 to 20)");
                System.out.println("2. Low (0 to 9)");
                System.out.println("3. Even (10)");//thisMakesItAllWork

                if (scanner.hasNextInt()) {
                    selection = scanner.nextInt();
                    if (selection >= 1 && selection <= 3) {
                        greatSelection = true;
                    } else {
                        System.out.println("\nInvalid Input!");
                    }
                } else {
                    System.out.println("\nInvalid Input!");
                    scanner.next();
                }
            }

            int num = random.nextInt(21);

            boolean rightOn = false; //variableNameIsABillAndTedReference

            if (selection == 1 && num >= 11 && num <= 20) {
                rightOn = true;
            } else if (selection == 2 && num >= 0 && num <= 9) {
                rightOn = true;
            } else if (selection == 3 && num == 10) {
                rightOn = true;
            }
            
            // if (rightOn = true){
            //     return "The number was" + num+ ". You were" + rightOn "correct"
                
            // }
                
            //     else {
            //         "The number was" + num+ ". You were" + rightOn "incorrect"
                    
            //     }

            if (rightOn) {
                score = score + 1;
            }

            System.out.println("Current Score: " + score);
        }

        System.out.println("\nTotal Score: " + score);

        if (score >= plays / 2.0) {
            System.out.println("Congratulations you got " + score + " out of " + plays + " rounds right!");
        } else {
            System.out.println("Better luck next time! You got " + score + " out of " + plays + ".");
        }
        //uRWinar(impossibleQuizReferenceLol)
    }
    //wooIDidItWithoutBrainOrComputerCrashing.Mp4
}

