package com.diffblue.javademo.shop;

/**
 * Created by jamesw on 02/07/2017.
 */
public class User {

  private String firstname;
  private String lastname;
  private String address;
  private String phoneNumber;
  private String eMailAddress;
  private int invoiceTerms = 0;

  public boolean setName(String newFirstName, String newLastName) {

    // Make sure we have both parameters set
    if (newFirstName.length() == 0 || newLastName.length() == 0 ) {
      return false;
    }
    firstname = newFirstName;
    lastname = newLastName;
    return true;
  }

  public boolean setAddress(String newAddress) {

    // Check that we have a full address (i.e. some commas)
    if (newAddress.contains(",")) {
      address = newAddress;
      return true;
    }
    return false;
  }

  public boolean setPhoneNumber(String newPhoneNumber) {

    /* Check that we have a phone number with area code, i.e.:
     *  More than 10 characters
     *  First character is a 0
     */

    if (newPhoneNumber.length() >= 10 && newPhoneNumber.charAt(0) == '0') {
      phoneNumber = newPhoneNumber;
      return true;
    }
    return false;
  }

  public boolean setEmailAddress(String newEmail) {

    // Check that the e-mail address ends with .com
    if (newEmail.endsWith(".com")) {
      eMailAddress = newEmail;
      return true;
    }
    return false;
  }

  public boolean setInvoiceTerms(int newInvoiceTerms) {

    // Number of days to pay the invoice. 0 is no invoice terms i.e. prepay
    if (newInvoiceTerms >= 0 && newInvoiceTerms < 181 ) {
      invoiceTerms = newInvoiceTerms;
      return true;
    }
    return false;
  }

  public boolean checkDetails() {
    // All details must be set to be a valid customer
    boolean result = true;

    if (firstname.length() == 0 ) {
      result = false;
    }
    if (lastname.length() == 0 ) {
      result = false;
    }

    if (address.length() == 0 ) {
      result = false;
    }

    if (phoneNumber.length() == 0 ) {
      result = false;
    }

    if (eMailAddress.length() == 0 ) {
      result = false;
    }

    return result;

  }
}
