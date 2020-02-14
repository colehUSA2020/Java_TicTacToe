/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.util.Scanner;

public class TicTacToe 
{


    public static void main(String[] args) 
    {  
      
        MainLine();//call MainLine method.  
      
    }//end main
    
    private static int MainLine()
    {
        
        //declare and initialize MainLine variables
        int choice1 = 0;
        int choice2 = 0;
        int choice3 = 0;
        int choice4 = 0;
        int choice5 = 0;
        int choice6 = 0;
        int choice7 = 0;
        int choice8 = 0;
        int choice9 = 0;
        int victory = 0;//this variable determines which player wins the game
        int sentinel = 0;//this variable ends the program at user request
        int results = 0;//this variable displays the results of the game
        
        //call the MainLine methods/////////////////////////////////////////// 
      
        StartGameBoard();//call StartGameBoard method
        
        sentinel = GetSentinel();//call GetSentinel method
        
        if (sentinel != 1)//sentinel test for quitting program
        {
        
        System.out.println("Your move, Player X");//display the player turn
        
        choice1 = GetChoiceOne();//call GetChoiceOne method
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);//call ShowGameBoard method 
        
        results = ShowResults(victory, choice9);//call ShowResults method
        }
        
        if (sentinel != 1)//sentinel test to quit game
        {
            sentinel = GetSentinel();//call GetSentinel method
        }
        
        if (sentinel != 1)//sentinel test for quitting program
        {
        
        System.out.println("Your move, Player O");//display the player turn
        
        choice2 = GetChoiceTwo(choice1);//call GetChoiceTwo method
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);//call ShowGameBoard method
        
