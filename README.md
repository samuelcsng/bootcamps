# bootcamps
***
## Week-1 Day-1 20240805
- Installation

***
## Week-1 Day-2 20240806
- Primitives (int, double ...)
  - Higher/Lower level types (long > int > short > byte) (double > float)
  - Math Operation
  - Comparison Operators

- String
  - equals(), length(), charAt()
  - If-else

- reference
https://javahongkong.larksuite.com/wiki/NPWBwykCCivujTk1WHiuyzAosnh
    // ***** VIP *****
    // Primitives:
    // byte, short, int, long
    // float, double
    // char
    // boolean
    // ***** VIP *****

- to upgrade the data type, use (higherType) variable

- git command:
    // gitBash under the folder: /c/github/org/bootcamp 
    // git status
    // git add .
    // git commit -m "2024.08.06"
    // git push

***
## Week-1 Day-3 20240807
- for ALL non-primitive types:
  - DO NOT use "==" 
  - ALWAYS use .equals()

- ***
- use "Monday".equals(day) instead of 
- day.equals("Monday")
- note: the variable day may be null

- String methods
  - String.contains() -> boolean
  - special character: # ! @ $

- java.util.Scanner

- switch, break
  - need special precaution on using "break;"
  - default:
  



***
## Week-1 Day-4 20240808

- for loop
- for loop with break
- for loop with continue

- String.indexOf('j')
- String.endsWith()
- String.startsWith()
- String.substring()

- System.out.println() // print + next line
- System.out.print() // print + next position



***
## Week-1 Day-5 20240809

- Infinite Loop
- labeled Break
- continue, labeled continue

- Array
- byte[], short[], int[], long[] 
- float[], double[]
- boolean[]
- char[]
- String[]

- String[].length vs String.length()

- String[] arrName = new String[] {"abc", "def", "ijk"};
- String[] arrName = {"abc", "def", "ijk"};

- arr[idx++] = values[i]; // common in for loop
- Arrays.toString(arrayName); // to print out array

- array swap elements

***
## Week-2 Day-1 20240812
- git init (from local machine)

- Memory(Cache)
  - Stack Memory
  - Heap Memory

- bubble sort

- 2D array

- ASCII code
  - 0 -> 48
  - A -> 65
  - a -> 97

- byte -> short -> int -> long -> float -> double
-          char -> int -> long -> float -> double

- downcasting, explicit type conversion
- double->int (precision loss)



***
## Week-2 Day-2 20240813

- Class
- Wrapper Class
- object reference (stores object address)
- 8 primitives + 8 wrapper classes + String
- auto-boxing and unboxing
- .compareTo()
- Character.charValue()

- String methods
  - indexOf()
  - lastIndexOf()
  - concat()
  - startsWith()
  - endsWith()
  - compareTo()
  - ...

- down casting
  - (int) longNumber;

- Array insertion sort

- Arrays.copyOf()

- object reference
- Pass by reference vs Pass by value
- RULE OF THUMB:
  - 8 Primitives + 8 Wrapper Classes + String -> Pass by value
  - Other than that -> Pass by reference



  - Static Methods

```java
    public class ABC {
      // main method
      public static void main(String[] args) {
        calculateCircleArea(3.0);
      }

      // customer method
      public static double calculateCircleArea(double radius){
        return ...:
      }
    }
```






***
## Week-2 Day-3 20240814

- Static Method (public static)
- Instance Method

- Method Signature = Method Name + Number of Parameters & Type of Parameters


- while loop

- random number

- for-each loop

- java -->> coding velocity, code readability





***
## Week-2 Day-4 20240815

- array[idx++] = ... // access and than increment idx

- class object

- class
  - blueprint
  - private attributes
  - getXXX(), setXXX(), instance methods (object methods)
  - Presentation
  - constructor
  - empty constructor implicitly exists
  - constructor signature






***
## Week-2 Day-5 20240816

- all-arg constructor
- empty constructor
- instance methods:
  - to create new
  - to modify 
  - to transform

- Math. method

- BigDecimal (double)
  - BigDecimal.divide()
  - BigDecimal.valueOf()
  - .equals()
  - .compareTo()


- reference trap
- copy constructor
- Mutable Object 
  - object with setters -> reference trap -> solution: "copy constructor"
  - RULE OF THUMB: avoid setting variables equal to each other -> both variables will share a reference to the same object
  - (in Java) Arrays are Mutable Objects -> Arrays.copyOf(object, object.length)
  - bug fixing: constructor, copy constructor, getter, setter
- overriding object.toString() method
- deep copy constructor
- deep copying:
  - duplicate an object
  - protects the internal state of an object(or class) from external modification
  - prevent exposing the internal state of the object)


***
## Week-3 Day-1 20240819

- double * double -> always use BigDecimal
- instance method
  - presentation (derived)
  - transform (replace, add, remove)

- static (stack memory)
- static method vs instance method
- static method can NEVER return instance variable
- className.method // only return static, not attributes



***
## Week-3 Day-2 20240820

- private static

- Summary (static vs instance)
  // Static method return instance variable (NOT OK)
  // Instance method return instance variable (OK)
  // Static method return static variable (OK)
  // Instance method return static variable (OK)

    // static method, static variable, static class do not belongs to object
  // so static stuff can be written to any class technically

- Early return
- Constant: static final
- instance variable (for object)
- static variable (for class)
- static final variable (for class but cannot be modified)

- Class.valueOf() vs static Class.ofValue method


- // Constant(private static final)
  // static variable
  // instance variable
  // 
)

----
public class ClassName {

- constant (public/private static final ...) (keyword: private static final type CONSTANT_NAME = ...)
- static variable (public static ...) (keyword: static)
- instance variable (private type varName ...)

- public method vs static method (keyword: public/private static)

- public constructor vs private constructor
  - public ClassName(...){} // public constructor
  - private ClassName(...){} // private constructor
- public static ClassName methodName(...) {return new ClassName(...)} // use public static method to call the private constructor to create object

- instance method: public returnType method(...){} // common practice, have this. keyword

}
----

***
## Week-3 Day-3 20240821

- StringBuilder
  ````java
  StringBuilder sb = new StringBuilder(""); // String sb = "";
  sb.append()
  ````

- Constant -> just `public`, no need `private`
  - static final -> should be public
  - final

// VIP
- 4 key variables:
  - static final (CONSTANT)
  - static (belong to Class, not object)
  - final (belongs to object, cannot be changed)
  - instance variable (non-static, not final, common concept)
- static method
// VIP

- new Object[0]; // !!! initialize empty array

- .toSting()

- StringBuilder()
- System.currentTimeMillis()





***
## Week-3 Day-4 20240822


***
## Week-3 Day-5 20240823