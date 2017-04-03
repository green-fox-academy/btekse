/**
 * Created by Balázs on 2017. 04. 03..
 */
public class PetrolStation {

  public static void main(String[] args) {

    Station station = new Station(80);
    Car car = new Car(10, 100);

    System.out.println("Car gas amount: " + car.gasAmount + " Station: " + station.gasAmount);
    station.refill(car);
    System.out.println("Car gas amount #2: " + car.gasAmount + " Station #2: " + station.gasAmount);
  }
}
