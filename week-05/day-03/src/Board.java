import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {


  Map map = new Map();
  ArrayList<GameObject> objectList = new ArrayList<>();
  Hero hero;
  BadGuy badGuy;

  public Board() {

    map.addMap();
    for (ArrayList<Tiles> tempList : map.getMap()) {
      for (Tiles tiles : tempList) {
        objectList.add(tiles);
      }
    }
    hero = new Hero();
    badGuy = new BadGuy();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (GameObject gameObject : objectList) {
      paintGameObject(graphics, gameObject);
    }
    paintGameObject(graphics, hero);
    paintGameObject(graphics, badGuy);

  }

  private void paintGameObject(Graphics graphics, GameObject gameObject) {
    PositionedImage image = new PositionedImage(gameObject.getCostume(), gameObject.getPosX() * 72, gameObject.getPosY() * 72);
    image.draw(graphics);
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setMinimumSize(new Dimension(738, 770));
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
    /*if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 100;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 100;
    }*/
    // and redraw to have a new picture with the new coordinates
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.turn(Hero.Directions.UP);
      if (hero.getPosY() > 0 && map.intMap[hero.getPosY() - 1][hero.getPosX()] == 1) {
        hero.moveTo(hero.getPosX(), hero.getPosY() - 1);
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.turn(Hero.Directions.DOWN);
      if (hero.getPosY() < map.intMap.length - 1 && map.intMap[hero.getPosY() + 1][hero.getPosX()] == 1) {
        hero.moveTo(hero.getPosX(), hero.getPosY() + 1);
        ;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.turn(Hero.Directions.LEFT);
      if (hero.getPosX() > 0 && map.intMap[hero.getPosY()][hero.getPosX() - 1] == 1) {
        hero.moveTo(hero.getPosX() - 1, hero.getPosY());
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.turn(Hero.Directions.RIGHT);
      if (hero.getPosX() < map.intMap[0].length - 1 && map.intMap[hero.getPosY()][hero.getPosX() + 1] == 1) {
        hero.moveTo(hero.getPosX() + 1, hero.getPosY());
      }
    }

    // and redraw to have a new picture with the new coordinates
    repaint();
  }


}
