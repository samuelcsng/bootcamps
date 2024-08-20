package cableNetwork;

public class Port {
  private static double outputThreshold = 50;

  private int portId;
  private String site;
  private int numberOfCustomersServiced;
  private double powerOutput;

  public Port(int portId, String site, int numberOfCustomersServiced,
      double powerOutput) {
    this.portId = portId;
    this.site = site;
    this.numberOfCustomersServiced = numberOfCustomersServiced;
    this.powerOutput = powerOutput;
  }

  public int getNumberOfCustomersServiced() {
    return numberOfCustomersServiced;
  }

  public double getPowerOutput() {
    return powerOutput;
  }

  public boolean isRepairRequired() {
    return this.powerOutput < outputThreshold;
  }
}
