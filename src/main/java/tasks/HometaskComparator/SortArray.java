package tasks.HometaskComparator;

import java.util.Scanner;
import java.util.*;
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a1, Player a2) {
        if (a1.score < a2.score) {
            return 1;
        } else if (a1.score > a2.score) {
            return -1;
        } else {
            return a1.name.compareTo(a2.name);
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class SortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Players :");
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            System.out.println("Enter the name of the Player " +(i+1));
            String name = scan.next();
            System.out.println("Enter the score of Player " +(i+1));
            int score = scan.nextInt();
            player[i] = new Player(name, score);
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
