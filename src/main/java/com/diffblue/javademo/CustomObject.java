package com.diffblue.javademo;

public class CustomObject {

  String firstname = "";
  String lastname = "";
  int age = 0;

  public CustomObject createPerson(String userFirstname, String userLastname, int userAge) {
    // Check that the firstname is valid
    if (userFirstname.equals("Jane") || userFirstname.equals("Bob")) {
      firstname = userFirstname;
    }

    // Check that the lastname is valid
    if (userLastname.equals("Foo") || userLastname.equals("Bar")) {
      lastname = userLastname;
    }

    // Check that age is ok
    if (userAge > 0 && userAge < 100 ) {
      age = userAge;
    }

    return this;
  } 
}