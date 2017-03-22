import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 22..
 */
public class PrintBigger {

public static void main(String[]args){

// Write a program that asks for two numbers and prints the bigger one

  Scanner myScanner=new Scanner(System.in);

  System.out.println("Enter number #1: ");
  int n1 = myScanner.nextInt();

  System.out.println("Enter number #2: ");
  int n2 = myScanner.nextInt();

  if (n1 > n2){
  System.out.println("Bigger: "+n1);
  }
  else {
  System.out.println("Bigger: " + n2);
  }

  }
  }
