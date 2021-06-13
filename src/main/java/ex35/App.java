package ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> contestants = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);

        // read contestants from the input
        while (true) {
            System.out.print("Enter a name: ");
            String contestant = inputScanner.nextLine();

            if (contestant.isBlank())
                break;

            contestants.add(contestant);
        }
        // generate a random index of the array
        int randomIdx = getNumberBetween(0, contestants.size());
        String winner = contestants.get(randomIdx);
        // output the winner
        System.out.println("The winner is... " + winner);

        inputScanner.close();
    }

    private static int getNumberBetween(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}

