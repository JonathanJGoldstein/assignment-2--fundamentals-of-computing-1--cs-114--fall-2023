import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //Initialize variables
    Scanner scan = new Scanner(System.in);
    int numGiven = 0;

    System.out.print("Enter input value:\n");
    numGiven = scan.nextInt();

    System.out.print("\n");

    if (numGiven % 2 == 0){
      printEvenCase(numGiven);
    }
    else{
      printOddCase(numGiven);
    }

    scan.close();
  }

  static void printOddCase(int input){
    //width and height of the the rhombus
    int width = input;
    int height = input;

    //print the top tip of the rhombus
    printTopBottomTipDiamond(width);

    //print the upper half and middle of the rhombus
    for (int i = 1; i < (int)(height/2) + 1; i++){
      printBlockSpace((width/2) - (i));
      printOddScanlineDiamond(i);
      System.out.print("\n");
    }

    //print the lower half of the rhombus
    for (int i = (int)(height/2)-1; i > 0; i--){
      printBlockSpace((width/2) - (i));
      printOddScanlineDiamond(i);
      System.out.print("\n");
    }

    //print the bottom tip of the rhombus
    printTopBottomTipDiamond(width);

    return;
  }

  static void printEvenCase(int input){
    //width and height of the the rhombus input chars (Including spaces)
    int width = (2 * input) - 1;
    int height = input + 1;

    //print the top tip of the rhombus
    printTopBottomTipDiamond(width);

    //print the upper half and middle of the rhombus
    for (int i = 1; i < (int)(height/2) + 1; i++){
      printBlockSpace((width/2) - (2 * i) + 1);
      printEvenScanlineDiamond(i);
      System.out.print("\n");
    }

    //print the lower half of the rhombus
    for (int i = (int)(height/2)-1; i > 0; i--){
      printBlockSpace((width/2) - (2 * i) + 1);
      printEvenScanlineDiamond(i);
      System.out.print("\n");
    }

    //print the bottom tip of the rhombus
    printTopBottomTipDiamond(width);

    return;
  }

  static void printTopBottomTipDiamond(int width){

    //set half of the scanline to spaces
    printBlockSpace((int)(width/2));

    //print the tip char input the middle most char space
    System.out.print("*");

    //set the other half of the line to spaces
    printBlockSpace((int)(width/2));
    System.out.print("\n");

    return;
  }

  static void printBlockSpace(int count){
    //loop through the amount of spaces required to be printed
    for (int i = 0; i < count; i++){
    System.out.print(" ");
    }
    return;
  }

  static void printEvenScanlineDiamond(int count){
    //print "* " the amount of times required for the current scanline based off of an even amount of chars
    for(int i = 0; i < 2*count; i++){
      System.out.print("* ");
    }

    return;
  }

  static void printOddScanlineDiamond(int count){
    //print "*" the amount of times required for the current scanline based off of an odd amount of chars
    //the +1 is to account for the fact that the input given is odd, therefore an extra asterisk is needed
    //to account for the series having one extra character per line
    for(int i = 0; i < 2*count + 1; i++){
      System.out.print("*");
    }

    return;
  }
}
