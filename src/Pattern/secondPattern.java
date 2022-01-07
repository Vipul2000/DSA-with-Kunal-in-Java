package Pattern;

import java.util.Scanner;

public class secondPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();

        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <=n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
