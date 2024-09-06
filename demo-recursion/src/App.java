public class App {
    public static void main(String[] args) throws Exception {
        // 1 + 2 + 3 + 4 + 5
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum); // 15

        // recursion
        System.out.println(sumToFive(1)); // 15

        System.out.println(sumEvenNumber(10));

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " " + sequence(i));
        }

        System.out.println(sequence2(5, 0, 1));

        // Typical Scenario that we need Recursion



    } // main()

    public static int sumToFive(int x) {
        if (x >= 5) // base case
            return x;
        return x + sumToFive(x + 1); // never end
    }
    // 1. 1 + sumToFive(2), this is waiting the result of sumToFive
    // 2. 2 + sumToFive(3)
    // 3. 3 + sumToFive(4)
    // 4. 4 + sumToFive(5)
    // 5. return 5
    // 6. 4 + 5
    // 7. 3 + 9
    // 8. 2 + 12
    // 9. 1 + 14
    // 10. return 15

    // 10 8 4 6 2
    public static int sumEvenNumber(int head) {
        if (head <= 2) {
            return head;
        }
        return head + sumEvenNumber(head - 2);
        // return head;
    }

    // 0 1 1 2 3 5 8 13 21 34 ...
    // sequence(6) -> 5
    public static int sequence(int numberOfElement) {
        if (numberOfElement == 1) {
            return 0;
        }
        if (numberOfElement == 2) {
            return 1;
        }
        // if ( >= numberOfElement)
        return sequence(numberOfElement - 2) + sequence(numberOfElement - 1);
    }


    public static int sequence2(int numberOfElement, int prv2, int prv1) {
        int p2 = 0;
        int p1 = 1;
        if (numberOfElement==1){
            return p2;
        }
        if (numberOfElement==2){
            return p1;
        }
        p2 = prv2;
        p1 = prv1;
        return sequence2(numberOfElement-1, p1, p2 + p1);
        // return 99;
    }
}
