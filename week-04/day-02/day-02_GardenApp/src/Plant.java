/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Plant {

  public int minimalWaterAmount;
  public double absorb;

  Plant(int minimalWaterAmount, double absorb)
    this.minimalWaterAmount = minimalWaterAmount;
    this.absorb = absorb;

  public void currentWaterAmount () {
    System.out.println(minimalWaterAmount);
  }

  public void currentAbsorb () {
    System.out.println(absorb);
  }
}
