/**
 * Created by Balázs on 2017. 04. 03..
 */
public class PostIt {
  public String backgroundColor;
  public String text;
  public String textColor;


  public void textwrite() {
    System.out.println("Your text: " + this.text + ". Includes: " + this.backgroundColor + " colored background and " + this.textColor + " text color.");
  }

}



