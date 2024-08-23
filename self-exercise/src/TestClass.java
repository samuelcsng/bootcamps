public class TestClass {
  // instance field
  public int int1 = 99; // instance field: public -> direct accessible inside object/class(this._) or object._ for outside access

  private int int2 = 999; // instance field: private -> direct accessible inside object/class(this._) or create getter() for outside access
  public int getInt2() {
    return int2;
  }



  // class field (changeable)
  public static int int3 = 9999; // class field: public -> direct accessible inside object/class(this._ ???) or STATIC accessible(ClassName._) for outside access
  private static int int3a = 1111; // class field: private -> direct accessible inside object/class(this._ ???) or create getter() for outside access by using ClassName.get()
  public static int getInt3a() {
    return int3a;
  }

  // class field (final -> unchangeable)
  public static final int INT4 = 99999; // class field: public final(CONSTANT) -> direct accessible inside object/class(this._ ???) or STATIC accessible(ClassName._) for outside access, cannot change
  
  private static final int INT5 = 55555; // class field: private final(CONSTANT) -> cannot change, direct accessible inside object/class(this._ ???) or create getter() for outside access using ClassName.get()
  public static int getInt5() {
    return INT5;
  }

  // instance method (common)
  public void methodInstance(){}

  // static method
  // public static int methodStatic(){return this.int1;} // error, cannot use this._ inside
  public static int methodStatic() {return 333;}
  public static int methodStatic2() {return INT4;}
  public static int methodStatic3() {return INT5;}
  




} // end of class
