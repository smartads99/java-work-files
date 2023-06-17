import java.util.Scanner;

public class base26 {
    //Addition Of Two Numbers
    public static void main(String[] args) {
        System.out.println("Addition Of Two Numbers");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number a :");
        int a= in.nextInt();
        System.out.print("Enter the number b :");
        int b=in.nextInt();
        int sum=a+b;
        System.out.println("Addition Of "+ a +" and "+ b +" Numbers is "+sum);
    }
}