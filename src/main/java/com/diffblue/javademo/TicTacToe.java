package com.diffblue.javademo;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

public class TicTacToe {
  /**
   * Checks if either player has won a tic-tac-toe game.
   * Inputs represent cells on the board:
   *   1: player X field
   *   2: player O field
   *   0: empty position
   * Return values:
   *  -1: not a valid board state
   *   0: neither player has won
   *   1: player X has won
   *   2: player O has won
   */
  byte checkTicTacToePosition(byte[] board) {
    // First check number of cells
    if (board.length != 9) {
      return -1;
    }

    // Next check number of moves each player made
    byte diff = 0;
    for (byte i = 0; i < 9; i++) {
      if (board[i] == 1) {
        diff++;
      } else if (board[i] == 2) {
        diff--;
      } else if (board[i] != 0) {
        return -1;
      }
    }

    // Fail if one player has made too many moves compared to the other
    if (diff > 1 || diff < -1) {
      return -1;
    }

    // Otherwise we know we have a valid board state

    // Check if a row and column has won
    for (byte i = 0; i < 3; i++) {
      if (board[i] == board[3 + i] && board[i] == board[6 + i]) {
        if (board[i] == 1) {
          return 1;
        } else if (board[i] == 2) {
          return 2;
        }
      }

      if (board[3 * i] == board[3 * i + 1] && board[3 * i] == board[3 * i + 2]) {
        if (board[3 * i] == 1) {
          return 1;
        } else if (board[3 * i] == 2) {
          return 2;
        }
      }
    }

    // Check if the top-left bottom-right diagonal has won
    if (board[0] == board[4] && board[0] == board[8]) {
      if (board[0] == 1) {
        return 1;
      } else if (board[0] == 2) {
        return 2;
      }
    }

    // Check if the top-right bottom-left diagonal has won
    if (board[2] == board[4] && board[2] == board[6]) {
      if (board[2] == 1) {
        return 1;
      } else if (board[2] == 2) {
        return 2;
      }
    }

    // Neither player has won yet
    return 0;
  }
}
