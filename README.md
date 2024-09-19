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
  - final (w/o `static`, belongs to object(not Class->use this._), cannot be changed)
  - instance variable (non-static, not final, common concept)
- static method
// VIP

- new Object[0]; // !!! initialize empty array

- .toSting()

- StringBuilder()
- System.currentTimeMillis()





***
## Week-3 Day-4 20240822

- Considerations before coding:
  - velocity(coding, running and ...)
  - readability
  - flexibility
  - debug

- BigDecimal
  - use BigDecimal.valueOf(0.1)
  - new BigDecimal("0.1")

- LocalDate
  - .equals(DayOfWeek(5))

- LocalDate, String, BigDecimal -> immutable
  -// "Immutable" -> the object has no method to revise itself

- Pool - Internal Cache
  - for String, Integer(), ...

- scanner.nextline();






***
## Week-3 Day-5 20240823

- new README.md file

- HackMD usage (cap graphics)
- vs code extension install "Markdown All in One"

- enum
  - public enum ClassName{}
  - enum.values() method

- by entering main()
    // Load classes to Memory
    // enum -> create objects for enum
    // static/ static final
    // start to read your code in main method



***
## Week-4 Day-1 20240826

- int is NOT SUITABLE for switch design...

- enum
  - prefer to use "==", instead of .equals()
  - .valueOf()
  - .getValue()

- inheritance
  - extends
  - super


***
## Week-4 Day-2 20240827

- inheritance
  - child class call super() implicitly

- "pass by reference"
  - passing a copy of object address
  - !!! In the Internet, Java always "Pass by value". Why???

- For "extends"
  - Attributes in Parent
    - if it is private, CANNOT inherit
    - if it is public, "this" is something like "alias", pointing back to "super"
  - Constructors in Parent
    - Even it is public, CANNOT inherit
    - Instead, child class calls parent constructor by "super" 
  - Methods in Parent
    - if it is public, "this" is something like "alias", pointing back to "super"
    - if it is private, child class CANNOT access by "super"
    - Child class can "override" the same method in parent class

- @Override
  - Override -> Same Method Signature

- Inheritance
  - Parent Class can hold its own attribute
  - Parent Class itself can create object

- No matter you are doing individual class or extends, you should override the following ...
  - equals()
  - hashCode()
  - toString()

- if you do not overwrite the above 3 methods, your class by default inherit Parent's one.
  - by default, all class has a super parent "Object.class"
  - "Object.class" makes use of "object address" to perform the above 3 methods

- abstract class
  - abstract method
  - vs concrete class (use extends)
  - abstract class extends another abstract class

- Top-most Class
  - toString()
  - equals(Object object)
  - hashCode()




***
## Week-4 Day-3 20240828

- polymorphism
  - Compile-time (Static Polymorphism)
    - The scope of the "reference" is determined by the type of object reference
    - When re-assign the object to a lower level type of reference, the object behavior may be different.
  - Run-time (Dynamic Polymorphism)
    - method implementation belongs to object itself (but not the reference type)
  - Static vs Dynamic
  - Casting
    - upcast
    - downcast
  
  - Why do we need Inheritance + Polymorphism?
    - 1. abstract class type can be used in method parameter (i.e. Shape[] -> area)
    - 2. abstract class type can be an attribute of a class (i.e. Rank is an attribute of Card)




***
## Week-4 Day-4 20240829

- Child upCast = parent;
- think: downcast parent == child ???

- interface
  - "final" class cannot be extended
  - "final" class method cannot be overriden

- JAVA: (APIE)
  - Abstraction (Interface)
  - Polymorphism
  - Inheritance
  - Encapsulation

- Interface (100% Abstraction/Contract) vs Inheritance (extends Parent Class)
  - Differences:
    - No Attribute vs have attribute(s)
    - No Constructor vs Have Constructor(s)
    - Implements >=1 Interfaces vs Extends ONLY 1 Parent Class
    - Methods are all abstract (before Java 8, have Default after Java 8) vs Contains both abstract and concrete method
    - Not support static variable vs Support ...
  - Same:
    - Support Static Final Variable
    - Support Static methods (After Java 8)
    - Default/Inherit instance method (After Java 8)

- Interface vs Abstract Class
- vip: Interface Name's meaning best to be have an ADJECTIVE meaning(for abstract feeling), not NOUN (which has wrong feeling of an object or concrete class)

- enum
  - is IMPLICITLY final
  - cannot extends enum

