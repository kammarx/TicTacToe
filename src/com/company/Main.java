package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player1 name:");
        String playername1 = sc.nextLine();
        System.out.println("Enter player2 name:");
        String playername2 = sc.nextLine();
        Game game = new Game(playername1,playername2);
        game.play();
    }
}
