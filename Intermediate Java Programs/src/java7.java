import java.util.Scanner;

public class java7 {
//    Power In Java
    /*
    Enter the base: 11
Enter the exponent: 3
11 to the power 3 is: 1331
     */
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Power In Java");
    System.out.print("Enter the base : ");
    int base= in.nextInt();
    System.out.print("Enter the exponent: ");
    int expon= in.nextInt();
    int ans;
    int val=1;
    for (int i = 0; i <expon; i++) {
        ans=base*base;
        val=base*ans;
    }
    System.out.println(base +" power of " +expon+ " is "+val);

}
}
