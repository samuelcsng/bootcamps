package cableNetwork;

import java.net.Socket;

public class CableNetwork {
  public static void main(String[] args) {

    // Hub[] hubs = new Hub[40];

    Port port0 = new Port(0, "SPK-0", 100, 75);
    Port port1 = new Port(1, "SPK-1", 199, 60);
    Port port2 = new Port(2, "WTS-0", 233, 99);
    Port port3 = new Port(3, "WTS-1", 332, 89);

    Port[] port01s = new Port[] {port0, port1};
    OpticalTX OTX0 = new OpticalTX(0, port01s, 200);

    Port[] port23s = new Port[] {port2, port3};
    OpticalTX OTX1 = new OpticalTX(1, port23s, 400);

    OpticalTX[] OTX01 = new OpticalTX[] {OTX0, OTX1};
    Hub hub0 = new Hub("WongTaiSin", OTX01);

    System.out.println(hub0.hubTotalPower());
    System.out.println(hub0.getOpticalTXs()[0].numberOfCustomersServiced());
  }
}
