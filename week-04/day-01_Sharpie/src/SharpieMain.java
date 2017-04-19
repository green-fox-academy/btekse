public class SharpieMain {
  public static void main(String[] args) {
    Sharpie redSharpie = new Sharpie("red", 10.0);
    Sharpie whiteSharpie = new Sharpie("white", 16.8);

    System.out.println(redSharpie.inkAmount);
    redSharpie.Use();
    System.out.println(redSharpie.inkAmount);
  }
}
