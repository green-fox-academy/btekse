/**
 * Created by Balázs on 2017. 04. 03..
 */
public class BlogPost {

  public String authorName;
  public String title;
  public String PublicationDate;
  public String text;

  public void textwrite() {
    System.out.println("'" + title + "' titled by " + authorName + " at " + PublicationDate + " " + text);
  }


}
