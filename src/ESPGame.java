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
        
        // Step 1. Reading and Printing from "colors.txt"
        try (Scanner inputFile = new Scanner(new File("colors.txt")))
        {
        	while (inputFile.hasNext())
        	{
        		String line = inputFile.nextLine();
        		System.out.println(line);
        	}
        }
        final String COLOR1 = "Black";				// HARD CODING STRINGS FOR SAKE OF SWITCH
        final String COLOR2 = "White";
        final String COLOR3 = "Gray";
        final String COLOR4 = "Silver";
        final String COLOR5 = "Maroon";     
        final String COLOR6 = "Red";
        final String COLOR7 = "Purple";
        final String COLOR8 = "Fuchsia";
        final String COLOR9 = "Green";
        final String COLOR10 = "Lime";       
        final String COLOR11 = "Olive";
        final String COLOR12 = "Yellow";
        final String COLOR13 = "Navy";
        final String COLOR14 = "Blue";
        final String COLOR15 = "Teal";
        final String COLOR16 = "Aqua";
        
        // Playing the game
        int correctGuess = 0;

        // 2: Repeat 3 times, ask the player to guess the color
        for (int i = 0; i < 3; i++) 
        {
            int randomNumber = random.nextInt(16) + 1;  // Generating number 1 to 16
            String chosenColor = "";

            // Select the color based on the random number
            switch (randomNumber) 
            {
                case 1:
                    chosenColor = COLOR1;
                    break;
                case 2:
                    chosenColor = COLOR2;
                    break;
                case 3:
                    chosenColor = COLOR3;
                    break;
                case 4:
                    chosenColor = COLOR1;
                    break;
                case 5:
                    chosenColor = COLOR5;
                    break;
                case 6:
                    chosenColor = COLOR6;
                    break;
                case 7:
                    chosenColor = COLOR7;
                    break;
                case 8:
                    chosenColor = COLOR8;
                    break;
                case 9:
                    chosenColor = COLOR9;
                    break;
                case 10:
                    chosenColor = COLOR10;
                    break;
                case 11:
                    chosenColor = COLOR11;
                    break;
                case 12:
                    chosenColor = COLOR12;
                    break;
                case 13:
                    chosenColor = COLOR13;
                    break;
                case 14:
                    chosenColor = COLOR14;
                    break;
                case 15:
                    chosenColor = COLOR15;
                    break;
                case 16:
                    chosenColor = COLOR16;
                    break;
            }
            
         // 3: prompt for user to guess          
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
	                System.out.println("Good guess !!");
	                correctGuess++;
	            } 
            else 
	            {
	                System.out.println("Wrong !!");
	            }
        }

        // Display the number of correct guesses
        System.out.println("\nYou correctly guessed the color " + correctGuess + " times.");
        
        // Step 4 & 5: Display the student's information
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + "Chandra S. Krishnan");
        System.out.println("Describe yourself: " + "Taking class for fun");
        System.out.println("Due Date: " + "9/17/2024");
        System.out.println("User Description: CMSC 203 student");
        System.out.println("Due Date: " + "9/17/2024");
        
        keypad.close();												// CLOSE KEYPAD
	}

}
