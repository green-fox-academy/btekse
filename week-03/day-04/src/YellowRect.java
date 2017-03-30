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
    rectPosition(g, 0, 0, 800, 800);
  }

  public static void rectPosition(Graphics g, int x, int y, int width, int heigth) {
    if (width < 3 || heigth < 3) {
      return;
    } else {
      g.setColor(Color.BLACK);
      g.drawRect(x, y, width, heigth);
      rectPosition(g, x + (width / 3), y, width / 3, heigth / 3);
      rectPosition(g, x, y + (heigth/3), width/3, heigth/3);
      rectPosition(g, x + (2*(width/3)+1), y + (heigth/3), width/3, heigth/3);
      rectPosition(g, x + (width / 3), y + (2*(heigth/3)+1), width/3, heigth/3);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(800, 800));
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