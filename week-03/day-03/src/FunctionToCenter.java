/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter x coordinate: ");
    int xcoord = scanner.nextInt();
    System.out.println("Enter x coordinate: ");
    int ycoord = scanner.nextInt();


    drawMySquare(graphics, xcoord, ycoord);
  }



  public static void drawMySquare(Graphics g, int x, int y) {

    g.setColor(Color.BLACK);
    g.drawLine(x, y, 300/2, 300/2);
    g.setColor(Color.GRAY);
    g.drawLine(0, 0, 300/2, 300/2);
    g.setColor(Color.GRAY);
    g.drawLine(300, 300, 300/2, 300/2);
    g.setColor(Color.GRAY);
    g.drawLine(300, 0, 300/2, 300/2);
    g.setColor(Color.GRAY);
    g.drawLine(0, 300, 300/2, 300/2);


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