public class Character extends GameObject {
  int randomNumber;

  public Character(int posX, int posY, String costume) {
    super(posX, posY, costume);
    this.map = map;
  }

  public void moveTo(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }



}
