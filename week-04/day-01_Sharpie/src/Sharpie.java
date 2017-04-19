public class Sharpie {
  String color;
  double width;
  double inkAmount;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void Use() {
    this.inkAmount -= 10;
  }
}
