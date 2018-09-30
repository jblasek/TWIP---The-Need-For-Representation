package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner rbReader = new Scanner(System.in);
        System.out.println("What word to you want me to encrypt?");
        String word = rbReader.next();

        int random = (int) ( Math.random() * word.length() );
        //creates random number
        String s = word.substring(random) +  word.substring(0 , random);
        //starting position in the sequence
        int sequenceNumber = (int) ( Math.random() * 4 );

        int j = 1;

        String encryptedWord = "";

        while (word.length() > j){

            char positionInWord = s.charAt(j - 1);

            if (sequenceNumber % 5 == 0) {
                encryptedWord = Integer.toBinaryString(positionInWord);
            }

            else if (sequenceNumber % 5 == 1) {
                encryptedWord = Integer.toOctalString(positionInWord);
            }

            else if (sequenceNumber % 5 == 2) {
                encryptedWord = Integer.toString(positionInWord);
            }

            else if (sequenceNumber % 5 == 3) {
                encryptedWord = Integer.toHexString(positionInWord);
            }

            else {
                encryptedWord = Character.toString(positionInWord);
            }

            System.out.println(encryptedWord);
            j++;
            sequenceNumber++;

        }

    }
}
