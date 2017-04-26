public class Card {
  String color;
  String value;

  Card (String color, String value) {
    this.color = color;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    String info = getValue() + " " + getColor();
    return info;
  }
}
