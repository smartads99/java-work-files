import java.util.Scanner;

public class base5 {
    public static void main(String[] args) {
//        Area Of Parallelogram
//        Solved Example
//        Example: Calculate the area of a parallelogram with the length of diagonals as 15.6 cm and 17.2 cm respectively. The angle of the intersection of the two diagonals is 120o.
//
//                Solution: Given that
//
//        Length of First Diagonal = 15.6 cm
//        Length of Second Diagonal = 17.2 cm
//        Using the Area of Parallelogram Formula,
//
//                Area = 1/2 × d1 × d2 sin (x)
//
//                Area of Parallelogram = ½ x 15.6 x 17.2 sin(120)
//
//                = ½ x 15.6 x 17.2 x √3/2
//
//                = 232.37 cm2
//
//        Thus, the area of the given parallelogram is 232.37 cm2.
        System.out.println("Area Of Parallelogram");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter First Length of Diagonal :");
        float f= in.nextFloat();
        System.out.println("Enter Second Length of Diagonal :'");
        float s= in.nextFloat();
        System.out.println("Enter the Angle between Two Diagonals ");
        int a=in.nextInt();
        a=a/2;//sin(x)
        System.out.println(a);
        float r=(1/2f)*(f*s*a);
        System.out.println("The area of the given parallelogram is "+r+" cm 2.");

        //trying to = the sin with the value

    }
}
