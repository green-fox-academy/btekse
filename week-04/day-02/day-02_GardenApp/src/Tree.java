/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Tree extends Plant {
  Tree(String color) {
    super(color, "tree", 10, 0.4, 0);
  }

  public static void main (String[] args) {
    Tree treep = new Tree("purple");
    Tree treeo = new Tree("orange");
  }
}
