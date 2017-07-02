package com.diffblue.javademo.shop;

import org.junit.Test;
import org.junit.Assert;


/**
 * Created by jamesw on 02/07/2017.
 */
public class UserTest {

  /* Add a customer to the system
   * Minimum requirements are:
   *   Firstname
   *   Lastname
   *   Address
   *   Phone number
   *   E-mail address
   *   Invoice terms
   */
  @Test
  public void addCustomer() {
    String firstname = "Bob";
    String lastname = "Smith";
    String address = "Diffblue, Oxford, OX1 1JD";
    String phoneNumber = "01865 111222";
    String eMailAddress = "test@localhost.com";
    int invoiceTerms = 0;

    User myUser = new User();

    myUser.setName(firstname, lastname);
    myUser.setAddress(address);
    myUser.setPhoneNumber(phoneNumber);
    myUser.setEmailAddress(eMailAddress);
    myUser.setInvoiceTerms(invoiceTerms);

    Assert.assertEquals(true, myUser.checkDetails());
  }

}
