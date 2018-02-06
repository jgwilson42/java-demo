package com.diffblue.javademo.jacksondatabind;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBindExample {

  /**
   * Example using the jackson datbind ObjectMapper.
   * @param name String of the person's name
   * @param age int of the person's current age
   * @return the person
   */

  public String example(String name, int age) {

    try {

      ObjectMapper mapper = new ObjectMapper();

      MyValue value = mapper.readValue("{\"name\":\"" + name
          + "\", \"age\":" + age + "}", MyValue.class);

      String retval = mapper.writeValueAsString(value);
      return retval;
    } catch (Exception e) {
      return "";
    }

  }
}
