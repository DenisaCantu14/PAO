package pao.exercises.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] count = new int[256];
        char[] sir1 = s1.toCharArray();
        char[] sir2 = s2.toCharArray();

        for(int i = 0; i < s1.length(); i++)
        {
            count[sir1[i] - 'a']++;
            count[sir2[i] - 'a']--;
        }

        for(int i = 0; i < 256; i++)
            if (count[i] != 0)
            {
                return false;
            }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Read first sir: ");
        String s1 = scanner.nextLine();

        System.out.println("Read second sir: ");
        String s2 = scanner.nextLine();

        if (anagram(s1, s2))
            System.out.println("The two strings are anagrams");
        else
            System.out.println("The two strings are not anagrams");
    }


}


