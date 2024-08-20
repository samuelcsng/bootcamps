package cableNetwork;

public class Port {
  private static double outputThreshold = 50;

  private int portId;
  private String site;
  private int numberOfCustomersServiced;
  
  public int getNumberOfCustomersServiced() {
    return numberOfCustomersServiced;
  }

  private double powerOutput;

  public double getPowerOutput() {
    return powerOutput;
  }

  public boolean isRepairRequired() {
    return this.powerOutput < outputThreshold;
  }
}
