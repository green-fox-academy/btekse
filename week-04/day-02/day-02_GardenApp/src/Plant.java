/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Plant {

  public String color;
  public String type;
  public double minimalWaterAmount;
  public double actualWaterAmount;
  public double absorb;

  Plant(String color, String type, double minimalWaterAmount, double absorb, double actualWaterAmount) {
    this.color = color;
    this.type = type;
    this.minimalWaterAmount = minimalWaterAmount;
    this.actualWaterAmount = actualWaterAmount;
    this.absorb = absorb;
  }

  public boolean thirsty() {
    return minimalWaterAmount > actualWaterAmount;
  }

  public void watering(double water) {
    actualWaterAmount = actualWaterAmount + (water * absorb);
  }

  @Override
  public String toString() {
    return "The " + color + " " + type + (thirsty() ? " needs" : " doesn't need") + " water.";
  }
}