- interface extends 

- String, StringBuilder, StringBox implements CharSequence interface
- 6 primitives(Byte, Short, Integer, Long, Float, Double) implements Number interface




***
## Week-4 Day-5 20240830

- the item following "new" MUST BE "constructor"

- ArrayList
  - Number is the parent of Integer
  - BUT: ArrayList<Number> is not the parent of ArrayList<Integer>
    - ArrayList<Number> integers3 = new ArrayList<Integer>(); // compile error
  - .isEmpty() vs .size()==0 
  - for loop in Array vs for loop in ArrayList

- always override .toString() .equals() .hashCode()

- remove by index .remove(idx) return object
- remove by object local modification + return boolean

- cannot use ArrayList together with primitive
  - but can use with Wrapper class

- Interface: List.class
  - List is the interface of ArrayList

- conversion to Arrays

- Arrays.asList() -> return List object
  - Disadvantage:
    - you cannot perform write operation
    - read operation is ok
    



***
## Week-5 Day-1 20240902

- *** ArrayList.add() method
  - a new array will be created and the reference is redirected(can cause memory overflow) 
  - can return boolean false(mostly true) (can cause problem)
  - reference of ArrayList object has no relationship with the address of the array within it.

- Arrays.asList(...)
  - easy common usage but cannot write

- HashSet<>()
  - the underlying data is NOT array
  - remove duplicate

- LinkedList<>
  - O(1) -> Constant time -> add element at head
  - O(n) -> add element at tail
  - LinkedList.class also store the tail address as an attribute -> add element at tail also O(1)
  - LinkedList.get() vs ArrayList.get()
  - Polymorphism
    - List<Integer> integerLinkedList = new LinkedList<>()
    - List<Integer> integer = new ArrayList<>()
    - Compile Time(Static) polymorphism (focus on left side)
    - Run Time(Dynamic) polymorphism (focus on right side)
  - self-build LinkedList<>()

- ArrayList vs LinkedList
  - Same:
    1. Implement List Interface: add(), remove(), size(), get() ...
    2. With Ordering

  - Difference:
    1. Polymorphism -> different implementation for same method(almost all methods)
    2. Performance: Add/Remove head/tail element -> LinkedList perform better
      - if we know the exact index of position for searching, ArrayList will be better

- ArrayList (array) vs HashSet (hash + array)
  - Same:
    1. (vip) HashSet has NO ordering
    2. Add/Remove -> array -> re-create array object
  - Difference:
    1. (vip) Polymorphism -> different implementation -> add() -> return false if duplicated
    2. Searching by hash code to find out duplicated

- LinkedList vs Queue vs Deque vs List

- VIP: 
  - in OOP, if not array, it must be LinkedList





***
## Week-5 Day-2 20240903

- Java Doc
  - /**
  - *
  - */

- Queue
  - .addLast
  - .removeFirst
  - FIFO

- choices of Interface and the implementation separately
  1. Queue -> LinkedList or ArrayDeque
  2. Deque -> LinkedList or ArrayDeque
  3. List  -> LinkedList or ArrayList

- Choose between Queue, Deque, List
  1. All the above have ordering
  2. Queue/Deque cannot access the middle element DIRECTLY
  3. Deque has addFirst & removeLast
  4. Queue/Deque for "consumption", use .poll()

- queue.poll()
  - similar to "remove"

- queue.peek()
  - look up the head element

- for-each - consumption
  - while-loop Queue
  - while (!queue.isEmpty()){
      element = queue.poll();
      // code using element
  }

- Design idea: need to retain the data?

- PriorityQueue(PQ)
  - NOT first come first serve
  - natural ordering of the elements
  - concerning on ordering
  - !!! The algorithm pick the first element at poll(), but not exactly a sorting

- Comparable 
  - implements Comparable<>
    - "implements Interface" implies the object of this class must contain compareTo() method at "compile time"
    - The method/object has to ensure
  - @Override compareTo()
  - Disadvantages
    1. You cannot define 2 sorting formula at the same time.
    2. The compareTo formula is for Box.class
  - Generic ???


***
## Week-5 Day-3 20240904

- Class implementation of the interface Comparable<> override the compareTo():
  ````java
  class CName implements Comparable<CName> {
    @Override
    public int compareTo(CName cName){}
  }
  ````

- Class implementation of the interface Comparator<> override the compare():
  ````java
  class CName implements Comparator<CName> {
    @Override
    public int compare(CName cName1, CName cName2){}
  }
  ````

