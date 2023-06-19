import java.util.Scanner;

public class java21 {
    public static void main(String[] args) {
        //Perfect Number In Java
        System.out.println("Perfect Number In Java");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n= in.nextInt();
        int sum=0;
        for (int i = 1; i <=n/2; i++) {
          if(n%i==0){
              sum=sum+i;
          }
        }
        if(n==sum){
            System.out.println(n+ " is Perfect Number");
        }else{
            System.out.println(n+" is not a Perfect Number");
        }

    }
}
