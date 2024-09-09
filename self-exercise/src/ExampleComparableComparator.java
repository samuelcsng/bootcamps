import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleComparableComparator {
  public static void main(String[] args) {

    // Customer customer1 = new Customer(1, "Alex", LocalDate.of(2022, 1, 1));
    // Customer customer2 = new Customer(2, "Benny", LocalDate.of(2022, 1, 15));
    // Customer customer3 = new Customer(3, "Carl", LocalDate.of(2021, 12, 31));
    // List<Customer> customers = new ArrayList<>();
    // customers.add(customer3);
    // customers.add(customer2);
    // customers.add(customer1);
    // System.out.println("Before Sorting: " + customers);
    // Collections.sort(customers); // Compilation error
    // System.out.println("After Sorting: " + customers);

    Customer customer1 = new Customer(1, "Alex", LocalDate.of(2022, 1, 1));
    Customer customer2 = new Customer(2, "Benny", LocalDate.of(2022, 1, 15));
    Customer customer3 = new Customer(3, "Carl", LocalDate.of(2021, 12, 31));
    List<Customer> customers = new ArrayList<>();
    customers.add(customer3);
    customers.add(customer2);
    customers.add(customer1);
    System.out.println("Before Sorting: " + customers);

    CustomerComparatorByName sortByName = new CustomerComparatorByName();
    Collections.sort(customers, sortByName);
    System.out.println("After Sorting: " + customers);

    // CustomerComparatorByJoinDate sortByJoinDate =
    //     new CustomerComparatorByJoinDate();
    // Collections.sort(customers, sortByJoinDate);
    
    // Lambda
    Comparator<Customer> sortByJoinDate =
        (o1, o2) -> o1.getJoinDate().compareTo(o2.getJoinDate());
    Collections.sort(customers, sortByJoinDate);

    System.out.println("After Sorting: " + customers);

  }
}
