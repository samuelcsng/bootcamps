import java.util.ArrayList;

public class DemoTypeInference {
    public static void main(String[] args) {
        int age = 5;
        var age2 = 5;
        // !!! Java Compiler covert "var" to int
        // !!! because you assign int value 5 to it (first assignment).
        // !!! var type never exists byte code (class file)
        // age2 = 5.0 // double value -> int type

        String name = "John";
        var name2 = "John"; // VSCode help you identify names is String variable

        name2.charAt(2); //

        var strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("def");

        for (var string : strings) {
            System.out.println(string);
        }

        // re-assign value to var type variable
        age2 = 10; // OK (same type value)
        // age2 = "abc"; // error
        // age2 = 5.0; // error

        // method input parameter type
        // method output parameter type
        // class attribute type
        
        // assign null value to var type variable
        var y - null; // first assignment has to be an non-null value

        // !!! lambda expression (Not Support)

        // downcase
        var nameLength2 ->(Supplier<Integer>) () -> "abc".length;


    } // main()

    public static var sum(var x1, var x2) {

    }
}
