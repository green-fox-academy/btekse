import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CowsGV {
  ArrayList<Integer> nums = new ArrayList<>();

  public CowsGyuri(int n){
    for (int i = 0; i < n; i++){
      nums.add((int) (Math.random()*10));
    }
  }

  public CowsGyuri(){
    Scanner in = new Scanner(System.in);
    int  a = in.nextInt();

    while(a != 0){
      nums.add(a % 10);
      a /= 10;
    }
    Collections.reverse(nums);
  }

  public String toString(){
    return nums.toString();
  }
}