import java.util.Scanner;

public class java22 {
    public static void main(String[] args) {
        //Check Leap Year Or Not
        System.out.println("Check Leap Year Or Not");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year= in.nextInt();
        if (year%400==0){
            System.out.println(year+" is Leap year ");
        }else if(year%100==0){
            System.out.println(year+" is Not a Leap year");
        } else if (year%4==0) {
            System.out.println(year+" is Leap year ");
        } else {
            System.out.println(year+" is Not a Leap year");
        }
    }
}
