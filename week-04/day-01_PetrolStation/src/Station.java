/**
 * Created by Balázs on 2017. 04. 03..
 */
public class Station {

  public Station (int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int gasAmount;

  public void refill(Car c) {
    int requiredcapacity = c.capacity - c.gasAmount;
    if (gasAmount >= requiredcapacity) {
      gasAmount = gasAmount - requiredcapacity;
      c.gasAmount = c.capacity;
    } else {
      c.gasAmount = c.gasAmount + gasAmount;
      gasAmount = 0;
    }

  }


}
