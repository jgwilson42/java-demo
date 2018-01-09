package com.diffblue.javademo.jacksonDatabind;

import org.junit.Assert;
import org.junit.Test;

public class DataBindExampleTest {

  @Test
  public void exampleTest() {
    // Arrange
    DataBindExample myExample = new DataBindExample();

    // Act
    String retval = myExample.example("foo", 10);

    // Assert
    Assert.assertEquals("{\"name\":\"foo\",\"age\":10}", retval);
  }
}
