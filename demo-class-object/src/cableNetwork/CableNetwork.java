package cableNetwork;

public class CableNetwork {
  public static void main(String[] args) {

    // Hub[] hubs = new Hub[40];

    // initialization
    Port port0 = new Port(0, "SPK-0", 100, 75); // initialize individual port instances
    Port port1 = new Port(1, "SPK-1", 199, 60);
    Port port2 = new Port(2, "WTS-0", 233, 99);
    Port port3 = new Port(3, "WTS-1", 332, 89);

    Port[] port01s = new Port[] {port0, port1}; // initialize ports array for 1st TX
    OpticalTX OTX0 = new OpticalTX(0, port01s, 200); // initialize 1st OTX instance

    Port[] port23s = new Port[] {port2, port3}; // initialize ports array for 2n TX
    OpticalTX OTX1 = new OpticalTX(1, port23s, 400); // initialize 2nd OTX instance

    OpticalTX[] OTX01 = new OpticalTX[] {OTX0, OTX1}; // initialize OTX array for hub
    Hub hub0 = new Hub("WongTaiSin", OTX01); // initialize hub instance
    // Hub hub0 = new Hub(HubName.WONG_TAI_SIN, OTX01); // initialize hub instance

    // network information, analysis, ...
    System.out.println(hub0.hubTotalPower());
    System.out.println(hub0.getOpticalTXs()[0].numberOfCustomersServiced());
  }
}
