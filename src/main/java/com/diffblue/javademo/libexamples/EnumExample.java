package com.diffblue.javademo.libexamples;

public class EnumExample {

  private enum Day { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday }

  private Day day;

  /**
   * Set the current day based on string entry.
   * @param day current day as string
   */

  public void setDay(String day) {
    if (day.equals("Monday")) {
      this.day = Day.Monday;
    } else if (day.equals("Tuesday")) {
      this.day = Day.Tuesday;
    } else if (day.equals("Wednesday")) {
      this.day = Day.Wednesday;
    } else if (day.equals("Thursday")) {
      this.day = Day.Thursday;
    } else if (day.equals("Friday")) {
      this.day = Day.Friday;
    } else if (day.equals("Saturday")) {
      this.day = Day.Saturday;
    } else if (day.equals("Sunday")) {
      this.day = Day.Sunday;
    }
  }

  /**
   * Is today a weekday.
   * @return true for yes false for no
   */

  public boolean isWeekDay() {
    if (day == Day.Monday || day == Day.Tuesday || day == Day.Wednesday
        || day == Day.Thursday || day == Day.Friday) {
      return true;
    }
    return false;
  }
}
