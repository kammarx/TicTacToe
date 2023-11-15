package com.company;

public class Board {
    private char[][] grid;


    public Board(){
        grid = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j] = ' ';
            }
        }
    }

    public void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(grid[i][j]);
                if(j<2){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<2){
                System.out.println("-----------");
            }
        }
    }
    public boolean isFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean placeMark(int row,int col, char mark ){
        if( isValid(row, col) && grid[row][col] == ' '){
            grid[row][col] = mark;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkWin(char mark){
        for(int i = 0;i < 3;i++){
            if(grid[i][0] == mark && grid[i][1] == mark && grid[i][2] == mark) return true;
            if(grid[0][i] == mark && grid[1][i] == mark && grid[2][i] == mark) return true;
        }
        if(grid[0][0] == mark && grid[1][1] == mark && grid[2][2] == mark)return true;
        if(grid[2][0] == mark && grid[1][1] == mark && grid[0][2] == mark)return true;
        return false;
    }

    public boolean isValid(int row, int col){
        return (row >=0 && col >=0 && row<grid.length && col< grid.length);
    }

}
