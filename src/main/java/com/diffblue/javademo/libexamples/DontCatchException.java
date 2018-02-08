package com.diffblue.javademo.libexamples;

public class DontCatchException {

  /**
   * Don't catch divide by zero runtime exception.
   * @param input if 0 will throw an exception
   * @return true for >5, false for <5
   */

  public boolean dontCatchRuntime(int input) {
    if (10 / input > 5) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Passes the custom exception up to the calling function.
   * @param input >5 throws an exception
   * @return true if no exception
   * @throws CustomException passed up to the caller
   */

  public boolean throwsException(int input) throws CustomException {
    return this.mayThrow(input);
  }

  /**
   * Supporting function for throwsException.
   * @param input >5 throws exception
   * @return true if no exception
   * @throws CustomException passed up to the caller
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
}
