public class SelfExercise {
  public static void main(String[] args) {

    short input1 = 10;
    short input2 = 9990;

    // short output1 = input1 * input2; // short (-32768 to 32767)
    int output1 = input1 * input2; // int (...) larger range than short, ... byte < short < int < long
    System.out.println(output1);

    int output2 = input2 * input1 * input2; // need to consider overflow
    System.out.println(output2);

    // nested if-else, consideration for different cases
    int age = -50;
    if (age < 0) {
      System.out.println("invalid age range...must be +ve");
    } else if (age < 16) {
      System.out.println("You are a teenage at age" + age);
    } else if (age < 50) {
      System.out.println("Strong and Mature ... at age " + age);
    } else {
      System.out.println("getting old and retired...");
    }

    // below NOT OK, logical thinking
    if (age < 200) { // condition fulfilled most of the time
      System.out.println("getting old and retirement...");
    } else if (age < 50) {
      System.out.println("Strong and Mature ... at age " + age);
    } else if (age < 16) {
      System.out.println("You are a teenage at age" + age);
    } else if (age < 0) {
      System.out.println("invalid age range...must be +ve");
    }


  }
}
