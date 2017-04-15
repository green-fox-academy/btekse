/**
 * Created by Balázs on 2017. 03. 22..
 */
// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

public class IWontCheatOnTheExams {
  public static void main(String[] args){
    int a = 1;
    while (a <= 100) {
      System.out.println("I won't cheat on the exam! (with while) #" + a);
      a += 1;
    }
    for (int i = 1; i <= 100; i++) {
      System.out.println("I won't cheat on the exam! (with for) #" + i);
    }
  }
}

