/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics) {
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.RED);
    graphics.drawLine(10, 10, 250, 10);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(250, 10, 250, 240);
    graphics.setColor(Color.BLUE);
    graphics.drawLine(250, 240, 10, 240);
    graphics.setColor(Color.BLACK);
    graphics.drawLine(10,10,10,240);
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(50, 50, 150, 150);
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