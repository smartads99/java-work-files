import java.util.Scanner;

public class base23 {
    public static void main(String[] args) {
//        factors of that number
        System.out.println("Factors of that number");
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= in.nextInt();
        for (int i = 1; i<=n ; i++) {
            if(n%i==0)
            {
                System.out.print(i +" ");
            }
            
        }
    }
}
