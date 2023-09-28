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
      case_even(num_given);
    }
    else{
      case_odd(num_given);
    }

    scan.close();
  }



  static void case_odd(int I){
    //width and height of the the rhombus
    int width = I;
    int height = I;

    //print the top tip of the rhombus
    Print_Tip_Diamond(width);

    //print the upper half and middle of the rhombus
    for (int Iteration = 1; Iteration < (int)(height/2) + 1; Iteration++){
      Print_Block_Space((width/2) - (Iteration));
      Odd_Print_Scanline_Diamond(Iteration);
      System.out.print("\n");
    }

    //print the lower half of the rhombus
    for (int Iteration = (int)(height/2)-1; Iteration > 0; Iteration--){
      Print_Block_Space((width/2) - (Iteration));
      Odd_Print_Scanline_Diamond(Iteration);
      System.out.print("\n");
    }

    //print the bottom tip of the rhombus
    Print_Tip_Diamond(width);
  }

  static void case_even(int I){
    //width and height of the the rhombus
    int width = (2 * I) - 1;
    int height = I + 1;

    //print the top tip of the rhombus
    Print_Tip_Diamond(width);

    //print the upper half and middle of the rhombus
    for (int Iteration = 1; Iteration < (int)(height/2) + 1; Iteration++){
      Print_Block_Space((width/2) - (2 * Iteration) + 1);
      Even_Print_Scan_Diamond(Iteration);
      System.out.print("\n");
    }

    //print the lower half of the rhombus
    for (int Iteration = (int)(height/2)-1; Iteration > 0; Iteration--){
      Print_Block_Space((width/2) - (2 * Iteration) + 1);
      Even_Print_Scan_Diamond(Iteration);
      System.out.print("\n");
    }

    //print the bottom tip of the rhombus
    Print_Tip_Diamond(width);
  }

  static void Print_Tip_Diamond(int width){

    //set half of the scanline to spaces
    Print_Block_Space((int)(width/2));

    //print the tip char in the middle most char space
    System.out.print("*");

    //set the other half of the line to spaces
    Print_Block_Space((int)(width/2));
    System.out.print("\n");
  }

  static void Print_Block_Space(int count){
    //loop through the amount of spaces required to be printed
    for (int i = 0; i < count; i++){
    System.out.print(" ");
    }
    return;
  }

  static void Even_Print_Scan_Diamond(int Iteration){
    //print "* " the amount of times required for the current scanline based off of an even amount of chars
    for(int i = 0; i < 2*Iteration; i++){
      System.out.print("* ");
    }
    return;
  }

  static void Odd_Print_Scanline_Diamond(int Iteration){
    //print "* " the amount of times required for the current scanline based off of an odd amount of chars
    //the +1 is to account for the fact that the input given is odd, therefore an extra asterisk is needed
    //to account for the series having one extra character per line
    for(int i = 0; i < 2*Iteration + 1; i++){
      System.out.print("*");
    }
  }
}
