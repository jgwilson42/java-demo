package com.diffblue.javademo.com.diffblue.javademo.fileprocessing;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ParseDataTest {

  /**
   * Parse a comma separated file
   */
  @Test
  public void csvTest() {
    // Arrange
    String testString = "Name,Phone,Address\nJohn,123,100 Foo";
    ParseData myParser = new ParseData();

    // Act
    ArrayList<ArrayList<String>> retVal = myParser.parseCSV(testString);

    // Assert
    ArrayList<ArrayList<String>> refVal = new ArrayList<ArrayList<String>>();
    ArrayList<String> headers = new ArrayList<String>();
    headers.add("Name");
    headers.add("Phone");
    headers.add("Address");
    ArrayList<String> data = new ArrayList<String>();
    data.add("John");
    data.add("123");
    data.add("100 Foo");
    refVal.add(headers);
    refVal.add(data);

    Assert.assertEquals(refVal, retVal);
  }

  /**
   * Parse a space separated file
   */
  @Test
  public void ssvTest() {
    // Arrange
    String testString = "Name Phone Address\nJohn 123 100_Foo";
    ParseData myParser = new ParseData();

    // Act
    ArrayList<ArrayList<String>> retVal = myParser.parseSSV(testString);

    // Assert
    ArrayList<ArrayList<String>> refVal = new ArrayList<ArrayList<String>>();
    ArrayList<String> headers = new ArrayList<String>();
    headers.add("Name");
    headers.add("Phone");
    headers.add("Address");
    ArrayList<String> data = new ArrayList<String>();
    data.add("John");
    data.add("123");
    data.add("100_Foo");
    refVal.add(headers);
    refVal.add(data);

    Assert.assertEquals(refVal, retVal);
  }

  /**
   * Parse a tab separated file
   */
  @Test
  public void tsvTest() {
    // Arrange
    String testString = "Name\tPhone\tAddress\nJohn\t123\t100 Foo";
    ParseData myParser = new ParseData();

    // Act
    ArrayList<ArrayList<String>> retVal = myParser.parseTSV(testString);

    // Assert
    ArrayList<ArrayList<String>> refVal = new ArrayList<ArrayList<String>>();
    ArrayList<String> headers = new ArrayList<String>();
    headers.add("Name");
    headers.add("Phone");
    headers.add("Address");
    ArrayList<String> data = new ArrayList<String>();
    data.add("John");
    data.add("123");
    data.add("100 Foo");
    refVal.add(headers);
    refVal.add(data);

    Assert.assertEquals(refVal, retVal);
  }

  /**
   * Parse based on enum
   */
  @Test
  public void ssvEnumTest() {
    // Arrange
    String testString = "Name Phone Address\nJohn 123 100_Foo";
    ParseData myParser = new ParseData();

    // Act
    ArrayList<ArrayList<String>> retVal = myParser.parse(testString, ParseData.Separator.SPACE);

    // Assert
    ArrayList<ArrayList<String>> refVal = new ArrayList<ArrayList<String>>();
    ArrayList<String> headers = new ArrayList<String>();
    headers.add("Name");
    headers.add("Phone");
    headers.add("Address");
    ArrayList<String> data = new ArrayList<String>();
    data.add("John");
    data.add("123");
    data.add("100_Foo");
    refVal.add(headers);
    refVal.add(data);

    Assert.assertEquals(refVal, retVal);
  }

}
