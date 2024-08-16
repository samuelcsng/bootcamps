public class StringBox {
  private char[] characters; // obj ref

  // new String
  public StringBox(String s) {
    // s -> char[]
    this.characters = new char[s.length()]; // VIP, easy to miss out
    // System.out.println("before" + this.charAt(1)); // "\u0000"

    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }

    // System.out.println("after" + this.charAt(1));

    // this.characters = s.toCharArray();
  }

  // sb.charAt
  public char charAt(int index) {
    return this.characters[index];
  }

  public int length() {
    return this.characters.length;
  }

  // firstIndexOf
  public int indexOf(char c) {
    for (int i = 0; i < this.characters.length; i++) {
      if (this.characters[i] == c) {
        return i;
      }
    }
    return -1;
  }

  // replace ('c', 'x')
  public String replace(char o, char n) {
    char[] arr = new char[this.characters.length];
    for (int i = 0; i < this.characters.length; i++) {
      arr[i] = this.characters[i] == o ? n : this.characters[i];
    }
    return String.valueOf(arr); // new String(arr)
  }

  public String subString(int beginIndex, int endIndex) {
    char[] arr = new char[endIndex - beginIndex + 1];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = this.characters[beginIndex + i];
    }
    return String.valueOf(arr);
  }

  public String toString() {
    return String.valueOf(this.characters);
  }

  public static void main(String[] args) {
    String s = new String("abc");
    StringBox sb = new StringBox("abc");

    System.out.println(s.charAt(1));
    System.out.println(sb.charAt(1));

    System.out.println(s.length()); // 3
    System.out.println(sb.length()); // 3

    System.out.println(s.indexOf('c')); // 2
    System.out.println(sb.indexOf('c')); // 2

    String newStr = s.replace('c', 'x');
    System.out.println(newStr); // "abx"
    System.out.println(s); // "abc"

    String newStr2 = sb.replace('c', 'x');
    System.out.println(newStr2); // "abx"
    System.out.println(sb); // "abc"



  } // end of main()



} // end of class
