/**
 * Created by Balázs on 2017. 04. 03..
 */
class PostItInfo {
  public static void main(String args[]) {
    PostIt postIt1 = new PostIt("orange", "Idea1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt3 = new PostIt("yellow", "Suberb!", "green");

    System.out.println(postIt1.toString());
    System.out.println(postIt2.toString());
    System.out.println(postIt3.toString());

  }
}


