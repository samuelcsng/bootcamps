import java.util.Random;

public class DemoMath {

  public static void main(String[] args) {
    // min
    System.out.println(Math.min(7, 3)); // 3
    System.out.println(Math.min(2, 8)); // 2
    System.out.println(Math.min(5, 5)); // 5

    // max
    System.out.println(Math.max(7, 3)); // 7
    System.out.println(Math.max(2, 8)); // 8
    System.out.println(Math.max(5, 5)); // 5

    // Find max
    int[] arr = new int[] {3, 6, -1, 100, 4};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      // if (arr[i] > max) max = arr[i];
      max = Math.max(arr[i], max);
    }
    System.out.println(max); // 100

    // Find min
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      min = Math.min(arr[i], min);
    }
    System.out.println(min); // -1

    // ABS
    int[] arr2 = new int[] {3, 6, -1, -400, 3500};
    // Sum up ABS value
    int sum = 0;
    for (int i = 0; i < arr2.length; i++) {
      sum += arr2[i] < 0 ? arr2[i] * -1 : arr2[i];
    }
    System.out.println(sum); // 3910
    sum = 0;
    for (int i = 0; i < arr2.length; i++) {
      sum += Math.abs(arr2[i]);
    }
    System.out.println(sum); // 3910

    // sqrt()
    int x = 81;
    System.out.println(Math.sqrt(x)); // 9.0

    // Math.pow(double a, double b)
    double result = Math.pow(2.0, 3L);
    System.out.println(result); // 8.0

    // Math.pow(double a, double b)
    result = Math.pow((byte) 2, (short) 3);
    System.out.println(result); // 8.0


    // Math.round() -> nearest integer
    System.out.println(Math.round(10.441111)); // 10 (round to integer)
    System.out.println(Math.round(10.456789)); // 10 (round to integer)
    System.out.println(Math.round(10.496789)); // 10 (round to integer)
    System.out.println(Math.round(10.556789)); // 11 (round to integer)

    System.out.println(Math.floor(3.1)); // 3.0
    System.out.println(Math.floor(3.9)); // 3.0
    System.out.println(Math.ceil(3.9)); // 4.0
    System.out.println(Math.ceil(3.1)); // 4.0

    // random()
    // 0.0 (inclusive) - 1.0 (exclusive) [0, 1)
    System.out.println(Math.random());

    System.out.println("round=" + Math.round(Math.random() * 100)); //

    System.out.println(new Random().nextInt(80) + 120); // 120 - 200

    System.out.println(Math.log(2));

    System.out.println(Math.log10(1000)); // 3.0

    double angleDegree = 45.0;
    double angleRadian = Math.toRadians(angleDegree);
    double sinValue = Math.sin(angleRadian);

    // Math.tan(), Math.cos()



  } // end of main()

}
