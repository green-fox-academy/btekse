/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class GoToCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.

    Scanner scanner = new Scanner(System.in);

      System.out.println("Enter line#1 starting x coordinate: ");
      int xcoord = scanner.nextInt();

      System.out.println("Enter line#1 starting y coordinate: ");
      int ycoord = scanner.nextInt();

      System.out.println("Enter line#2 starting x coordinate: ");
      int x2coord = scanner.nextInt();

      System.out.println("Enter line#2 starting y coordinate: ");
      int y2coord = scanner.nextInt();

      System.out.println("Enter line#2 starting x coordinate: ");
      int x3coord = scanner.nextInt();

      System.out.println("Enter line#2 starting y coordinate: ");
      int y3coord = scanner.nextInt();



    drawMyLine(graphics, xcoord, ycoord, x2coord, y2coord, x3coord, y3coord);
    }


  public static void drawMyLine(Graphics g, int x, int y, int x2, int y2, int x3, int y3) {

    g.setColor(Color.RED);
    g.drawLine(x, y, 150, 150);
    g.drawLine(x2, y2, 150, 150);
    g.drawLine(x3, y3, 150, 150);

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
