/**
 * Created by Balázs on 2017. 03. 30..
 */

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowRect {
  //public static int width = 2000;
  //public static int height = 2000;

  public static void mainDraw(Graphics g) {
    rectPosition(g, 0, 0, 900);
  }

  public static void rectPosition(Graphics g, int x, int y, int size) {
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);

    if (size < 6) {
      return;
    } else {

      rectPosition(g, x + (size / 3), y, size / 3); //up
      rectPosition(g, x, y + (size/3), size/3); //left
      rectPosition(g, x + (2*(size/3)), y + (size/3), size/3); //right
      rectPosition(g, x + (size / 3), y + (2*(size/3)), size/3); //down
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(900, 900));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }


}