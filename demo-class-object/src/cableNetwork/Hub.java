package cableNetwork;

public class Hub {
  // instance variable
  private String hubName;
  private OpticalTX[] opticalTXs;
  
  // constructor
  public Hub(String hubName, OpticalTX[] opticalTXs) {
    this.hubName = hubName;
    this.opticalTXs = opticalTXs;
  }

  // getter
  public OpticalTX[] getOpticalTXs() {
    return opticalTXs;
  }

  // instance method
  public double hubTotalPower() {
    double hubTotalPower = 0;
    for (int i = 0; i < opticalTXs.length; i++) {
      hubTotalPower += opticalTXs[i].machinePowerOutput();
    }
    return hubTotalPower;
  }

}
