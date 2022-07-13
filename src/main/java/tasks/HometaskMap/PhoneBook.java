package tasks.HometaskMap;

import java.util.Scanner;
import java.util.*;

public class PhoneBook {
    private static Scanner sc;

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<String, String>();
        sc = new Scanner(System.in);
        System.out.println("Enter the number of entries in the phonebook: ");
        int numberOfFriends = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= numberOfFriends; i++) {
            String name = sc.nextLine();
            String phone = sc.nextLine();
            phoneBook.put(name, phone);
        }

        while (sc.hasNext()) {
            String inputName = sc.nextLine();
            if (phoneBook.containsKey(inputName)) {
                System.out.println(inputName + "=" + phoneBook.get(inputName));
            } else {
                System.out.println("Not found");
            }

        }

    }

}