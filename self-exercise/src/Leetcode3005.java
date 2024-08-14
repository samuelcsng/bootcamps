public class Leetcode3005 {
  public static void main(String[] args) {

    int[] nums = {1, 2, 2, 3, 1, 4};
    int[] counts = new int[100];

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
      counts[nums[i] - 1]++;
      System.out.println(counts[nums[i] - 1]);
    }
    // find max frequency
    int maxCount = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > maxCount) {
        maxCount = counts[i];
      }
    }
    // loop to sum
    int totalCount = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] == maxCount)
        totalCount += counts[i];
    }

    System.out.println(totalCount);

    // return totalCount;



  } // end of main()
}
