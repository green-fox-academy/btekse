/**
 * Created by Balázs on 2017. 03. 31..
 */
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circle {

  public static void mainDraw(Graphics g) {
    ovalPosition(g, 0, 0, 900);
  }

  public static void ovalPosition(Graphics g, int x, int y, int size) {


    if (size < 100) {
      return;
    } else {
      g.setColor(Color.BLACK);
      g.drawOval(x, y, size, size);

      ovalPosition(g, x+size / 4, y, size / 2);
      ovalPosition(g, x+size /75, y+2*(size /6), size/2);
      ovalPosition(g, x+size - (size/2) - (size/75), y+2*(size/6), size/2);

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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);

    }
  }


}
