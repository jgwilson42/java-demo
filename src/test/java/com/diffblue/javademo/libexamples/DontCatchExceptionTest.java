package com.diffblue.javademo.libexamples;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DontCatchExceptionTest {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void dontCatchNoException() {

    // Arrange
    DontCatchException myTestObject = new DontCatchException();

    // Act
    boolean retVal = myTestObject.dontCatchRuntime(2);

    // Assert
    Assert.assertEquals(false, retVal);

  }

  @Test
  public void noCatchException() {

    // Arrange
    exception.expect(ArithmeticException.class);
    DontCatchException myTetObject = new DontCatchException();

    // Act
    boolean retVal = myTetObject.dontCatchRuntime(0);

    // Assert
    Assert.fail("Due to exception this will never be reached");
  }

  @Test
  public void throwsExceptionNoException() throws CustomException {
    // Arrange
    exception = ExpectedException.none();
    DontCatchException myTestObject = new DontCatchException();

    // Act
    boolean retVal = myTestObject.throwsException(2);

    // Assert
    Assert.assertEquals(true, retVal);
  }

  @Test
  public void throwsExceptionException() throws CustomException {
    // Arrange
    exception.expect(CustomException.class);
    DontCatchException myTestObject = new DontCatchException();

    // Act
    boolean retVal = myTestObject.throwsException(6);

    // Assert
    Assert.fail("Due to exception this will never be reached");
  }
}
