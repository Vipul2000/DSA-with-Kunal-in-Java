//Switch cases and nested case in java
/*
  In switch statements you can jumps to various cases based on your expression.

  Syntax:-

  switch (expression){
  //cases
  case one:
  //do something
  break;

  case two:
  //do something
  break;

  default:
  //do something


 */


import java.util.Scanner;

public class switchCasesAndNestedCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

    /*    if (fruit.equals("mango")){
            System.out.println("Kings of fruits");
        }

        if (fruit.equals("Apple")){
            System.out.println("Sweet red fruit");
        } */


        switch (fruit){
            case "Mango":
                System.out.println("The king of fruits");
                break;

            case "Apple":
                System.out.println("A sweet red fruit");
                break;

            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