- HashMap
  ````java
    Map<key,value> map = new HashMap<>();
  ````
  - .put(key, value) -> if same key, overwrite old value
  - .get(key)
  - .size()
  - for-each
    ````java
    for (Map.Entry<key, value> entry: mapName.entrySet()){
      // entry.getKey()
      // entry.getValue()
    }
    ````
  - .remove(key), .remove(key, value)
  - .entrySet()
  - .keySet()
  - .values()
  - .clear() // clear all entries -> .size() = 0
  - .retain()

- HashMap vs List(ArrayList, LinkedList)
  1. HashMap has no ordering
  2. HashMap get value by key (any type), List get value by index (int)
  3. Key cannot be duplicated, List may contain duplicated value

- !!! How to identify the key is duplicated?
  - the implementation of put() method
  - Note on the overriding of the .equals() and .hashCode()

- deque
  - pop(), push(), addFirst(), remove(), removeFirst() -> head element
  - add(), addLast(), removeLast() -> tail element
  - peek(), peekFirst return head element
  - peekLast() return tail element
  - poll()




***
## Week-5 Day-4 20240905

- HashMap vs List
  - HashMap.get() by key -> for loop list, if value = key, return object
    - HashMap<String, String> urlMap(i.e. "AAPL", "www.apple.com")
    - If we want to store more info about the "key" -> HashMap<String, Company>
    - Retain key object is wrapper class or String (equals(), hashCode() is ready)
  - HashMap<Customer, List<Transaction>>
    - If key is customer object, be careful of .equals() and .hashCode() -> put(), get()

- Interface Collection only??? contain only Static methods

- Big-O Notation
  - mergesort
    - Collection.sort()
    - Array.sort()

- Recursion
  - base case
  - Advantages of Recursion
    1. Better Space Complexity

  - Typical Scenario that we need Recursion
    1. DFS (Depth First Search)

- Generic
  - List is similar to List<Object>

***
## Week-5 Day-5 20240906
- !!!Typhoon!!!




***
## Week-6 Day-1 20240909

- empty constructor
  - if with attributes of List<>(or ...), still need to initiate the attributes
  - eg. ```this.accounts = new ArrayList<>();```

- Java 1.5 (real Generics)
  - define the type of List "at compile time"
  - At compile time, Java confirm the type and hence is safe to use related methods afterward

- Define Type range
  - <T extends ...>
  - <T extends Interface>
  - <T extends Comparable<? super T>>
    - "? super T" -> any parent class of T or T itself
    - Generics extends Generics (Generic of Generic)
  - < T extends Comparable<T>> 
    - smaller range of T
  
- Generics
  - Generic Type can be written in class/object level
    - public class Box<T>
    - the type of attribute be T
    - instance method can be generic (public T getValue())
    - At compile time, the generic type T must be aligned between Class, attributes and instance method
    - At run time, you have to define the exact type of T
  - Generic Type can be written in `static` method level
    - You have to define the range of generic type in the method signature
    - public static <T> Box<T> createBox(T value)
  - T for instance method vs T for static method
  - `Polymorphism` does not apply to Generic
  - 

- <? extends Shape> === <? super Shape>

- try{}catch(){}
- throw new Exception() // Exception object

***
## Week-6 Day-2 20240910

- Exception
  - What is unchecked exception?
    - You don't have to handle the exception by "try catch" or "rethrow"
    - You can ignore the potential exception scenario (refer to ExceptionChainExample1.java)
    - You can recover as well.
  - What is checked exception?
    - Create Custom class (extend Exception.class)
    - You have to handle the exception by 2 ways:
      - "Try Catch"
      - "re-throw by method signature"
    - Refer to BusinessException.java
  - Unchecked Exception (Run-time Exception)
    - / by zero, NPE, IAE, IndexOutOfBound, etc. (Likely Memory Limitation)
  - Checked Exception (Compile-time Exception)
    - IOException (DB login, Server service unavailable, File Access, File Not Found, etc)
    - Custom Exception
  - Why do we need Exception?
    - The world without Exception, you can only use "return" for method communication
      - return -> Happy Path
    - The world with Exception, you can both use "return" and "throw"
  - "catch" can be multiple code block, similar to "else if"
  - "catch" has Parent and Polymorphism concepts

- Java 17
  - framework(spring, spring boot) closely related
