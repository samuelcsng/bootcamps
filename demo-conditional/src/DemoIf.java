public class DemoIf {
  public static void main(String[] args) {
    int x = 30;
    boolean result = x >= 30; // true

    if (x >= 30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    boolean isXLargeThan30 = x >= 30; // true

    if (isXLargeThan30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    // 8 primitives, String (equals(), charAt(), length())

    // Example 1
    int number = -3;

    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("the number i negative.");
    } else {
      System.out.println("the number is zero");
    }
    // "the number is positive"
    // "the number is negative"

    // Example 2 (Avoid overlap)
    int score = 85;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    // Example 3
    int a = 20;
    int b = 10;
    int max; // declaration
    int min;
    if (a > b) {
      max = a; // assignment
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min);
    // "20 is larger than 10"



    // Example 4
    String day = "Monday";
    if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day)
        || "Thursday".equals(day) || "Friday".equals(day)) {
      System.out.println(day + " is weekday.");
    } else if (day.equals("Saturday") || day.equals("Sunday")) {
      System.out.println(day + " is weekend.");
    }
    // "Wednesday is weekday."
    // "Sunday is weekend."
    // "Saturday is weekend."
    boolean weekday =
        "Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day)
            || "Thursday".equals(day) || "Friday".equals(day) ? true : false;
    if (weekday) {
      System.out.println(day + " is weekday");
    } else {
      System.out.println(day + " is weekend");
    }
    // String str1 =
    // "Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day)
    // || "Thursday".equals(day) || "Friday".equals(day) ? "weekday"
    // : "weekend";
    // System.out.println(str1);


    // Example 5
    int num = 7;
    if (num % 2 == 0) {
      System.out.println(num + " is an even number.");
    } else {
      System.out.println(num + " is an odd number.");
    }
    // 7 is an odd number.
    // 8 is an even number.

    // Example 6
    String str = "hello";
    // String str = "";
    if (str.length() == 0) {
      System.out.println("This is an empty String");
    } else {
      System.out.println(
          "The last character of str is " + str.charAt(str.length() - 1));
    }
    // The last character of str is o
    // This is an empty String

    // Example 7
    // Reversed String
    String s = "abc";
    String strOutput = "";
    int strLength = s.length();
    strOutput = strOutput + "a";
    System.out.println(strOutput);
    System.out.println(s.charAt(strLength - 1));
    // The reversed string is cba

    // Example 8
    // Leap Year
    // 1. Divided by 4
    // 2. Not Divided by 100
    // 3. Or divided by 400

    int year = 2400;
    boolean check1 = year % 4 == 0;
    boolean check2 = year % 100 != 0;
    boolean check3 = year % 400 == 0;
    boolean checkAll = check1 && check2 || check3;
    // System.out.println(check1 + " " + check2 + " " + check3);

    if (checkAll) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year");
    }

    // 1900 is not a leap year.
    // 2000 is a leap year
    // 2004 is a leap year
    // 2003 is not a leap year



    // Example 9
    int age = 15;
    boolean isCitizen = true;

    boolean isLargerThan18 = age >= 18;
    boolean eligibleToVote = isCitizen && isLargerThan18;
    if (eligibleToVote) {
      System.out
          .println("age 18 or above and he is a citizen -> eligible to vote");
    } else if (isLargerThan18 == false && isCitizen) {
      System.out.println("Not eligible. Age < 18");
    } else if (isLargerThan18 && isCitizen == false) {
      System.out.println("Not eligible. Not a citizen");
    } else if (isLargerThan18 == false && isCitizen == false) {
      System.out.println("Not eligible. Age < 18 and not a citizen");
    }
    // Eligible to vote.
    // Not eligible. Age < 18.
    // Not eligible. Not a citizen.
    // Not eligible. Age < 18 and not a citizen



    // Example 10
    double totalPurchase = 250.0;
    double discount;
    double amountToPay;

    // >=500.0 -> 20% off
    // >=200.0 -> 10% off
    // < 200.0 -> no discount
    if (totalPurchase >= 500.0) {
      discount = totalPurchase * 0.2;
      amountToPay = totalPurchase * 0.8;
      System.out.println("Discount amount = " + discount);
      System.out.println("Amount to Pay = " + amountToPay);
    } else if (totalPurchase >= 200.0 && totalPurchase < 500.0) {
      discount = totalPurchase * 0.1;
      amountToPay = totalPurchase * 0.9;
      System.out.println("Discount amount = " + discount);
      System.out.println("Amount to Pay = " + amountToPay);
    } else {
      System.out.println("no discount");
    }
    // System.out.println("Discount amount = " + discount);
    // System.out.println("Amount to Pay = " + amountToPay);

    boolean isGE500 = totalPurchase >= 500.0;
    boolean isGE200 = totalPurchase >= 200.0 && totalPurchase < 500.0;
    boolean isL200 = totalPurchase < 200;
    if (isGE500) {
    }



    // Example 11
    char c = 'c';
    // a e i o u -> vowel
    boolean isVowel = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    if (isVowel) {
      System.out.println(c + " is vowel.");
    } else {
      System.out.println(c + " is consonant.");
    }
    // c is consonant.



    // Teaching
    // contains()
    String s1 = "hello";
    System.out.println(s1.contains("ll")); // true
    System.out.println(s1.contains("lll")); // false
    s1 = "helloll";
    System.out.println(s1.contains("ll")); // true

    // Example 12
    String password = "Admin1234567#";
    // Strong password definition:
    // # ! @ $ -. special character
    // password length >=12

    // It is a strong password.
    // It is a week password. No special character.
    // It is a week password. Length < 12.
    boolean hasSpecialChar = password.contains("#") || password.contains("!")
        || password.contains("@") || password.contains("$");
    int passwordLength = password.length();
    boolean isStrongPassword = hasSpecialChar && passwordLength >= 12;
    if (isStrongPassword) {
      System.out.println("It is a strong password");
    } else if (hasSpecialChar == false && passwordLength >= 12) {
      System.out.println("It is a weak password. No special character.");
    } else if (hasSpecialChar && passwordLength < 12) {
      System.out.println("It is a weak password. Length < 12");
    }

  }
}
