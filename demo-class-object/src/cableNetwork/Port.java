package cableNetwork;

public class Port {
  // class variable
  private static double outputThreshold = 50;
  // instance variable
  private int portId;
  private String site;
  private int numberOfCustomersServiced;
  private double powerOutput;

  // constructor
  public Port(int portId, String site, int numberOfCustomersServiced,
      double powerOutput) {
    this.portId = portId;
    this.site = site;
    this.numberOfCustomersServiced = numberOfCustomersServiced;
    this.powerOutput = powerOutput;
  }

  // getter
  public int getNumberOfCustomersServiced() {
    return this.numberOfCustomersServiced;
  }

  public double getPowerOutput() {
    return this.powerOutput;
  }

  // instance method
  public boolean isRepairRequired() {
    return this.powerOutput < outputThreshold;
  }
}
