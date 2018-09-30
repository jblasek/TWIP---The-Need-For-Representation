package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner rbReader = new Scanner(System.in);
        System.out.println("What word to you want me to encrypt?");
        String word = rbReader.next();

        int startingPosition = (int) (Math.random() * word.length());
        int j = 0;
        String encryptedWord = "";

        while (word.length() > j){

            char positionInWord = word.charAt(startingPosition - j);

            if (startingPosition % 5 == 0) {
                encryptedWord = Integer.toBinaryString(positionInWord);
            }

            else if (startingPosition % 5 == 1) {
                encryptedWord = Integer.toOctalString(positionInWord);
            }

            else if (startingPosition % 5 == 2) {
                encryptedWord = Integer.toString(positionInWord);
            }

            else if (startingPosition % 5 == 3) {
                encryptedWord = Integer.toHexString(positionInWord);
            }

            else {
                encryptedWord = Character.toString(positionInWord);
            }

            System.out.print(encryptedWord);
            j++;
            startingPosition++;

        }

    }
}
