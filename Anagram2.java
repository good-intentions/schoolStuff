package simeon;

import java.util.Scanner;

public class Anagram2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1, word2;
        System.out.print("Enter a word ");
        word1 = input.nextLine();
        System.out.print("Enter an anagram ");
        word2 = input.nextLine();

        int sum1 = 0;

        for (char ch : word1.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sum1 += ch;
            }else if (ch >= 'A' && ch <= 'Z') {
            	sum1 = sum1 + ch + 32;
            }
        }

        int sum2 = 0;

        for (char ch : word2.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' ) {
                sum2 += ch;
            }else if (ch >= 'A' && ch <= 'Z') {
            	sum2 = sum2 + ch + 32;
            }
        }

        if (sum1 == sum2)
            System.out.println("It is an anagram.");
        else
            System.out.println("It is not an anagram.");

        input.close();
    }

}