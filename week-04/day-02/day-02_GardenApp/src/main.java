/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Main {
  public static void main(String[] arsg) {
    Garden garden = new Garden();
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));
    garden.addPlant(new Flower("yellow"));
    garden.addPlant(new Flower("blue"));

    for (Plant plant : garden.myPlants) {
      System.out.println(plant.toString());
    }
    garden.watering(40);
    System.out.println("\nWatering with 40");
    for (Plant plant : garden.myPlants) {
      System.out.println(plant.toString());
    }
    garden.watering(70);
    System.out.println("\nWatering with 70");
    for (Plant plant : garden.myPlants) {
      System.out.println(plant.toString());
    }
  }
}
