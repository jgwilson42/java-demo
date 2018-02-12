package com.diffblue.javademo.com.diffblue.javademo.fileprocessing;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.diffblue.javademo.com.diffblue.javademo.fileprocessing.ParseData.Separator.COMMA;
import static com.diffblue.javademo.com.diffblue.javademo.fileprocessing.ParseData.Separator.SPACE;
import static com.diffblue.javademo.com.diffblue.javademo.fileprocessing.ParseData.Separator.TAB;

public class ParseData {

  public enum Separator { COMMA, SPACE, TAB};

  public ArrayList<ArrayList<String>> parseCSV(String input) {
    ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();

    for (String line : input.split("\n")) {
      ArrayList<String> lineResults = new ArrayList<String>();
      // TODO: What could Pattern.quote add here?
      for (String cell : line.split(",")) {
        lineResults.add(cell);
      }
      results.add(lineResults);
    }
    return results;
  }

  public ArrayList<ArrayList<String>> parseSSV(String input) {
    ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();

    for (String line : input.split("\n")) {
      ArrayList<String> lineResults = new ArrayList<String>();
      for (String cell : line.split(" ")) {
        lineResults.add(cell);
      }
      results.add(lineResults);
    }
    return results;
  }

  public ArrayList<ArrayList<String>> parseTSV(String input) {
    ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();

    for (String line : input.split("\n")) {
      ArrayList<String> lineResults = new ArrayList<String>();
      for (String cell : line.split("\t")) {
        lineResults.add(cell);
      }
      results.add(lineResults);
    }
    return results;
  }

  public ArrayList<ArrayList<String>> parse(String input, Separator separator ) {
    switch (separator) {
      case COMMA:
        return parseCSV(input);
      case SPACE:
        return parseSSV(input);
      case TAB:
        return parseTSV(input);
    }
    return new ArrayList<ArrayList<String>>();
  }
}
