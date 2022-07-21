package tasks.HometaskLambdaExpression;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Is racecar a Palindrome? - " + isPalindrome("racecar"));
        System.out.println("Is level a Palindrome? - " + isPalindrome("level"));
        System.out.println("Is class a Palindrome? - " + isPalindrome("class"));
        System.out.println("Is was it a car or a cat I saw a Palindrome? - " + isPalindrome("was it a car or a cat I saw"));
    }

    public static boolean isPalindrome(String originalString) {

        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, tempString.length() / 2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

    }
}