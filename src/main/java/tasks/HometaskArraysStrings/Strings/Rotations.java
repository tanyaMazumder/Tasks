package tasks.HometaskArraysStrings.Strings;

import java.util.Scanner;

public class Rotations {
    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
                ((str1 + str1).contains(str2));
    }

    public static void main (String[] args)
    {
        String str1 ,str2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String");
        str1 = scanner.next();
        System.out.println("Enter second String");
        str2 = scanner.next();

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.println("Strings are not rotations of each other");
    }

}
