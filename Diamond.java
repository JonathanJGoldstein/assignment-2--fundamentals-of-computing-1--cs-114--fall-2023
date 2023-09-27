import java.util.Scanner;

import org.w3c.dom.events.Event;
public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num_given = 0;
    System.out.print("Enter input value:\n");
    num_given = scan.nextInt();
    System.out.print("\n");
    if (num_given % 2 == 0){
      //The given number is even
      case_even(num_given);
    }
    else{
      case_odd(num_given);
    }
  }



  static void case_odd(int I){
    int Width = I;
    int Height = I;
    Print_Tip_Diamong(Width);
    for (int Iteration = 1; Iteration < (int)(Height/2) + 1; Iteration++){
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      Odd_Print_Scan_Diamond(Iteration);
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      System.out.print("\n");
    }
    for (int Iteration = (int)(Height/2)-1; Iteration > 0; Iteration--){
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      Odd_Print_Scan_Diamond(Iteration);
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      System.out.print("\n");
    }
    Print_Tip_Diamong(Width);
  }

  static void case_even(int I){
    int Width = (2 * I) - 1;
    int Height = I + 1;
    //print amount of space characters required
    Print_Tip_Diamong(Width);

    for (int Iteration = 1; Iteration < (int)(Height/2) + 1; Iteration++){
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      Even_Print_Scan_Diamond(Iteration);
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      System.out.print("\n");
    }
    for (int Iteration = (int)(Height/2)-1; Iteration > 0; Iteration--){
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      Even_Print_Scan_Diamond(Iteration);
      Print_Block_Space((Width/2) - (2 * Iteration) + 1);
      System.out.print("\n");
    }
    Print_Tip_Diamong(Width);
  }

  static void Print_Tip_Diamong(int Width){
    Print_Block_Space((int)(Width/2));
    System.out.print("+");
    Print_Block_Space((int)(Width/2));
    System.out.print("\n");
  }
  static void Print_Block_Space(int Width){
    for (int i = 0; i < Width; i++){
    System.out.print(" ");
    }
    return;
  }

  static void Even_Print_Scan_Diamond(int Iteration){
    for(int i = 0; i < 2*Iteration; i++){
      System.out.print("+ ");
    }
    return;
  }
  static void Odd_Print_Scan_Diamond(int Iteration){
    for(int i = 0; i < 2*Iteration + 1; i++){
      System.out.print("+");
    }
  }
}
