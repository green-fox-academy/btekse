import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 28..
 */
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class DiagonalMatrix {
  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Please enter the height of the matrix: ");
    int matrixheight = myscanner.nextInt();
    int[][] matrix = new int[matrixheight][matrixheight];

    for (int i = 0; i < matrixheight; i++) {
      for (int j = 0; j < matrixheight; j++) {
        if (i == j) {
          matrix[i][j] = 0;
        }else{
          matrix[i][j] = 1;
        }

        }
      System.out.println(Arrays.toString(matrix[i]));
      }
    }
  }

