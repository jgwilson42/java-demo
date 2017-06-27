package com.diffblue.javademo.shop;

import java.util.ArrayList;

/**
 * Created by jamesw on 27/06/2017.
 */
public class Basket {

  private ArrayList<Product> products = new ArrayList<Product>();
  private Integer vat = new Integer(120);
  private String customerId = new String();

  public Basket (String custId) {
    setCustId(custId);
  }

  public boolean setCustId(String newCustId) {
    /* Customer id must meet the following:
     *  - Length is 7
     *  - First four characters are ASCII letters
     *  - Last three characters are numbers
     */

    // Check for the length
    if (newCustId.length() != 7) {
      return false;
    }

    // Check for the prefix (4 letters)
    for (int i = 0; i < 4; i++) {
      char currentChar = newCustId.charAt(i);
      if ((int) currentChar < 65 || (int) currentChar > 90) {
        return false;
      }
    }

    // Check for the suffix (3 numbers)
    for (int i = 4; i < 7; i++ ) {
      char currentChar = newCustId.charAt(i);
      if ((int) currentChar < 48 || (int) currentChar > 57) {
        return false;
      }
    }

    customerId = newCustId;
    return true;
  }

  public void addProduct(Product product, int quantity) {
    products.add(product);
  }

  public Integer getValue() {
    Integer value = new Integer(0);

    for(Product currentProduct:products) {
      value = value + (currentProduct.getPrice() * (vat / 100));
    }

    return value;
  }
}
