package com.sparta.lex;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        com.sparta.lex.LexAnalyser analyser = new com.sparta.lex.LexAnalyser(); // instance of Analizer obj
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Java Word Count Program.");
        System.out.println("Enter a sentence to be analysed");
        String myString = scanner.nextLine();
        HashMap myCharMap = analyser.getCharMap(myString);
        System.out.println("The word map:\n" + myCharMap);
        scanner.nextLine();

        System.out.println("The character map:\n" + analyser.getWordMap(myString));
        scanner.nextLine();

        System.out.println(analyser.getHighestCount(myCharMap));
        scanner.nextLine();

//
//
//        HashMap test = analyser.getWordMap(myString);



    }
}