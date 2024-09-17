// !!! immutable - final attribute
public record Person1(String name, int age) {

  // Support Override
  @Override
  public String name() {
    return "Abc";
  }

  // Support Customer Method
  // public

  // "final" attributes
  // public void setName(String name){
  // this.name = name;
  // }

  public static int sum(int x, int y){
    return x + y;
  }
}
