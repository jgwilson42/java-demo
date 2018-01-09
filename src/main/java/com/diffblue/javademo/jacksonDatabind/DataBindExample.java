package com.diffblue.javademo.jacksonDatabind;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBindExample {

  public String example(String name, int age) {
    ObjectMapper mapper = new ObjectMapper();

    try {
      MyValue value = mapper.readValue("{\"name\":\"" + name + "\", \"age\":" + age + "}", MyValue.class);

      return mapper.writeValueAsString(value);
    } catch (Exception e) {
      // Do nothing
    }
    return "";
  }
}
