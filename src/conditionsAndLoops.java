import java.util.Scanner;

public class conditionsAndLoops {
    public static void main(String[] args) {

        //Syntax of if-else statement is like:-

        /*
           if(conditions expression which is Tor F){

              Body
           }

           else{

              do this
           }


        */

        int salary = 25000;
        if (salary>10000){
            salary= salary+2000;
        }
        else {
            salary= salary+1000;
        }


        //Multiple if-else statement
        //For more than one if statement we use else if

        int salary = 20000;

        if (salary>10000){
            salary= salary+1000;
        }
        else if (salary>20000){
            salary = salary+2000;
        }

        else {
            salary = salary+500;
        }
        System.out.println(salary);

        //Loops in Java
        //For loops

        /*for (int num = 1; num <=5 ; num++) {
            System.out.println(num);
        }*/

        //Print number from 1 to n

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int num = 1; num <= n ; num++) {
            System.out.println(num);
        }

        //While Loop

        //Print 1 to 5 using while loops

        int nums =1;
        while (nums<=5){
            System.out.println(nums);
            nums++;
        }

        //Do while loops

        int n =1;

        do {
            System.out.println(n);
            n++;
        } while (n<=5);

    }
}
