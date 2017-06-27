package com.diffblue.javademo.shop;

import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

/**
 * Created by jamesw on 26/06/2017.
 */
public class ProductTest {

  @Test
  // It is possible to create a product
  public void createProductTest() {
    /* Basic Product information is:
     * Name
     * Price in GBP
     * SKU
     * Weight
     * Medium
     */

    String name = new String("Test Product");
    BigDecimal price = new BigDecimal("9.99");
    String sku = new String("TEST001");
    int weight = 0;
    String medium = new String("Electronic");

    // Create the product using the constructor
    Product myProduct = new Product(sku, name, price, medium, weight);

    // Check that the values have been set correctly
    Assert.assertEquals(sku, myProduct.getSku());
    Assert.assertEquals(name, myProduct.getName());
    Assert.assertEquals(price, myProduct.getPrice());
    Assert.assertEquals(medium, myProduct.getMedium());
    Assert.assertEquals(weight, myProduct.getWeight());
  }
}
