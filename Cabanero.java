package elect;

import java.util.Scanner;

public class Cabanero{
 public static void main(String args[]){
  Scanner elect = new Scanner(System.in);
  int number, number2;
  System.out.println("What is 100 / 2 ?");
  number = elect.nextInt();
  if (number == 50)
   System.out.println("Good");
   else
    System.out.println("Bad");
  System.out.println("50 * 100 = ?");
  number2 = elect.nextInt();
  if (number2 == 5000){
  System.out.println("Well done! Thanks for playing!");
  }else
   System.out.println("Try again !");
  
 }
}