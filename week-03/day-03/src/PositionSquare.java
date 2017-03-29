/**
 * Created by Balázs on 2017. 03. 29..
 */
import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter square#1 starting x coordinate: ");
    int xcoord = scanner.nextInt();

    System.out.println("Enter square#1 starting y coordinate: ");
    int ycoord = scanner.nextInt();

    System.out.println("Enter square#2 starting x coordinate: ");
    int x2coord = scanner.nextInt();

    System.out.println("Enter square#2 starting y coordinate: ");
    int y2coord = scanner.nextInt();

    System.out.println("Enter square#3 starting x coordinate: ");
    int x3coord = scanner.nextInt();

    System.out.println("Enter square#3 starting y coordinate: ");
    int y3coord = scanner.nextInt();
    drawMySquare(graphics, xcoord, ycoord, x2coord, y2coord, x3coord, y3coord);
  }

  public static void drawMySquare(Graphics g, int x, int y, int x2, int y2, int x3, int y3) {

    g.setColor(Color.RED);
    g.fillRect(x, y, 50, 50);
    g.setColor(Color.GREEN);
    g.fillRect(x2, y2, 50, 50);
    g.setColor(Color.BLUE);
    g.fillRect(x3, y3, 50, 50);

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
