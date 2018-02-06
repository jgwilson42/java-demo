package com.diffblue.javademo;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

public class Search {
  /**
   * Checks if an integer is contained within an array.
   */
  public boolean contains(int [] array, int target) {
    boolean found = false;
    int count;

    for (count = 0; count < array.length; ++count) {
      if (array[count] == target) {
        found = true;
      }
    }

    return found;
  }
}
