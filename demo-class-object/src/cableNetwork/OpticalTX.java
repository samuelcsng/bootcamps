package cableNetwork;

public class OpticalTX {
  private int machineId;
  private Port[] ports;
  
  public OpticalTX(int machineId, Port[] ports, double inputPower) {
    this.machineId = machineId;
    this.ports = ports;
    this.inputPower = inputPower;
  }

  // private double totalPowerOutput;
  private double inputPower;

  public double machinePowerOutput() {
    double totalPortOutput = 0; // BigDecimal???
    for (int i = 0; i < ports.length; i++) {
      totalPortOutput = totalPortOutput + ports[i].getPowerOutput();
    }
    return totalPortOutput;
  }

  public double powerEfficiency() {
    return this.machinePowerOutput() / this.inputPower * 100;
  }

  public int numberOfCustomersServiced() {
    int totalCustomersServiced = 0;
    for (int i = 0; i < ports.length; i++) {
      totalCustomersServiced += ports[i].getNumberOfCustomersServiced();
    }
    return totalCustomersServiced;
  }
}
