import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambdaFunction {
  public static void main(String[] args) {
    // Function.class, f(x)-y
    // interface Function<T, R>
    // R apply(T,t);

    Function<String, Integer> stringLength = str -> str.length();
    System.out.println(stringLength.apply("hello"));

    Function<Integer, Integer> integerSquare = x -> x * x;
    System.out.println(integerSquare.apply(10));

    Function<List<String>, List<String>> filter = strings -> {
      List<String> newString = new LinkedList<>();
      for (int i = 0; i < strings.size(); i++) {
        if (strings.get(i) == "abc") {
          newString.add("xyz");
        } else {
          newString.add(strings.get(i));
        }
      }
      return newString;
    };

    List<String> stringList = Arrays.asList("abc", "def", "uvw");
    List<String> output = filter.apply(stringList);
    System.out.println(output);

    // BiFunction.class
    // BiFunction<T, U, R> {
    // R apply(T t, U u);
    BiFunction<Integer, Integer, Integer> add2Numbers = (x, y) -> x + y;
    System.out.println(add2Numbers.apply(9, 2));

    BiFunction<String, String, String> concat = (s1, s2) -> s1.concat(s2);
    System.out.println(concat.apply("hello", "world"));

    // Consumer.class
    // interface Consumer<T>{
    // void accept(T, t);
    Consumer<String> printString = str -> System.out.println(str);
    printString.accept("abc");

    // BiConsumer.class
    BiConsumer<String, String> print2String =
        (s1, s2) -> System.out.println(s1 + s2);
    print2String.accept("abc", "xyz");

    BiConsumer<Map<Integer, String>, Integer> printValue =
        (map, key) -> System.out.println(map.get(key));

    Map<Integer, String> nameMap = new HashMap<>();
    nameMap.put(1, "John");
    nameMap.put(2, "Peter");
    printValue.accept(nameMap, 2);

    // Supplier
    // Supplier<T>
    // T get()
    // !!! "() -> Math.random()" is a formula to return Double, but not return Double
    Supplier<Double> randomNumber = () -> Math.random();
    System.out.println(randomNumber.get());

    Function<Integer, Integer> randomNumber2 =
        to -> new Random().nextInt(to) + 1;
    System.out.println(randomNumber2.apply(100)); // (random number between 1 - 100)

    // Predicate<T>
    // boolean test(T t);

    // Predicate<Integer> isAdult = age -> age >= 18;
    // isAdult.test(18);

    Predicate<Customer> isAdult = customer -> customer.getAge() >= 18;
    System.out.println(isAdult.test(new Customer(18))); // true
    System.out.println(isAdult.test(new Customer(17))); // false

    // Test


    BiPredicate<Customer, Customer> isOlderThan =
        (c1, c2) -> c1.getAge() >= c2.getAge();
    System.out.println(isOlderThan.test(new Customer(17), new Customer(18)));

    // UnaryOperator<T> extends Function<T, T>
    UnaryOperator<String> replaceSpaceByEmptyString = s -> s.replace(" ", "");
    System.out.println(replaceSpaceByEmptyString.apply("hello world !!!"));
    // Alternative
    Function<String, String> replaceSpaceByEmptyString2 =
        s -> s.replace(" ", "");
    System.out.println(replaceSpaceByEmptyString2.apply("hello world !!!"));

    BinaryOperator<String> firstCharacters = (s1, s2) -> {
      String result = "";
      if (s1 != null && s1.length() > 0)
        result += s1.charAt(0);
      if (s2 != null && s2.length() > 0)
        result += s2.charAt(0);
      return result;
    };
    System.out.println(firstCharacters.apply("abc", "ijk"));
  } // main()
}
