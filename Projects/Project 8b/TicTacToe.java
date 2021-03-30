//-------------------------------------
// TicTacToe.java   Author: Carter Schmidt
//
//-------------------------------------

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main( String[] args ) {
      
        initBoard();
      
        System.out.println("Let's play tic tac toe. Initial the board ... ");
        displayBoard();
        
        // start your code from here...
        while (win() == false && tie() == false ) {
            Xmove();
            displayBoard();
            //check for win/tie before asking for Omove
            if (win() == false && tie() == false) {
                Omove();
                displayBoard();
            }
            else
                return;
        }
        
   }

   public static void initBoard()
   {
   	// fills up the board with blanks
      for ( int r=0; r<3; r++ )
         for ( int c=0; c<3; c++ )
            board[r][c] = ' ';
   }


   public static void displayBoard()
   {
      System.out.println();
      System.out.println("  0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
      System.out.println("    ---+---+---");
      System.out.println("  1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
      System.out.println("    ---+---+---");
      System.out.println("  2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
      System.out.println("     0   1   2 ");
      System.out.println();
   }
   
   // please fill the details of method Xmove...
   public static void Xmove() {
       Scanner scan = new Scanner(System.in);
       System.out.println("player 'X', choose your location (row, column): ");
       int i = scan.nextInt();
       int j = scan.nextInt();
       board[i][j] = 'X';
   }
   
   // please fill the details of method Omove...
   public static void Omove() {
       Scanner scan = new Scanner(System.in);
       System.out.println("player 'O', choose your location (row, column): ");
       int i = scan.nextInt();
       int j = scan.nextInt();
       board[i][j] = 'O';
   }
   
   // please fill the details of method tie...
   public static boolean tie() {
       if (win())
           return false;
       //if game is over and there is no winner, then tie is true
       else {
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   if (board[i][j] == ' ')
                       return false;
               }
           }
       return true;
       }
   }
   
   
   public static boolean win() {
   
      // check each row
      // write your code here...
      for ( int c = 0; c < 3; c++) {
         if (board[c][0] == board[c][1] && board[c][1] == board[c][2] && board[c][0] == 'O') {
            System.out.println("player O wins!");
            return true;
         }          
         if (board[c][0] == board[c][1] && board[c][1] == board[c][2] && board[c][0] == 'X') {
            System.out.println("player X wins!");
            return true;
         }    
      }
      
      // check each column
      for ( int c = 0; c < 3; c++) {
         if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] == 'O') {
            System.out.println("player O wins!");
            return true;
         }          
         if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] == 'X') {
            System.out.println("player X wins!");
            return true;
         }    
      }
      
      // check from top left to bottom right
      if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'O') {
         System.out.println("player O wins!");
         return true;
      }          
      if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'X') {
         System.out.println("player X wins!");
         return true;
      } 
      
      
      // check from top right to bottom left
      if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'O') {
         System.out.println("player O wins!");
         return true;
      }          
      if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'X') {
         System.out.println("player X wins!");
         return true;
      }
      
      return false;
      
   }

}