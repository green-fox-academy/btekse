/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Plant {


 public String color;
 public int minimalWaterAmount;
 public double absorb;

  Plant(String color, int minimalWaterAmount, double absorb)
  this.color = color;
  this.minimalWaterAmount = minimalWaterAmount;
  this.absorb = absorb;

  public void currentWaterAmount () {
    System.out.println(minimalWaterAmount);
  }
  public void currentAbsorb () {
    System.out.println(absorb);
  }
  public void plantcolor () {
    System.out.println(color);
  }
}
