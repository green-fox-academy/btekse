import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Balázs on 2017. 07. 02..
 */
public class ArrayMixes {
  public static void main(String[] args) {
    int[] list1 = {1, 2, 3, 4, 5};
    int[] list2 = {6, 7, 8};
    System.out.println(Arrays.toString(mixedArray(list1, list2)));
  }

  static int[] mixedArray(int[] list1, int[] list2) {
    int[] arrayResult = new int[list1.length + list2.length];
    int i;
    for ( i = 0; i < (Math.min(list1.length, list2.length)); i++) {
      arrayResult[i * 2] = list1[i];
      arrayResult[2 * i + 1] = list2[i];
    }
    int[] biggerList;
    if (list1.length > list2.length) {
      biggerList = list1;
    } else {
        biggerList = list2;
    }

    //int[] biggerList = list1.length > list2.length ? list1 : list2;


      for (int j = i; j < biggerList.length; j++) {
      arrayResult[j+i] = biggerList[j];
    }
    return arrayResult;
  }
}
