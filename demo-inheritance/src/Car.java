import java.time.LocalDate;
import java.util.Objects;

public class Car {
  private String brandName;
  private LocalDate manufactureDate;

  public Car(String brandName, LocalDate manufactureDate) {
    this.brandName = brandName;
    this.manufactureDate = manufactureDate;
  }

  public String getBrandName() {
    return this.brandName;
  }

  public LocalDate getManufactureDate() {
    return this.manufactureDate;
  }

  @Override
  public String toString() {
    return "Car(" //
        + "brandName=" + this.brandName //
        + "manufactureDate=" + this.manufactureDate //
        + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Car)) {
      return false;
    }
    Car car = (Car) obj;
    return Objects.equals(this.brandName, car.getBrandName()) //
        && Objects.equals(this.manufactureDate, car.getManufactureDate()) //
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.brandName, this.manufactureDate);
  }

  public static void main(String[] args) {
    System.out
        .println(new Car("Tesla", LocalDate.of(2024, 1, 1)).equals(null));
    System.out.println(new Car("Tesla", LocalDate.of(2024, 1, 1))
        .equals(new Car("Tesla", LocalDate.of(2024, 1, 1))));

    System.out.println(new Car("Tesla", LocalDate.of(2024, 1, 1)).hashCode());
    System.out.println(new Car("Tesla", LocalDate.of(2024, 1, 1)).hashCode());



  } // end of main()
}
