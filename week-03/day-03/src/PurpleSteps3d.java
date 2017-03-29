/**
 * Created by Balázs on 2017. 03. 29..
 */

import java.awt.*;import javax.swing.*;

  import java.awt.*;

  import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

  public static Color PURPLE = new Color(128, 0, 128);
  public static void mainDraw(Graphics g) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps-3d/r4.png]
    int steps = 0;
    for (int i = 1; i < 7; i++) {
      int size = 10 * i;
      steps = size + size;
      g.setColor(PURPLE);
      g.fill3DRect(steps, steps, size, size, true);

    }
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
