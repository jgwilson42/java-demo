package com.diffblue.javademo.libexamples;

import org.junit.Assert;
import org.junit.Test;

public class EnumExampleTest {

  @Test
  public void isWeekDay() {
    // Arrange
    EnumExample myTestThing = new EnumExample();
    myTestThing.setDay("Monday");

    // Act
    boolean retVal = myTestThing.isWeekDay();

    // Assert
    Assert.assertEquals(true, retVal);
  }

  @Test
  public void isNotWeekDay() {
    // Arrange
    EnumExample myTestThing = new EnumExample();
    myTestThing.setDay("Saturday");

    // Act
    boolean retVal = myTestThing.isWeekDay();

    // Assert
    Assert.assertEquals(false, retVal);
  }
}
