import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
  private int id;
  private String name;
  private LocalDate joinDate;

  // ...
  // constructors + getters + toString()
  public Customer(int id, String name, LocalDate joinDate) {
    this.id = id;
    this.name = name;
    this.joinDate = joinDate;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getJoinDate() {
    return joinDate;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public int compareTo(Customer o) {
    return Integer.compare(this.id, o.getId());
  }

}


