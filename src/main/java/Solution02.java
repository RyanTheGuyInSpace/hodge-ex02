/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Hodge
 */

/*
 * Create a program that prompts for an input string and displays output that
 * shows the input string and the number of characters the string contains.
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        // Prompt the user for input
        // Store the string in a variable
        // Output the string and its length in the same line

        System.out.println("What's the input string?");
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toString();

        System.out.printf("\"%s\" has %d characters", input, input.length());
    }
}
