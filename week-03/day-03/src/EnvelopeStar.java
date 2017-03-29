/**
 * Created by Balázs on 2017. 03. 30..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics g){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]


    for (int i = 0; i <= 10; i++) {
      g.setColor(Color.GREEN);
      g.drawLine((i * 15), 150, 150, 150 - (i * 15));
      g.setColor(Color.GREEN);
      g.drawLine(150, i * 15, 150 + i *15, 150);
      g.setColor(Color.GREEN);
      g.drawLine(300 - i *15, 150, 150, 150 + i *15);
      g.setColor(Color.GREEN);
      g.drawLine(0 + i *15, 150,150,150 + i *15);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
