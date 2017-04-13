import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    String heroLeft = "img/hero-left.png";
    String heroRight = "img/hero-right.png";
    String heroUp = "img/hero-up.png";
    String heroDown = "img/hero-down.png";
    String heroStart = "img/hero-down.png";

  static final int DIMENSION = 72;
  int[][] wallMatrix = new int[][]{
    {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
    {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
    {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
    {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
    {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
    {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
    {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
    {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
    {1, 0, 1, 0, 1, 0, 1, 1, 1, 1}
  };

  public Board() {
    testBoxX = 0;
    testBoxY = 0;

    // set the size of your draw board
    setPreferredSize(new Dimension(DIMENSION * 10, DIMENSION * 11));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    //int posX = 0;
    //int posY = 0;
    for (int i = 0; i < wallMatrix.length; i++) {
      for (int j = 0; j < wallMatrix[i].length; j++) {
        if (wallMatrix[i][j] == 1) {
          PositionedImage floor = new PositionedImage("img/floor.png", j * DIMENSION, i * DIMENSION);
          floor.draw(graphics);
        } else {
          PositionedImage wall = new PositionedImage("img/wall.png", j * DIMENSION, i * DIMENSION);
          wall.draw(graphics);
        }
      }
      PositionedImage hero = new PositionedImage(heroStart, testBoxX, testBoxY);
      hero.draw(graphics);
    }
  }


  public static void boardMain() {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      heroStart = heroUp;
      if (testBoxY > 0 && wallMatrix[testBoxY / DIMENSION - 1][testBoxX / DIMENSION] == 1) {
        testBoxY -= DIMENSION;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      heroStart = heroDown;
      if (testBoxY < 10 * DIMENSION && wallMatrix[testBoxY / DIMENSION + 1][testBoxX / DIMENSION] == 1) {
        testBoxY += DIMENSION;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroStart = heroLeft;
      if (testBoxX > 0 /*&& testBoxY > 0 */&& wallMatrix[testBoxY / 72][testBoxX / DIMENSION - 1] == 1) {
        testBoxX -= DIMENSION;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      heroStart = heroRight;
      if (testBoxX < 9 * DIMENSION && wallMatrix[testBoxY / 72][testBoxX / 72 + 1] == 1) {
        testBoxX += DIMENSION;
      }
    }
    repaint();
  }
}