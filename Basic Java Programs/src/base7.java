import java.util.Scanner;

public class base7 {
    public static void main(String[] args) {
//        Area Of Equilateral Triangle

   /*
   Given,

Side of the equilateral triangle (a) = 28 cm

We know,

Area of an equilateral triangle = √3 a2/ 4

= (√3/4) × 28 sq cm2

= (√3/4) × 784 cm2

= 339.48196 cm2

    */
        System.out.println("Equilateral Triangle");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Side :");
        int a= in.nextInt();
        float ans=0.43301270189f*(a*a); //this value of root 0.4330127018988 * a sp(a2)= a*a
        System.out.println(ans +" cm 2");


    }
}
