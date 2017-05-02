import java.util.Random;

public class Pirates {
  private String pirateName;
  private int rumLevel;
  private boolean isAlive;
  private boolean hasParrot;

  public Pirates (String pirateName) {
    this.pirateName = pirateName;
    this.rumLevel = rumLevel;
    this.isAlive = true;
    this.hasParrot = true;
  }

public void drinkSomeRum() {
    if (this.isAlive) {
      rumLevel++;
    } else {
      System.out.println(pirateName + " dead");
    }
}

public void howItsGoingMate() {
    if (this.isAlive) {
      if (this.rumLevel > 0) {
        int randomNumber = (int) (Math.random() * 4);
        for (int i = 0; i < randomNumber; i++) {
          System.out.println("Pour me anudder");
        } else{
          System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
      } else {
        System.out.println(this.pirateName + "dead");
      }
    }

    public void die() {
      this.isAlive = false;
  }

  public void brawl(Pirates otherPirate) {
      Random random = new Random();
      int randomNumber = random.nextInt(3);
      if (randomNumber == 0) {
        otherPirate.isAlive = false;
      } else if (randomNumber == 1) {
        this.isAlive = false;
      } else {
        this.isAlive = false;
        otherPirate.isAlive = false;
      }
  }

  public String getName() {
    return pirateName;
  }


  public int getRumLevel() {
    return rumLevel;
  }

  public boolean isAlive() {
    return isAlive;
  }

  @Override
  public String toString() {
    return pirateName;
  }
}

}
