package com.diffblue.javademo.shop;



/**
 * Created by jamesw on 26/06/2017.
 */
public class Product {
  /* Basic Product information is:
   * Name
   * Price in GBP
   * SKU
   * Weight
   * Medium
   */

  private String name = new String("");
  private Integer price = new Integer(0);
  private String sku = new String ("");
  private int weight = 0;
  private String medium = new String("");

  public Product(String newSku, String newName, Integer newPrice, String newMedium, int newWeight) {
    setSku(newSku);
    setName(newName);
    setPrice(newPrice);
    setMedium(newMedium);
    setWeight(newWeight);
  }

  public boolean setName(String newName) {
    name = newName;
    return true;
  }

  public String getName(){
    return name;
  }

  public void setPrice(Integer newPrice) {
    price = newPrice;
  }

  public Integer getPrice() {
    return price;
  }

  public boolean setSku(String newSku) {
    /* SKU must meet the following conditions:
     *  Length is 7
     *  First four characters are uppercase ASCII letters
     *  Last three characters are numbers
     */

    // Check for the length
    if (newSku.length() != 7) {
      return false;
    }

    // Check for the prefix (4 letters)
    for (int i = 0; i < 4; i++) {
      char currentChar = newSku.charAt(i);
      if ((int) currentChar < 65 || (int) currentChar > 90) {
        return false;
      }
    }

    // Check for the suffix (3 numbers)
    for (int i = 4; i < 7; i++ ) {
      char currentChar = newSku.charAt(i);
      if ((int) currentChar < 48 || (int) currentChar > 57) {
        return false;
      }
    }

    sku = newSku;
    return true;
  }

  public String getSku() {
    return sku;
  }

  public boolean setWeight(int newWeight) {
    // Largest weight is 99.999kg
    // Unit for weight is grammes

    if (newWeight > 99999) {
      return false;
    }

    weight = newWeight;
    return true;
  }

  public int getWeight() {
    return weight;
  }

  public boolean setMedium(String newMedium) {
    // Medium is Electronic
    if (newMedium.equals("Electronic")) {
      medium = newMedium;
      return true;
    }
    return false;
  }

  public String getMedium() {
    return medium;
  }
}
