import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        //Find if a number is palindrome or not
        Scanner in=new Scanner(System.in);
        System.out.println("Find if a number is palindrome or not");
        System.out.print("Enter the number :");
        int n= in.nextInt();
        int o=n;
        int res=0;
        while(n!=0){
            int rem=n%10;
            res=(res*10)+rem;
            n=n/10;
        }
        if (o==res){
            System.out.println(o+" is Palindrome");
        }else {
            System.out.println(o+" is not Palindrome");
        }
    }
}
