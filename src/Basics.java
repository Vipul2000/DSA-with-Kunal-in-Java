import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        //For printing anything in java we use
        System.out.println("Hey how are you");

        //For taking inputs in Java we use scanner class.
        Scanner sc = new Scanner(System.in);

        //Primitive DataTypes- That can't be break into further data types.

        int age = 26;
        char letter ='r';
        float marks = 26.6f;
        double largeDecimalNumbers = 4567456.4567;
        long largeIntegerValue = 999999999999999999L;
        boolean check = true;
        //or
        boolean month = false;

        /*Scanner sc = new Scanner(System.in);
        System.out.println("please enter some input: ");
        int rollNo= sc.nextInt();

        System.out.println("The roll no is: " + rollNo);*/

        //Typecasting and conversion.
        int num = (int)(65.65f);
        System.out.println(num);



    }
}
