import java.util.Scanner;

public class base4 {
    public static void main(String[] args) {


        //Area Of Isosceles Triangle

//    Example 1: Find the area of an isosceles triangle given the length of the base is 10 cm and height is 17 cm?
//
//    Solution:
//
//    Base of the triangle (b) = 10 cm
//
//    Height of the triangle (h) = 17 cm
//
//    Area of Isosceles Triangle = (1/2) × b × h
//
//                = (1/2) × 10 × 17
//
//        = 5 × 17
//
//        = 85 cm2
//
//    Answer: The area of the given isosceles triangle is 85 cm2.

        System.out.println("Area Of Isosceles Triangle");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Base of the Triangle :");
        int b= in.nextInt();
        System.out.print("Enter the Height of the Triangle :");
        int h= in.nextInt();
        float r=(1/2f)*b*h;
        System.out.println("The Area of the given Isosceles Triangle is "+r+" cm 2");
    }
}
