/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static Color LIGHTBLUE = new Color(0, 175, 239);
  public static Color PURPLE = new Color(129, 90, 164);

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, LIGHTBLUE, Color.BLUE, PURPLE};

    for (int i = 0; i < 7; i++) {
      squareDrawer(300 - i * 300 / 7, colors[i], graphics);

    }
  }
  public static void squareDrawer(int size, Color color, Graphics g) {
    g.setColor(color);
    g.fillRect(150 - size / 2, 150 - size / 2, size, size);
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}