public class Hub {
  private String hubName;
  private int numOfTransceivers;
  private int numOfCustomersServed;

  public String getHubName() {
    return hubName;
  }
  public void setHubName(String hubName) {
    this.hubName = hubName;
  }
  public int getNumOfTransceivers() {
    return numOfTransceivers;
  }
  public void setNumOfTransceivers(int numOfTransceivers) {
    this.numOfTransceivers = numOfTransceivers;
  }
  public int getNumOfCustomersServed() {
    return numOfCustomersServed;
  }
  public void setNumOfCustomersServed(int numOfCustomersServed) {
    this.numOfCustomersServed = numOfCustomersServed;
  }

  public double customersServedPerMachine(){
    return this.numOfCustomersServed / this.numOfTransceivers;
  }
  
}
