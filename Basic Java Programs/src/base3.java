import java.util.Scanner;

public class base3 {
    public static void main(String[] args) {
        //Area of Rectangle

//        Example: Find the area of the rectangle whose length is 15 units and width is 4 units.
//
//                Solution: Given, length = 15 units and width = 4 units.
//
//                The formula to find the area of a rectangle is A = l × w.
//                Substitute 15 for 'l' and 4 for 'w' in this formula.
//                Therefore, area of the rectangle = 15 × 4 = 60
//
//        Therefore, the area of the rectangle = 60 square units.

        Scanner in =new Scanner(System.in);
        System.out.println("Area of Rectangle");
        System.out.print("Enter the Length :");
        int l= in.nextInt();
        System.out.print("Enter the Width :");
        int w= in.nextInt();
        int r=l*w;
        System.out.println("The Area of Rectangle "+ r +" Square units.");
    }
}
