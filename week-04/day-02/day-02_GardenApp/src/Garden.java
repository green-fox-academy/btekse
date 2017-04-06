import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> myPlants = new ArrayList<>();

  public void addPlant(Plant plant) {
    myPlants.add(plant);
  }

  public void watering(double water) {
    int numberOfThirstyPlants = 0;
    for (Plant plant : myPlants) {
      if (plant.thirsty())
        numberOfThirstyPlants++;
    }
    double waterAmount = water / numberOfThirstyPlants; //1 növénynek mennyi víz

    for (Plant plant : myPlants) {
      if (plant.thirsty())
        plant.watering(waterAmount);
    }
  }
}
