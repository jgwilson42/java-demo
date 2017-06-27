package com.diffblue.javademo.shop;

import org.junit.Test;
import org.junit.Assert;


/**
 * Created by jamesw on 27/06/2017.
 */
public class BasketTest {

  @Test
  // Can add a product to a basket
  public void addProduct() {
    // Setup a product
    String name = new String("Test Product");
    Integer price = new Integer(999);
    String sku = new String("TEST001");
    int weight = 0;
    String medium = new String("Electronic");
    Product myProduct = new Product(sku, name, price, medium, weight);

    // Setup a basket
    String customerId = new String("CUST001");
    Basket myBasket = new Basket(customerId);

    // Add product to the basket
    myBasket.addProduct(myProduct, 1);

    // Calculate the expected value of the basket
    Integer cost = new Integer(999);
    Integer currentVAT = new Integer(120);
    Integer expectedValue = cost * (currentVAT / 100);

    Assert.assertEquals(expectedValue, myBasket.getValue());

  }
}
