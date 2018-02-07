package com.diffblue.javademo.libexamples;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ThrowExceptionTest {

  @Rule public ExpectedException exception = ExpectedException.none();

  @Test
  public void noException() throws CustomException {
    // Arrange
    ThrowCatchException myTestObject  = new ThrowCatchException();

    // Act
    boolean retVal = myTestObject.mayThrow(1);

    // Assert
    Assert.assertEquals(true, retVal);
  }

  @Test
  public void defaultException() throws CustomException {
    // Arrange
    exception.expect(CustomException.class);
    exception.expectMessage("This is a custom exception");
    ThrowCatchException myTestObject  = new ThrowCatchException();

    // Act
    boolean retVal = myTestObject.mayThrow(11);

    // Assert
    Assert.fail("Should never reach here as exception is thrown");
  }

  @Test
  public void customMessage() throws CustomException {
    // Arrange
    exception.expect(CustomException.class);
    exception.expectMessage("My message");
    ThrowCatchException myTestObject  = new ThrowCatchException();

    // Act
    boolean retVal = myTestObject.mayThrow(6);

    // Assert
    Assert.fail("Should never reach here as exception is thrown");
  }

  @Test
  public void caughtException() {
    // Arrange
    exception = ExpectedException.none();
    ThrowCatchException myTestObject = new ThrowCatchException();

    // Act
    boolean retVal = myTestObject.catchThrow(7);

    // Assert
    Assert.assertEquals(false, retVal);
  }

  @Test
  public void catchRuntimeException() {
    // Arrange
    exception = ExpectedException.none();
    ThrowCatchException myTestObject = new ThrowCatchException();

    // Act
    boolean retVal = myTestObject.catchRuntime(0);

    //Assert
    Assert.assertEquals(true, retVal);

  }

  @Test
  public void tryFinally() {
    // Arrange
    exception = ExpectedException.none();
    ThrowCatchException myTestObject = new ThrowCatchException();

    // Act
    int retVal = myTestObject.finallyBlock(2);

    // Assert
    Assert.assertEquals(5, retVal);
  }

  @Test
  public void tryCatchFinally() {
    // Arrange
    exception = ExpectedException.none();
    ThrowCatchException myTestObject = new ThrowCatchException();

    // Act
    int retVal = myTestObject.finallyBlock(0);

    // Assert
    Assert.assertEquals(20, retVal);
  }

  @Test
  public void tryNoCatchFinally() {
    // Arrange
    exception = ExpectedException.none();
    ThrowCatchException myTestObject = new ThrowCatchException();

    // Act
    int retVal = myTestObject.finallyBlock(12);

    // Assert
    Assert.assertEquals(-1, retVal);
  }
}
