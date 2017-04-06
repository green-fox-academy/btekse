public class Main {
  public static void main(String[] arsg) {
    Garden garden = new Garden();
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));
    garden.addPlant(new Flower("yellow"));
    garden.addPlant(new Flower("blue"));

    printGardenState(garden);

    garden.watering(40);
    System.out.println("\nWatering with 40");
    printGardenState(garden);

    garden.watering(70);
    System.out.println("\nWatering with 70");
    printGardenState(garden);
  }
  private static void printGardenState(Garden garden) {
    for (Plant plant : garden.myPlants) {
      System.out.println(plant.toString());
    }
  }
}
