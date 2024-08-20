package cableNetwork;

public class Hub {
  private String hubName;
  private OpticalTX[] opticalTXs;


  public OpticalTX[] getOpticalTXs() {
    return opticalTXs;
  }



  public Hub(String hubName, OpticalTX[] opticalTXs) {
    this.hubName = hubName;
    this.opticalTXs = opticalTXs;
  }



  public double hubTotalPower() {
    double hubTotalPower = 0;
    for (int i = 0; i < opticalTXs.length; i++) {
      hubTotalPower += opticalTXs[i].machinePowerOutput();
    }
    return hubTotalPower;
  }

}
