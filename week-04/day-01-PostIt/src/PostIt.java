public class PostIt {
  public String backgroundColor;
  public String text;
  public String textColor;

  public PostIt (String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  @Override
  public String toString() {
    return "Your text: " + this.text + ". Includes: " + this.backgroundColor + " background color and " + this.textColor + "text color.";
  }
}
