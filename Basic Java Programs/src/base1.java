import java.util.Scanner;

public class base1 {
    public static void main(String[] args) {
//        Area Of Circle Java Program
//
//        Let us consider the following illustrations based on the area of circle formula.
//
//                Example 1: If the length of the radius of a circle is 4 units. Calculate its area.
//
//                Solution:
//
//        Radius(r) = 4 units(given)
//
//        Using the formula for the circle's area,
//
//        Area of a Circle = πr2
//
//        Put the values,
//
//                A = π(4)2
//
//        A =π × 16
//
//        A = 16π ≈ 50.27
//
//        Answer: The area of the circle is 50.27 squared units
        System.out.println("Area Of Circle");
        System.out.print("Enter the Radius :");
        Scanner in=new Scanner(System.in);
        int r= in.nextInt();
//        int a=r*r;
//        System.out.println(a);
        float a= (r*r)*(22/7f);
        System.out.println("Area of Circle is :" + a);


    }
}

