/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Asus
 */
public class Tictactoe {
        char [][] board;
        char turn = ' ';
        char win = ' ';
        public  Tictactoe(){
            board = new char[3][3];
            for(int i=0; i<3; i++)
                for(int j=0;j<3;j++)
                    board[i][j]= ' ';
            
        }
        
        public void displayBoard(){
                System.out.print(board[0][0]+"|"+ board[0][1]+"|" +board[0][2]+"\n" );
                System.out.print("------\n" );
                System.out.print(board[1][0]+"|"+ board[1][1]+"|" +board[1][2]+"\n" );
                System.out.print("------\n" );
                System.out.print(board[2][0]+"|"+ board[2][1]+"|" +board[2][2]+"\n" );

        }
        
        public char getWinner(){
            //check rows
            for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                win = board[i][0];
               
            }
        }
                //check column
                  // Check columns
            for (int i = 0; i < 3; i++) {
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                    win =  board[0][i];
                  
                }
            }

            //check diagonals 
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
                win =  board[0][0];
               
            }

            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
                win =  board[0][2];
              
            }
            //draw
            
            return  win;
        }
        
        public char whoseTurn() {
            if(turn==' ')
                turn = 'X';
            else if(turn == 'X')
                turn = 'O';
            else
                turn = 'X';
            return turn;
        }

            /*
            * Fill the board at [row,col] with X or O
            * depending on whose turn it is
            * then change turn from X to O or O to X.
            */
     public void putMark(int row, int col) {
         board[row-1][col-1] = turn;
         
     }

     /*
     * Return the mark at [row,col] in the board.
     */
     public char getMark(int row, int col) {
         
         return board[row-1][col-1];
    
            
     }
        
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Tictactoe game = new Tictactoe();
            game.displayBoard();
        
        
       
    }
    
}
