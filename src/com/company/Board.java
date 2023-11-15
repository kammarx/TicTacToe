package com.company;

public class Board {
    private char[][] grid;

    public Board(int size){
        grid = new char[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                grid[i][j] = ' ';
            }
        }
    }

    public void printBoard(){
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid.length;j++){
                System.out.print(grid[i][j]);
                if(j< grid.length-1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<grid.length-1){
                for(int k=0;k<grid.length*4;k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
    public boolean isFull(){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
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
        for (int i = 0; i < grid.length; i++) {
            if(checkline(grid[i],mark)) return true;
            char[] arrcol = new char[grid.length];
            for (int j = 0; j < grid.length; j++) {
                arrcol[j] = grid[j][i];
            }
            if(checkline(arrcol,mark))return true;
        }
        char[] diagonal1 = new char[grid.length];
        char[] diagonal2 = new char[grid.length];
        for (int i = 0; i < grid.length; i++) {
            diagonal1[i] = grid[i][i];
            diagonal2[i] = grid[grid.length-1-i][i];
        }
        return(checkline(diagonal1,mark) || checkline(diagonal2,mark));

    }

    public boolean checkline(char[] line,char mark){
        for(int i = 0;i < line.length;i++){
            if(line[i] != mark)return false;
        }
        return true;
    }

    public boolean isValid(int row, int col){
        return (row >=0 && col >=0 && row<grid.length && col< grid.length);
    }

}
