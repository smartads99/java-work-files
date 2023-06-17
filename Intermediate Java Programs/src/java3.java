import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
//        Calculate Average Of N Numbers
        /*
        Average Formula:
         Average = (Sum of Observations) ÷ (Total Numbers of Observations)
         */
        System.out.println("Calculate Average Of N Numbers");
        Scanner in=new Scanner(System.in);
        System.out.print("How many number you want to enter: ");
        int size= in.nextInt();
        int n=0;
        int sum=0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Number :");
            n= in.nextInt();
            sum=sum+n;
        }
        int avg=sum/size;
        System.out.println(avg);

    }
}