- commonly Java 11 to 17
- Java 8 (year 2014)
- Java 5 (with Generics added)

- Nested Class




***
## Week-6 Day-3 20240911

- Builder Pattern
  - Advantages/Functionality of Builder Pattern:
    1. Serve different pattern of constructors.
    2. Builder method name assists the value assignment in case there are lots of attributes.
    3. We can disable/private (encapsulate) constructor of Outer Class
  - *** think about usage of return this in instance method

- Java terms:
    // Class
    // Object/instance
    // instance method
    // static method
    // interface
    // implements
    // Parent Class
    // Child Class
    // extends
    // Polymorphism

- useful links
  - csdn.net
  - bytebytego.com

- Factory Pattern
  - open-close coding style
  - abstract class and interface
  - enum + switch

- Lambda Expression
  - "Lambda Expression" is for creating object without class, given that the interface is Functional interface


***
## Week-6 Day-4 20240912

- Lambda
  - Runtime Formula (differs to Class instance method & static method)
  - @FunctionalInterface
  - Function interface
  - BiFunction interface
  - self build FunctionalInterface
  - Consumer.class
  - BiConsumer.class
  - Supplier interface
  - Predicate
  - BiPredicate
  - apply() vs accept() vs get() vs test()
  - UnaryOperator
  - BinaryOperator
  - Applying Lambda
    - List.foreach() (Java 8) -> Consumer.class
    - Map.ComputeIfAbsent()
    - Map.merge()
    - Predicate.and()
    - Predicate.or()

  - Stream
    - Steam.of()
    - Stream.forEach()
    - After Java 8, we have Stream.class, which contains lots of powerful method/ functionality
    - Convert List to Stream
      - stream()
    - Convert Stream to List
      - collect(Collections.toList())
    - Stream Object -> filter() + collect()
    - Stream.map()
    - filter().map()
    - map().filter()
    - .sum()
    - .count()
    - .mapToInt()
    - Stream Object -> mapToInt() -> IntStream object -> sum()
    - .max(), .min(), .average()
    - IntStream -> distinct()
  - Collect to Set
  - Array to IntStream to Stream<Integer> to Set<Integer>



***
## Week-6 Day-5 20240913

- Stream

- Arrays.asList()
  - Mutable but fixed size
  - No add & remove, but set is OK
- List.of()
  - Immutable
  - Java 9 (No add, remove, set)

- OptionalInt

- .flatMap()

- array to stream()
  - Arrays.stream()
  - Arrays.stream(array).boxed()...
  - int[] -> List<Integer>
  - stream() + boxed

- Optional
  - .findAny()
  - .findFirst()
  - .isPresent()
  - .ifPresent()
  - Optional<String>, Optional.of("abc")
  - Optional.ofNullable(null)
  - to resolve Optional of value
    - isPresent() -> get()
    - ifPresent()
    - .orElse()
    - .orElseThrow()
    - .orElseGet()
  - Optional.empty()

- !!! Use cases for Optional<T>
  - Good:
  1. Optional should be used for return type ONLY!!! (Similar to throw Checked Exception)
  - Bad:
  2. Never use Optional in method parameters
  3. Never use Optional as type of class attribute, because it does not support Serialization



***
## Week-7 Day-1 20240916

- Method Reference
  - with Lambda Expression
  - with method reference
    - ONLY for one input or one output
    - NOT one input AND one output

- Type Inference

- Switch Expression
  - ~Java 14

- Record

- Thread
  - Runnable interface
  - Thread implements Runnable
  - Process vs Thread
  - Thread require Runnable (task) as parameter
  - Thread.start() vs Thread.run()
  - need to think if different tasks share the same resources
  - Thread.join()
  - write-write and write-read operations
    - counter++ -> non-atomic
    - append() -> non-atomic
      - StringBuilder().append() vs StringBuffer().append()
      - Appendable



***
## Week-7 Day-2 20240917

- Thread
  - synchronized
  - AtomicInteger

- DeadLock

- Thread-Safe by Atomic Operation

- Vector()
- Hashtable()
- differences of Hashtable() and HashMap()
  - 1. Not support null key
  - 2. Not support null value

- Collections.synchronizedMap() vs ConcurrectHashMap()
- Collections.synchronizedList()


***
## Week-7 Day-3 20240918
- Holiday: Next Day of Mid-Autumn Festival



***
## Week-7 Day-4 20240919
- DBMS + SQL


***
## Week-7 Day-5 20240920


