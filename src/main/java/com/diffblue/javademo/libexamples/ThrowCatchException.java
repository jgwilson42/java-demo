package com.diffblue.javademo.libexamples;

public class ThrowCatchException {

  /**
   * Demonstrates basic behaviour of throwing a custom exception.
   * @param input integer >5 and >10 throw exceptions with different messages
   * @return true
   * @throws CustomException invalid input
   */

  public boolean mayThrow(int input) throws CustomException {
    if (input > 10) {
      CustomException myException = new CustomException();
      throw myException;
    }
    if (input > 5) {
      CustomException myException = new CustomException("My message");
      throw myException;
    }
    return true;
  }

  /**
   * Demonstrates example where a custom exception is caught in the code.
   * @param input int passed to mayThrow
   * @return false if exception otherwise true
   */

  public boolean catchThrow(int input) {
    try {
      this.mayThrow(input);
    } catch (CustomException exception) {
      return false;
    }
    return true;
  }

  /**
   * Demonstrates a runtime exception which is caught in the code.
   * @param input 0 to cause exception
   * @return true if 10/input > 5 (10/0 assumed to be infinite)
   */

  public boolean catchRuntime(int input) {
    try {
      if (10 / input > 5) {
        return true;
      } else {
        return false;
      }
    } catch (ArithmeticException exception) {
      return true;
    }
  }

  /**
   * Demonstrates finally block.
   * @param input 0 for caught exception, >10 for uncaught exception
   * @return -1 for uncaught exception
   */

  public int finallyBlock(int input) {
    int result = 10;

    try {
      result = result / input;
      if (result < 1) {
        result = -1;
        throw new IndexOutOfBoundsException();
      }
    } catch (ArithmeticException exception) {
      result = result * 2;
    } finally {
      return result;
    }
  }
}
