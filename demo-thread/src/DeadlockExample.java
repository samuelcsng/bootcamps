public class DeadlockExample {
  private Object lock1 = new Object();
  private Object lock2 = new Object();

  public void method1() {
    synchronized (lock1) {
      System.out.println("Entering method1()");
      System.out.println("Trying to invoke method2() from method1()");
      method2();
    }
    // method2();
  }

  public void method2() {
    synchronized (lock2) {
      System.out.println("Entering method2()");
      System.out.println("Trying to invoke method1() from method2()");
      method1();
    }
    // method1();
  }

  public static void main(String[] args) {
    DeadlockExample example = new DeadlockExample();

    Thread thread1 = new Thread(() -> example.method1());
    Thread thread2 = new Thread(() -> example.method2());

    thread1.start();
    thread2.start();
    System.out.println("Main thread ends"); // Dead Lock for thread1 and thread2
  }
}
