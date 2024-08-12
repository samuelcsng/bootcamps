package questions;

/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...
    int max1 = nums[0];
    int max2;
    if (nums[1] > max1) {
      max1 = nums[1];
      max2 = nums[0];
    } else {
      max2 = nums[1];
    }
    System.out.println(max1 + " " + max2);
    secondMax = 0;
    for (int i = 2; i < nums.length; i++) {
      if (nums[i] > max1) {
        max2 = max1;
        max1 = nums[i];
      } else if (nums[i] > max2) {
        max2 = nums[i];
      }
      System.out.println(max1 + " " + max2);
      secondMax = max2;
    }
    System.out.println("Second Max = " + secondMax);
  }
}
