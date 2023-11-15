package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player1 name:");
        String playername1 = sc.nextLine();
        System.out.println("Enter player2 name:");
        String playername2 = sc.nextLine();
        System.out.println("What is the size of the board?");
        int boardsize = sc.nextInt();
        Game game = new Game(playername1,playername2,boardsize);
        game.play();
    }
}
