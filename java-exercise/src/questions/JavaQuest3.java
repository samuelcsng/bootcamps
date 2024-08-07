package questions;

import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1:
   * Input a month number: 2 
   * Input a year: 2016 
   * 
   * February 2016 has 29 days
   * 
   * Example 2:
   * Input a month number: 12 
   * Input a year: 2014 
   * 
   * December 2014 has 31 days
   */
  
   // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    // Complete the switch statement
    switch (month) {
      case 1:
        monthOfName = "January";
        // Code here ...
        number_Of_DaysInMonth=31;
        break;
      case 2:
        monthOfName = "February";
        // The February has 29 days: (Every 4 years and the year cannot divded by 100)
        // or The year can divided by 400
        // otherwise the February should have 28 days only
        // how about other months, December?
        boolean check1 = year % 4 == 0;
        boolean check2 = year % 100 != 0;
        boolean check3 = year % 400 == 0;
        boolean checkAll = check1 && check2 || check3;
        if (checkAll) {
          // System.out.println(year + " is a leap year.");
          number_Of_DaysInMonth=29;
        } else {
          // System.out.println(year + " is not a leap year");
          number_Of_DaysInMonth=28;
        }
        break;
      case 3:
        monthOfName = "March";
        // Code here ...
        number_Of_DaysInMonth=31;
        break;
      case 4:
        monthOfName = "April";
        // Code here ...
        number_Of_DaysInMonth=30;
        break;
      case 5:
        monthOfName = "May";
        // Code here ...
        number_Of_DaysInMonth=31;
        break;
      case 6:
        monthOfName = "June";
        // Code here ...
        number_Of_DaysInMonth=30;
        break;
      case 7:
        monthOfName = "July";
        // Code here ...
        number_Of_DaysInMonth=31;
        break;
      case 8:
        monthOfName = "August";
        // Code here ...
        number_Of_DaysInMonth=31;
        break;
      case 9:
        monthOfName = "September";
        // Code here ...
        number_Of_DaysInMonth=30;
        break;
      case 10:
        monthOfName = "October";
        // Code here ...
        number_Of_DaysInMonth=31;
        break;
      case 11:
        monthOfName = "November";
        // Code here ...
        number_Of_DaysInMonth=30;
        break;
      case 12:
        monthOfName = "December";
        // Code here ...
        number_Of_DaysInMonth=31;
        break;
      default:
        break;
    }
    System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  }

}