/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter square size#1: ");
    int Size1 = scanner.nextInt();
    System.out.println("Enter square size#2: ");
    int Size2 = scanner.nextInt();
    System.out.println("Enter square size#3: ");
    int Size3 = scanner.nextInt();

    drawMySquare(graphics, Size1, Size2, Size3);
  }



  public static void drawMySquare(Graphics g, int sSize1, int sSize2, int sSize3) {

    g.setColor(Color.GRAY);
    g.drawLine(0, 150, 300, 150);
    g.setColor(Color.GRAY);
    g.drawLine(150, 0, 150, 300);

    g.setColor(Color.RED);
    g.drawRect((300 - sSize1) / 2, (300 - sSize1) / 2, sSize1, sSize1);
    g.setColor(Color.GREEN);
    g.drawRect((300 - sSize2) / 2, (300 - sSize2) / 2, sSize2, sSize2);
    g.setColor(Color.BLUE);
    g.drawRect((300 - sSize3) / 2, (300 - sSize3) / 2, sSize3, sSize3);

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
