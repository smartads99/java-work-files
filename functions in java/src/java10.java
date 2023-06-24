import java.util.Scanner;

public class java10 {
    //Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Find if a number is a palindrome or not");
        System.out.print("Enter the number : ");
        int num= in.nextInt();
        palindrome(num);
    }
    public static void palindrome(int num){
       int check=num;
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=(res*10)+rem;
            num=num/10;
        }
        if (check==res){
            System.out.println(check +" is Palindrome");
        }else {
            System.out.println(check + " is not a Palindrome");
        }
    }
}
