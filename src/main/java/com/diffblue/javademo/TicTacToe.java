package com.diffblue.javademo;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

public class TicTacToe {
 
  /* Game engine for TicTacToe
   * Allows the user to:
   *  - Reset the game
   *  - Place moves
   *  - Check whether a player has won
   * Valid players are:
   *  - x
   *  - o
   * Empty square is represented by null
   */

  private char[] board = new char[9];

  public void resetBoard() {
    board = new char[9];
  }

  public void placeMove(int location, char player) throws Exception {
    // Check to make sure the square is empty
    if (board[location] == 'x' || board[location] == 'o') {
      throw new Exception("Invalid location: " + location);
    }
    // Check to make sure the player is valid
    if (this.getNextPlayer() != player) {
      throw new Exception("Invalid player: " + player);
    }
    board[location] = player;
  }

  public char checkWinnder() {

    // Check to see if either player has won via a row
    // Location 0,1,2
    // Location 3,4,5
    // Location 6,7,8
    for (int i=0; i < 7; i = i + 3) {
      if (board[i] == board[i+1] && board[i] == board[i+2]) {
        return board[i];
      }
    }

    // Check to see if either player has won via a column
    // Location 0,3,6
    // Location 1,4,7
    // Location 2,5,8
    for (int i=0; i<3; i++) {
      if (board[i] == board[i+3] && board[i] == board[i+6]) {
        return board[i];
      }
    }

    // Check to see if either player has won via a diagonal
    // Location 0,4,8
    // Location 2,4,6
    if (board[0] == board[4] && board[0] == board[8]) {
      return board[0];
    }
    if (board[2] == board[4] && board[2] == board[6]) {
      return board[2];
    }

    return Character.MIN_VALUE;
  }

  public char getNextPlayer() {
    
    int xMoves = 0;
    int oMoves = 0;

    // Calculate the current number of moves of each player
    for (int i = 0; i < 9; i++) {
      if (board[i] == 'x') {
        xMoves++;
      }
      if (board[i] == 'o') {
        oMoves++;
      }
    }
    // Return the char with the least number of moves
    if (oMoves > xMoves) {
      return 'x';
    } else {
      return 'o';
    }
  }

}