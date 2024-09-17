/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Write a program that tests your ESP (extrasensory perception). 
1.	The program should read and display on the screen the names of colors from a 
	file colors.txt, so the player can select one of them names of colors.
2.	The program should randomly select the name of a color from list of words in a file colors.txt 
 	program should generate a random number from 1 to 16. For example, if the number is 1, the 
 	selected word is black, if the number is 2, the selected word is white, and so forth.
3.	 The program should ask the user to enter the color that the computer has selected. 
	After the user has entered his or her guess, the program should display the name of the randomly selected color. The program should repeat these 3 times and then display the number of times the user correctly guessed the selected color.
4.	The program that asks a student for his or her name, and then asks the student to 
	enter a sentence that describes him or herself and Due Date in a format MM/DD/YY. 
5.	Once the user has entered the requested input, the program should display this 
	information at the end of the program.
 * Due: 9/17/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Chandra S. Krishnan 
*/
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {

	public static void main(String[] args) throws IOException

	{
		Scanner keypad = new Scanner(System.in);
        Random random = new Random();
        File myFile = new File("colors.txt");
        Scanner inputFile = new Scanner(myFile);
        
        String color1 = inputFile.nextLine();	// color 1
        String color2 = inputFile.nextLine(); // color 2
        String color3 = inputFile.nextLine(); // color 3
        String color4 = inputFile.nextLine(); // color 4
        String color5 = inputFile.nextLine(); // color 5
        String color6 = inputFile.nextLine(); // color 6
        String color7 = inputFile.nextLine(); // color 7
        String color8 = inputFile.nextLine(); // color 8
        String color9 = inputFile.nextLine(); // color 9
        String color10 = inputFile.nextLine(); // color 10
        String color11 = inputFile.nextLine(); // color 11
        String color12 = inputFile.nextLine(); // color 12
        String color13 = inputFile.nextLine(); // color 13
        String color14 = inputFile.nextLine(); // color 14
        String color15 = inputFile.nextLine(); // color 15
        String color16 = inputFile.nextLine(); // color 16
        
        //Display
        System.out.println(color1);
        System.out.println(color2);
        System.out.println(color3);
        System.out.println(color4);
        System.out.println(color5);
        System.out.println(color6);
        System.out.println(color7);
        System.out.println(color8);
        System.out.println(color9);
        System.out.println(color10);
        System.out.println(color11);
        System.out.println(color12);
        System.out.println(color13);
        System.out.println(color14);
        System.out.println(color15);
        System.out.println(color16);
        
        // Playing the game
        int correctGuess = 0;

        // Step 2: Repeat 3 times, ask the player to guess the color
        for (int i = 0; i < 3; i++) 
        {
            int randomNumber = random.nextInt(16) + 1;  // Generating number 1 to 16
            String chosenColor = "";

            // Select the color based on the random number
            switch (randomNumber) 
            {
                case 1:
                    chosenColor = color1;
                    break;
                case 2:
                    chosenColor = color2;
                    break;
                case 3:
                    chosenColor = color3;
                    break;
                case 4:
                    chosenColor = color4;
                    break;
                case 5:
                    chosenColor = color5;
                    break;
                case 6:
                    chosenColor = color6;
                    break;
                case 7:
                    chosenColor = color7;
                    break;
                case 8:
                    chosenColor = color8;
                    break;
                case 9:
                    chosenColor = color9;
                    break;
                case 10:
                    chosenColor = color10;
                    break;
                case 11:
                    chosenColor = color11;
                    break;
                case 12:
                    chosenColor = color12;
                    break;
                case 13:
                    chosenColor = color13;
                    break;
                case 14:
                    chosenColor = color14;
                    break;
                case 15:
                    chosenColor = color15;
                    break;
                case 16:
                    chosenColor = color16;
                    break;
            }
            
         // Step 3: prompt for user to guess
           
            int round = 1;
            System.out.println("\nRound " + round);
            round++; 											// counter for Round as part of printout
            System.out.println("");
            System.out.println("I am thinking of a color.");
            System.out.println("Is it one of the colors in list above? ");
            System.out.print("Enter your guess: ");
            String userGuess = keypad.nextLine().trim(); // trim removes white spaces on either side

            System.out.println("I was thinking of " + chosenColor);
            										// "chosenColor" is random guess

            // Is the user's guess right?
            if (userGuess.equalsIgnoreCase(chosenColor))
	            {
	                System.out.println("Good guess");
	                correctGuess++;
	            } 
            else 
	            {
	                System.out.println("Wrong !");
	            }
        }

        // Display the number of correct guesses
        System.out.println("\nYou correctly guessed the color " + correctGuess + " times.");

        // Step 4: Ask for student information
        System.out.print("\nPlease enter your name: ");
        String name = keypad.nextLine();

        System.out.print("Enter a sentence that describes yourself: ");
        String description = keypad.nextLine();

        System.out.print("Enter the due date (MM/DD/YY): ");
        String dueDate = keypad.nextLine();

        // Step 5: Display the student's information
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + "Chandra S. Krishnan");
        System.out.println("Describe yourself: " + "Taking class for fun");
        System.out.println("Due Date: " + "9/17/2024");
        System.out.println("User Description: CMSC 203 student");
        System.out.println("Due Date: " + "9/17/2024");
        
        keypad.close();
    }
}
		
		

	
