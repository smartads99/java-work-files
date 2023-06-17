import java.util.Scanner;

public class java10 {
    //Calculate CGPA Java Program
    public static void main(String[] args) {
        System.out.println("CGPA Calculator");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of Subject : ");
        int ns= in.nextInt();
        int sum=0;
        for (int i = 1; i <=ns; i++) {
            System.out.print("Enter the Subject "+ i+ ": ");
            int n= in.nextInt();
            if(n<=10) {
                sum = sum + n;
            }else {
                System.out.println("Grade Points is less than 10");
                break;
            }
        }
        float grade=sum/ns;
        int ch=(int)grade;
        System.out.println("CGPA is "+grade);
        switch (ch){
            case 10:
                System.out.println("Your Grade is A1");
                System.out.println("Marks Range is 91-100");
                System.out.println("Percentage is 95 %");
                break;
            case 9:
                System.out.println("Your Grade is A2");
                System.out.println("Marks Range is 81-90");
                System.out.println("Percentage is 85.5 %");
                break;
            case 8:
                System.out.println("Your Grade is B1");
                System.out.println("Marks Range is 71-80");
                System.out.println("Percentage is 76 %");
                break;
            case 7:
                System.out.println("Your Grade is B1");
                System.out.println("Marks Range is 61-70");
                System.out.println("Percentage is 66.5 %");
                break;
            case 6:
                System.out.println("Your Grade is C1");
                System.out.println("Marks Range is 51-60");
                System.out.println("Percentage is 57 %");
                break;
            case 5:
                System.out.println("Your Grade is C2");
                System.out.println("Marks Range is 41-50");
                System.out.println("Percentage is 47.5 %");
                break;
            case 4:
                System.out.println("Your Grade is D");
                System.out.println("Marks Range is 33-40");
                System.out.println("Percentage is 38 %");
                break;
            default:
                System.out.println("Fail......");
                break;



        }

    }
}
