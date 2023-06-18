import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        //Armstrong Number In Java
        System.out.println("Armstrong Number");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= in.nextInt();
        int orginal=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==orginal){
            System.out.println("it is Armstrong");

        }else {
            System.out.println("it is not Armstrong");
        }
    }
}
