/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics g){
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]



    g.setColor(Color.BLACK);
      g.drawLine(0, 150, 300, 150);
      g.setColor(Color.BLACK);
      g.drawLine(150, 0, 150, 300);

      g.setColor(Color.GRAY);
      g.drawLine(0, 0, 150, 150);
      g.setColor(Color.GRAY);
      g.drawLine(150, 0, 0, 150);

      g.setColor(Color.GRAY);
      g.drawLine(0, 150, 150, 300);
      g.setColor(Color.GRAY);
      g.drawLine(300, 300, 150, 150);
      g.setColor(Color.GRAY);
      g.drawLine(300, 0, 0, 300);

      g.setColor(Color.GRAY);
      g.drawLine(150, 0, 300, 150);
      g.setColor(Color.GRAY);
      g.drawLine(150, 300, 300, 150);
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
