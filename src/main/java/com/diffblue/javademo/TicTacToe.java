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
  public byte checkTicTacToePosition(byte[] a) {
    // First check number of cells
    if (a.length != 9) {
      return -1;
    }

    // Next check number of moves each player made
    int diff = 0;
    for (int i = 0; i < 9; i++) {
      if (a[i] == 1) {
        diff++;
      } else if (a[i] == 2) {
        diff--;
      } else if (a[i] != 0) {
        return -1;
      }
    }

    // Fail if one player has made too many moves compared to the other
    if (diff > 1 || diff < -1) {
      return -1;
    }

    // Otherwise we know we have a valid board state

    // Check if a row and column has won
    for (int i = 0; i < 3; i++) {
      if (a[i] == a[3 + i] && a[i] == a[6 + i] && a[i] !=0) {
	return a[i];
      }

      if (a[3 * i] == a[3 * i + 1] && a[3 * i] == a[3 * i + 2] && a[3 * i] != 0) {
	return a[3 * i];
      }
    }

    // Check if the top-left bottom-right diagonal has won
    if (a[0] == a[4] && a[0] == a[8] && a[0] != 0) {
	return a[0];
    }

    // Check if the top-right bottom-left diagonal has won
    if (a[2] == a[4] && a[2] == a[6]&& a[2] != 0) {
	return a[2];
    }

    // Neither player has won yet
    return 0;
  }
}