        results = ShowResults(victory, choice9);//call ShowResults method
        }
        
        if (sentinel != 1)//sentinel test for quitting program
        {
            sentinel = GetSentinel();//call GetSentinel method
        }
       
        if (sentinel != 1)//sentinel test for quitting program
        {
            
        System.out.println("Your move, Player X");//display the player turn
            
        choice3 = GetChoiceThree(choice1, choice2);//call GetChoiceThree method
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);//call ShowGameBoard method
        
        results = ShowResults(victory, choice9);//call ShowResults method
        }
        
        if (sentinel != 1)
        {
            sentinel = GetSentinel();
        }
       
        if (sentinel != 1)
        { 
            
        System.out.println("Your move, Player O");    
            
        choice4 = GetChoiceFour(choice1, choice2, choice3);
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);
        }
        
        if (sentinel != 1)
        {
            sentinel = GetSentinel();
        }
        
        if (sentinel != 1)
        {
        
        System.out.println("Your move, Player X");   
        
        choice5 = GetChoiceFive(choice1, choice2, choice3, choice4);
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);
        
        results = ShowResults(victory, choice9);//call ShowResults method
        }
        
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
            sentinel = GetSentinel();
        }
    
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
        
        System.out.println("Your move, Player O");
        
        choice6 = GetChoiceSix(choice1, choice2, choice3, choice4,choice5);
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);
        
        results = ShowResults(victory, choice9);
        }
        
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
            sentinel = GetSentinel();
        }
      
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
        
        System.out.println("Your move, Player X"); 
        
        choice7 = GetChoiceSeven(choice1, choice2, choice3, choice4,choice5, choice6);
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);
        
        results = ShowResults(victory, choice9);
        }
        
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
            sentinel = GetSentinel();
        }
        
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
        
        System.out.println("Your move, Player O");
        
        choice8 = GetChoiceEight(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7);
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);
        
        results = ShowResults(victory, choice9);
        }
        
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
            sentinel = GetSentinel();
        }
        
        if (sentinel != 1 && victory != 1 && victory != 2)
        {
       
        System.out.println("Your move, Player X");    
        choice9 = GetChoiceNine(choice1, choice2, choice3, choice4,
             choice5, choice6, choice7, choice8);
        
        victory = ShowGameBoard(choice1, choice2, choice3, choice4,choice5, choice6, 
                choice7, choice8, choice9);
        
        results = ShowResults(victory, choice9);
        }
        
        return 0;
    }//end MainLine method
   
    //Begin StartGameBoard method
    private static int StartGameBoard()
    {
        //set 2D array gameBoard
        String [][] gameBoard = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        
        //display starting game board
        System.out.println("Starting gameboard:");
        System.out.printf(gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2] + "\n");
        System.out.println("---------");
        System.out.printf(gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2] + "\n");
        System.out.println("---------");
        System.out.printf(gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2] + "\n");
        
        return 0;
    }//end StartGameBoard
    
    //begin ShowGameBoard method
    private static int ShowGameBoard(int choice1, int choice2, int choice3, 
            int choice4,int choice5, int choice6, int choice7, int choice8, 
            int choice9)
    {
       //set 2D array gameBoard 
       String [][] gameBoard = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
       int victory = 0;
    
        //alter gameBoard by player, by choice
        if (choice1 == 1)
        {
            gameBoard[0][0] = "X";
        }
        
        if (choice1 == 2)
        {           
            gameBoard[0][1]= "X";    
        }
        
        if (choice1 == 3)
        {         
            gameBoard[0][2] = "X";
        }
        
        if (choice1 == 4)
        {           
            gameBoard[1][0] = "X";
        }
        
        if (choice1 == 5)
        {           
            gameBoard[1][1] = "X";
        }
        
        if (choice1 == 6)
        {            
            gameBoard[1][2] = "X";
        }
        
        if (choice1 == 7)
        {           
            gameBoard[2][0] = "X";
        }
        
        if (choice1 == 8)
        {       
            gameBoard[2][1] = "X";    
        }
        
        if (choice1 == 9)
        {            
            gameBoard[2][2] = "X";
        }
        
        //choice2
        if (choice2 == 1)
        {         
            gameBoard[0][0] = "O";
        }
        
        if (choice2 == 2)
        {           
            gameBoard[0][1] = "O";   
        }
        
        if (choice2 == 3)
        {         
            gameBoard[0][2] = "O";
        }
        
        if (choice2 == 4)
        {            
            gameBoard[1][0] = "O";
        }
        
        if (choice2 == 5)
        {            
            gameBoard[1][1] = "O";
        }
        
        if (choice2 == 6)
        {            
            gameBoard[1][2] = "O";
        }
        
        if (choice2 == 7)
        {           
            gameBoard[2][0] = "O";
        }
        
        if (choice2 == 8)
        {        
            gameBoard[2][1] = "O";    
        }
        
        if (choice2 == 9)
        {            
            gameBoard[2][2] = "O";
        }
        
        //choice3
        if (choice3 == 1)
        {
            gameBoard[0][0] = "X";
        }
        
        if (choice3 == 2)
        {           
            gameBoard[0][1]= "X";    
        }
        
        if (choice3 == 3)
        {         
            gameBoard[0][2] = "X";
        }
        
        if (choice3 == 4)
        {           
            gameBoard[1][0] = "X";
        }
        
        if (choice3 == 5)
        {           
            gameBoard[1][1] = "X";
        }
        
        if (choice3 == 6)
        {            
            gameBoard[1][2] = "X";
        }
        
        if (choice3 == 7)
        {           
            gameBoard[2][0] = "X";
        }
        
        if (choice3 == 8)
        {       
            gameBoard[2][1] = "X";    
        }
        
        if (choice3 == 9)
        {            
            gameBoard[2][2] = "X";
        }
        
        //choice4
        if (choice4 == 1)
        {         
            gameBoard[0][0] = "O";
        }
        
        if (choice4 == 2)
        {           
            gameBoard[0][1] = "O";   
        }
        
        if (choice4 == 3)
        {         
            gameBoard[0][2] = "O";
        }
        
        if (choice4 == 4)
        {            
            gameBoard[1][0] = "O";
        }
        
        if (choice4 == 5)
        {            
            gameBoard[1][1] = "O";
        }
        
        if (choice4 == 6)
        {            
            gameBoard[1][2] = "O";
        }
        
        if (choice4 == 7)
        {           
            gameBoard[2][0] = "O";
        }
        
        if (choice4 == 8)
        {        
            gameBoard[2][1] = "O";    
        }
        
        if (choice4 == 9)
        {            
            gameBoard[2][2] = "O";
        }
        
        //choice5
        if (choice5 == 1)
        {
            gameBoard[0][0] = "X";
        }
        
        if (choice5 == 2)
        {           
            gameBoard[0][1]= "X";    
        }
        
        if (choice5 == 3)
        {         
            gameBoard[0][2] = "X";
        }
        
        if (choice5 == 4)
        {           
            gameBoard[1][0] = "X";
        }
        
        if (choice5 == 5)
        {           
            gameBoard[1][1] = "X";
        }
        
        if (choice5 == 6)
        {            
            gameBoard[1][2] = "X";
        }
        
        if (choice5 == 7)
        {           
            gameBoard[2][0] = "X";
        }
        
        if (choice5 == 8)
        {       
            gameBoard[2][1] = "X";    
        }
        
        if (choice5 == 9)
        {            
            gameBoard[2][2] = "X";
        }
        
        //choice6
        if (choice6 == 1)
        {         
            gameBoard[0][0] = "O";
        }
        
        if (choice6 == 2)
        {           
            gameBoard[0][1] = "O";   
        }
        
        if (choice6 == 3)
        {         
            gameBoard[0][2] = "O";
        }
        
        if (choice6 == 4)
        {            
            gameBoard[1][0] = "O";
        }
        
        if (choice6 == 5)
        {            
            gameBoard[1][1] = "O";
        }
        
        if (choice6 == 6)
        {            
            gameBoard[1][2] = "O";
        }
        
        if (choice6 == 7)
        {           
            gameBoard[2][0] = "O";
        }
        
        if (choice6 == 8)
        {        
            gameBoard[2][1] = "O";    
        }
        
        if (choice6 == 9)
        {            
            gameBoard[2][2] = "O";
        }
        
        //choice7
        if (choice7 == 1)
        {
            gameBoard[0][0] = "X";
        }
        
        if (choice7 == 2)
        {           
            gameBoard[0][1]= "X";    
        }
        
        if (choice7 == 3)
        {         
            gameBoard[0][2] = "X";
        }
        
        if (choice7 == 4)
        {           
            gameBoard[1][0] = "X";
        }
        
        if (choice7 == 5)
        {           
            gameBoard[1][1] = "X";
        }
        
        if (choice7 == 6)
        {            
            gameBoard[1][2] = "X";
        }
        
        if (choice7 == 7)
        {           
            gameBoard[2][0] = "X";
        }
        
        if (choice7 == 8)
        {       
            gameBoard[2][1] = "X";    
        }
        
        if (choice7 == 9)
        {            
            gameBoard[2][2] = "X";
        }
        
        //choice8
        if (choice8 == 1)
        {         
            gameBoard[0][0] = "O";
        }
        
        if (choice8 == 2)
        {           
            gameBoard[0][1] = "O";   
        }
        
        if (choice8 == 3)
        {         
            gameBoard[0][2] = "O";
        }
        
        if (choice8 == 4)
        {            
            gameBoard[1][0] = "O";
        }
        
        if (choice8 == 5)
        {            
            gameBoard[1][1] = "O";
        }
        
        if (choice8 == 6)
        {            
            gameBoard[1][2] = "O";
        }
        
        if (choice8 == 7)
        {           
            gameBoard[2][0] = "O";
        }
        
        if (choice8 == 8)
        {        
            gameBoard[2][1] = "O";    
        }
        
        if (choice8 == 9)
        {            
            gameBoard[2][2] = "O";
        }
        
        //choice9
        if (choice9 == 1)
        {
            gameBoard[0][0] = "X";
        }
        
        if (choice9 == 2)
        {           
            gameBoard[0][1]= "X";    
        }
        
        if (choice9 == 3)
        {         
            gameBoard[0][2] = "X";
        }
        
        if (choice9 == 4)
        {           
            gameBoard[1][0] = "X";
        }
        
        if (choice9 == 5)
        {           
            gameBoard[1][1] = "X";
        }
        
        if (choice9 == 6)
        {            
            gameBoard[1][2] = "X";
        }
        
        if (choice9 == 7)
        {           
            gameBoard[2][0] = "X";
        }
        
        if (choice9 == 8)
        {       
            gameBoard[2][1] = "X";    
        }
        
        if (choice9 == 9)
        {            
            gameBoard[2][2] = "X";
        }
        
        //display interactive game board
        System.out.printf(gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2] + "\n");
        System.out.println("---------");
        System.out.printf(gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2] + "\n");
        System.out.println("---------");
        System.out.printf(gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2] + "\n"); 
        
        //Player 1 victory announcement
        if (gameBoard[0][0] == "X" && gameBoard[0][1] == "X" && gameBoard[0][2] == "X")//row 1 across
        {
            System.out.println("With 3 in a row horizontally,"); 
            victory = 1;
        }
        
        if (gameBoard[1][0] == "X" && gameBoard[1][1] == "X" && gameBoard[1][2] == "X")//row 2 across
        {
            System.out.println("With 3 in a row horizontally,");  
            victory = 1;
        }
        
        if (gameBoard[2][0] == "X" && gameBoard[2][1] == "X" && gameBoard[2][2] == "X")//row 3 across
        {
            System.out.println("With 3 in a row horizontally,");
            victory = 1;
        }
        
        if (gameBoard[0][0] == "X" && gameBoard[1][0] == "X" && gameBoard[2][0] == "X")//column one down
        {
            System.out.println("With 3 in a row vertically,");
            victory = 1;
        }
        
        if (gameBoard[0][1] == "X" && gameBoard[1][1] == "X" && gameBoard[2][1] == "X")//column 2 down
        {
            System.out.println("With 3 in a row vertically,");
            victory = 1;
        }
        
        if (gameBoard[0][2] == "X" && gameBoard[1][2] == "X" && gameBoard[2][2] == "X")//column 3 down
        {
            System.out.println("With 3 in a row vertically,");
            victory = 1;
        }
        
        if (gameBoard[0][0] == "X" && gameBoard[1][1] == "X" && gameBoard[2][2] == "X")//diagonal from left to right
        {
            System.out.println("With 3 in a row diagonally,");
            victory = 1;
        }
        
        if (gameBoard[0][2] == "X" && gameBoard[1][1] == "X" && gameBoard[2][0] == "X")//diagonal from right to left
        {
            System.out.println("With 3 in a row diagonally,");
            victory = 1;
        }
        
        //Player 2 victory announcement
        if (gameBoard[0][0] == "O" && gameBoard[0][1] == "O" && gameBoard[0][2] == "O")//row 1 across
        {
            System.out.println("With 3 in a row horizontally,");
            victory = 2;
        }
        
        if (gameBoard[1][0] == "O" && gameBoard[1][1] == "O" && gameBoard[1][2] == "O")//row 2 across
        {
            System.out.println("With 3 in a row horizontally,");
            victory = 2;
        }
        
        if (gameBoard[2][0] == "O" && gameBoard[2][1] == "O" && gameBoard[2][2] == "O")//row 3 across
        {
            System.out.println("With 3 in a row horizontally,");
            victory = 2;
        }
        
        if (gameBoard[0][0] == "O" && gameBoard[1][0] == "O" && gameBoard[2][0] == "O")//column 1 down
        {
            System.out.println("With 3 in a row vertically,");
            victory = 2;
        }
        
        if (gameBoard[0][1] == "O" && gameBoard[1][1] == "O" && gameBoard[2][1] == "O")//column 2 down
        {
            System.out.println("With 3 in a row vertically,");
            victory = 2;
        }
        
        if (gameBoard[0][2] == "O" && gameBoard[1][2] == "O" && gameBoard[2][2] == "O")//column 3 down
        {
            System.out.println("With 3 in a row vertically,");
            victory = 2;
        }
        
        if (gameBoard[0][0] == "O" && gameBoard[1][1] == "O" && gameBoard[2][2] == "O")//diagonal from left to right
        {
            System.out.println("With 3 in a row diagonally,");
            victory = 2;
        }
        
        if (gameBoard[0][2] == "O" && gameBoard[1][1] == "O" && gameBoard[2][0] == "O")//diagonal from right to left
        {
            
            System.out.println("With 3 in a row diagonally,");
            victory = 2;
        }
 
        return victory;
    }//end ShowGameBoard method
    
    //call GetChoiceOne method
    private static int GetChoiceOne()
   {
       //activate user input
       Scanner input = new Scanner( System.in );
       
       
       int choice1 = 0;//initialize choice1 
         
       //user input validation do-while loop
       do {
        
        System.out.println("Enter a number between 1 and 9.");
         
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");

            input.next();//clear input  
        }
         
        choice1 = input.nextInt();//set choice1
        
        if (choice1 > 9 || choice1 < 1)
        {
          System.out.println("Error! Invalid entry."); 
        }
           
    } while (choice1 > 9 || choice1 < 1);//end do-while
           
       return choice1;
   }//end method 
    
    //call GetTwoChoice method
    private static int GetChoiceTwo(int choice1)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
       
       int choice2 = 0;//initialize choice2
       
       do{//duplicate validation outer do-while loop
           
           do {//user input validation innerdo-while loop
        
        System.out.println("Enter a number between 1 and 9.");
       
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");
            
            input.next();//clear input   
        }
         
        choice2 = input.nextInt();//set choice2
        
        if (choice2 > 9 || choice2 < 1)
        {
          System.out.println("Error! Invalid entry."); 
        }
        
       if (choice2 == choice1)
       {
           System.out.println("Error! That space is already occupied.");
           System.out.println("Choose another space on the board.");
       }
        
    } while (choice2 > 9 || choice2 < 1);//end inner do-while
        
} while (choice2 == choice1);//end outer do-while     
        
       return choice2;
   }//end method 
    
     //begin GetChoiceThree method
     private static int GetChoiceThree(int choice1, int choice2)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
       
       int choice3 = 0;//initialize choice3
         
     do{//duplicate validation do-while loop
         
       do {//user input validation do-while loop
        
        System.out.println("Enter a number between 1 and 9.");        
        
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");
            
            input.next();//clear input   
        }
         
        choice3 = input.nextInt();//set choice3
        
        if (choice3 > 9 || choice3 < 1)
        {
          System.out.println("Error! Invalid entry.");  
        }
       
        if (choice3 == choice1 || choice3 == choice2)
       {
           System.out.println("Error! That space is already occupied.");
           System.out.println("Choose another space on the board.");
       }
          
    } while (choice3 > 9 || choice3 < 1);//end inner do-while
       
   } while (choice3 == choice1 || choice3 == choice2);//end outer do-while loop
     
       return choice3;
   }//end method 
   
     //begin GetChoiceFour method
     private static int GetChoiceFour(int choice1, int choice2, int choice3)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
      
       int choice4 = 0;//initialize choice4
      
     do{//duplicate validation do-while loop 
         
       do {//user input validation do-while loop
        
        System.out.println("Enter a number between 1 and 9.");
       
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");  
        }
         
        choice4 = input.nextInt();//set choice4
        
        if (choice4 > 9 || choice4 < 1)
        {
          System.out.println("Error! Invalid entry."); 
        }
       
        if (choice4 == choice1 || choice4 == choice2 || choice4 == choice3)
       {
           System.out.println("Error! That space is already occupied.");
           System.out.println("Choose another space on the board.");
       }
        
    } while (choice4 > 9 || choice4 < 1);//end inner do-while
       
 }while (choice4 == choice1 || choice4 == choice2 || choice4 == choice3);//end outer do-while
     
       return choice4;
   }//end method 
     
     //begin GetChoiceFive method
     private static int GetChoiceFive(int choice1, int choice2, int choice3, int choice4)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
       
       int choice5 = 0;//initialize choice5
          
     do {//duplicate validation do-while loop
         
       do {//user input validation do-while loop
        
        System.out.println("Enter a number between 1 and 9.");
         
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");
            
            input.next();//clear input     
        }
         
        choice5 = input.nextInt();//set choice5
        
        if (choice5 > 9 || choice5 < 1)
        {
          System.out.println("Error! Invalid entry.");
        }
       
        if (choice5 == choice1 || choice5 == choice2 || 
             choice5 == choice3 || choice5 == choice4)
       {
        System.out.println("Error! That space is already occupied.");
        System.out.println("Choose another space on the board.");   
       }
        
    } while (choice5 > 9 || choice5 < 1);//end inner do-while
       
} while (choice5 == choice1 || choice5 == choice2 || 
             choice5 == choice3 || choice5 == choice4);//end outer do-while
     
       return choice5;
   }//end method 
     
     //begin GetChoiceSix method 
     private static int GetChoiceSix(int choice1, int choice2, int choice3, int choice4,
             int choice5)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
      
       int choice6 = 0;//initialize choice6
       
    do{//duplicate vaidation do-while loop
        
       do {//user input validation do-while loop
        
        System.out.println("Enter a number between 1 and 9.");
        
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");
           
            input.next();//clear input   
        }
         
        choice6 = input.nextInt();//set choice6
        
        if (choice6 > 9 || choice6 < 1)
        {
          System.out.println("Error! Invalid entry."); 
        }
       
         if (choice6 == choice1 || choice6 == choice2 || choice6 == choice3 || 
            choice6 == choice4 || choice6 == choice5)
       {
        System.out.println("Error! That space is already occupied.");
        System.out.println("Choose another space on the board.");   
       }
        
    } while (choice6 > 9 || choice6 < 1);//end inner do-while
 
  } while (choice6 == choice1 || choice6 == choice2 || choice6 == choice3 || 
            choice6 == choice4 || choice6 == choice5);//end outer do-while loop
    
       return choice6;
   }//end method 
     
     //begin GetChoiceSeven method
     private static int GetChoiceSeven(int choice1, int choice2, int choice3, int choice4,
             int choice5, int choice6)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
     
       int choice7 = 0;//initialize choice7

     do {//duplicate validation do-while loop
         
        do {//user input validation nested do-while loop
        
        System.out.println("Enter a number between 1 and 9.");
        
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");
            
            input.next();//clear input   
        }
         
        choice7 = input.nextInt();//set choice7
        
        if (choice7 > 9 || choice7 < 1)
        {
          System.out.println("Error! Invalid entry.");
        }
       
        if (choice7 == choice1 || choice7 == choice2 || choice7 == choice3 
          || choice7 == choice4 || choice7 == choice5 || choice7 == choice6)
       {
        System.out.println("Error! That space is already occupied.");
        System.out.println("Choose another space on the board.");   
       }
        
    } while (choice7 > 9 || choice7 < 1);//end do-while
       
 } while (choice7 == choice1 || choice7 == choice2 || choice7 == choice3 
          || choice7 == choice4 || choice7 == choice5 || choice7 == choice6);//end outer do-while
  
       return choice7;
   }//end method 
    
      //begin GetChoiceEight method
      private static int GetChoiceEight(int choice1, int choice2, int choice3, int choice4,
             int choice5, int choice6, int choice7)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
      
       int choice8 = 0;//initialize choice8

    do {//duplicate validation do-while loop
        
       do {//user input validation do-while loop
        
        System.out.println("Enter a number between 1 and 9.");
        
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");
            
            input.next();//clear input   
        }
         
        choice8 = input.nextInt();//set choice8
        
        if (choice8 > 9 || choice8 < 1)
        {
          System.out.println("Error! Invalid entry.");   
        }
       
        if (choice8 == choice1 || choice8 == choice2 || choice8 == choice3 || 
         choice8 == choice4 || choice8 == choice5 || choice8 == choice6 ||
         choice8 == choice7)
       {
        System.out.println("Error! That space is already occupied.");
        System.out.println("Choose another space on the board.");   
       }
        
    } while (choice8 > 9 || choice8 < 1);//end inner do-while

} while (choice8 == choice1 || choice8 == choice2 || choice8 == choice3 || 
         choice8 == choice4 || choice8 == choice5 || choice8 == choice6 ||
         choice8 == choice7);//end outer do-while loop
 
       return choice8;
   }//end method 
   
      //begin GetChoiceNine method
      private static int GetChoiceNine(int choice1, int choice2, int choice3, int choice4,
             int choice5, int choice6, int choice7, int choice8)
   {
       //activate user input
       Scanner input = new Scanner( System.in );
       
       int choice9 = 0;//initialize choice9
           
    do {//duplicate validation do-while loop
        
       do {//user input validation do-while loop
        
        System.out.println("Enter a number between 1 and 9.");
   
        while (!input.hasNextInt()) 
        {
            System.out.println("Error! Please enter a number between 1 and 9.");
            
            input.next();//clear input  
        }
         
        choice9 = input.nextInt();//set choice9
        
        if (choice9 > 9 || choice9 < 1)
        {
          System.out.println("Error! Invalid entry."); 
        }
       
        if (choice9 == choice1 || choice9 == choice2 || choice9 == choice3 || 
         choice9 == choice4 || choice9 == choice5 || choice9 == choice6 ||
         choice9 == choice7 || choice9 == choice8)
       {
        System.out.println("Error! That space is already occupied.");
        System.out.println("Choose another space on the board.");   
       }
        
    } while (choice9 > 9 || choice9 < 1);//end inner do-while
       
} while (choice9 == choice1 || choice9 == choice2 || choice9 == choice3 || 
         choice9 == choice4 || choice9 == choice5 || choice9 == choice6 ||
         choice9 == choice7 || choice9 == choice8);//end outer do-while loop

       return choice9;
   }//end method 
      
      //begin GetSentinel method
      private static int GetSentinel ()
      {
          Scanner input = new Scanner( System.in );
          int sentinel = 0;
          
System.out.println("Enter 'Q' to exit program. Press 'ENTER' to continue.");
        String answer = input.nextLine();//If Q or q is entered, program ends
        
        if (answer.equalsIgnoreCase("Q"))//end program test
        {
            sentinel = 1;//Sets sentinel value
            System.out.println("You have chosen to exit the game.");
        }
        
          return sentinel;
      }//end method
      
      //begin ShowResults method
      private static int ShowResults (int victory, int choice9)
      {
          int sentinel = 0;//initialize sentinel
          
          if (victory == 1)//player X victory
          {
              System.out.println ("Player X wins!");
              
              sentinel = 1;//set sentinel
          }
          
          if (victory == 2)//player O victory
          {
              System.out.println ("Player O wins!");
              sentinel = 1;//set sentinel
          }
          
          if (choice9 != 0 && victory != 1 && victory != 2)//draw
          {
              System.out.println("The game is a draw.");
              sentinel = 1;//set sentinel
          }
          
          return sentinel;
      }//end method
              
}//end class
