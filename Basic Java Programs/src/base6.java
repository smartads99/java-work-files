import java.util.Scanner;

public class base6 {
    public static void main(String[] args) {
       /*
Example 1: Calculate the area of a rhombus having diagonals equal to 6 cm and 8 cm.

Solution:

Given that,

Diagonal 1, d1 = 6 cm

Diagonal 2, d2 = 8 cm

Area of a rhombus, A = (d1 × d2) / 2

= (6 × 8) / 2

= 48 / 2

= 24 cm2

Hence, the area of the rhombus is 24 cm2.
        */
        System.out.println("Area Of Rhombus");
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the 1 Diagonal :");
        int fd= in.nextInt();
        System.out.print("Enter the 2 Diagonal :");
        int sd=in.nextInt();
        int ans= (fd*sd)/2;
        System.out.println("Area of a Rhombus is "+ ans +" cm 2");

    }

}


