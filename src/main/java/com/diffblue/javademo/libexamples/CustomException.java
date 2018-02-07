package com.diffblue.javademo.libexamples;

public class CustomException extends Exception {

  public CustomException(String msg) {
    super(msg);
  }

  public CustomException() {
    super("This is a custom exception");
  }
}
