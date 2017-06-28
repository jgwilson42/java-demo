package com.diffblue.javademo;

public class Shape {

  int noOfSides = 0;
  int length = 0;
  int width = 0;
  int area = 0;

  public Shape setupSquare(int sideLength) {
    // Length must be non zero
    if (sideLength > 0 ) {
      length = sideLength;
      width = sideLength;
      area = length * width;
      noOfSides = 4;
    }
    return this;
  }

  public Shape setupRectangle(int userLength, int userWidth) {
    // Length and Width must be non zero
    if (userLength > 0 && userWidth > 0) {
      length = userLength;
      width = userWidth;
      area = length * width;
      noOfSides = 4;
    }

    return this;
  }

}