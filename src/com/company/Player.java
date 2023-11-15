package com.company;

import java.util.Scanner;

public class Player {
    private String name;
    private char mark;

    public Player(String name, char mark){
        this.name = name;
        this.mark = mark;
    }

    public char getMark(){
        return mark;
    }
    public String getName(){
        return name;
    }

    public int[] makeMove(){
        Scanner sc = new Scanner(System.in);
        int[] move = new int[2];
        System.out.print(name + " , enter your move: ");
        move[0] = sc.nextInt();
        move[1] = sc.nextInt();

        return move;
    }

}
