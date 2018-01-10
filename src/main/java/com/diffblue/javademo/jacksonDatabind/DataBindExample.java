package com.diffblue.javademo.jacksonDatabind;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBindExample {

  public String example(String name, int age) throws Exception {

    ObjectMapper mapper = new ObjectMapper();

    MyValue value = mapper.readValue("{\"name\":\"" + name + "\", \"age\":" + age + "}", MyValue.class);

    String retval = mapper.writeValueAsString(value);
    return retval;

  }
}
