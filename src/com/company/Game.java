package com.company;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(String player1, String player2, int boardSize){
        board = new Board(boardSize);
        this.player1 = new Player(player1,'X');
        this.player2 = new Player(player2,'O');
    }

    public void play(){
        Player curplayer = player1;
        while(true){
            board.printBoard();
            int move[]  = curplayer.makeMove();
            int row = move[0];
            int col = move[1];

            if(board.placeMark(row,col, curplayer.getMark())){
                if(board.checkWin(curplayer.getMark())){
                    board.printBoard();
                    System.out.println(curplayer.getName() + " wins!");
                    break;
                }
                if(board.isFull()){
                    board.printBoard();
                    System.out.println("It's a tie!");
                    break;
                }
                else{
                    curplayer = (curplayer==player1) ? player2 : player1;
                }
            }
            else{
                System.out.println("Invalid move.Try again!");
            }
        }

    }


}
