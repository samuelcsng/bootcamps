package cableNetwork;

public class Hub {
  private String hubName;
  private OpticalTX[] opticalTXs;

  public double hubTotalPower() {
    double hubTotalPower = 0;
    for (int i = 0; i < opticalTXs.length; i++) {
      hubTotalPower += opticalTXs[i].machinePowerOutput();
    }
    return hubTotalPower;
  }

}
