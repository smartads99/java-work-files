import java.util.Scanner;

public class java9 {
    //Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= in.nextInt();
        factnum(n);
        
    }
    public  static void factnum(int x){
        int fact=1;
        for (int i = 1; i <=x ; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of  "+x+" is "+fact);
    }

}
