public class DemoSwitchExpression {
  public static void main(String[] args) {
    // Switch Expression != Switch
    int score = getScore(suit);

    int score2 = getScore2(suit);

    // default scenario
    String day = "Monday";
    // !!! The range of String value is un-defined. So, we have to include "default scenario".
    String result = switch (day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
      case "Saturday", "Sunday" -> "Weedend";
      default -> "Not Found";
    };

    // !! yield (Similar to "return", but used in switch expression)
    // !!! For the code block of a case with more than one line of code ...
    int dayNumber = 2; // 1 - 7
    String result2 = switch(dayNumber){
      case 1 -> {
        yield "Monday";
      }
      case 2 -> {
        yield "Tuesday";
      }
      case 3 -> {
        yield "Wednesday";
      }
      case 4 -> {
        yield "Thursday";
      }
      case 5 -> {
        yield "Friday";
      }
      case 6 -> {
        yield "Saturday";
      }
      case 7 -> {
        yield "Sunday";
      }
      default -> {
        yield "Not Found";
      }
    };


  } // main()

  // Traditional Switch (before Java 14)
  // !!! Method (return value) + Switch
  // !!! 1. Allow missing enum value
  // !!! 2. You need break yourself.
  // !!! 3. No return value
  public static int getScore(Suit suit) {
    int score = -1;
    switch (suit) {
      case DIAMOND:
        score = 1;
        break;
      case CLUB:
        score = 2;
        break;
      case HEART:
        score = 3;
        break;
      case SPADE:
        score = 4;
        break;

      default:
        break;
    }
  }

  // After Java 14, switch expresion (similar to lambda)
  // !!! 1. It help check misssing / duplicated enum value (Not Allow)
  // !!! 2. Not require "break". Instead, we return value directly.
  // !!! 3. Switch expression has to return something.
  public static getScore2(Suit suit){
  Suit suit = Suit.CLUB;
  int score = switch (suit){
    case DIAMOND, CLUB -> 1;
    // case CLUB -> 2;
    case HEART -> 3;
    case SPADE -> 4;
  };

  }
}
