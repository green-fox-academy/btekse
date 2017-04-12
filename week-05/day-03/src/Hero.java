public class Hero extends Character {

  static final String heroLeft = "img/hero-left.png";
  static final String heroRight = "img/hero-right.png";
  static final String heroUp = "img/hero-up.png";
  static final String heroDown = "img/hero-down.png";
  //static final String heroStart = "img/hero-down.png";

  public Hero() {
    super(0, 0, heroDown);
  }

  public void turn(Directions direction) {
    switch (direction) {
      case UP:
        costume = heroUp;
        break;
      case DOWN:
        costume = heroDown;
        break;
      case RIGHT:
        costume = heroRight;
        break;
      case LEFT:
        costume = heroLeft;
        break;

    }


  }

  public enum Directions {
    UP, DOWN, LEFT, RIGHT
  }

}
