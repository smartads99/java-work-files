import java.util.Scanner;

public class java12 {
    public static void main(String[] args) {
        //Calculate Average Marks
        //Average = Sum of the Observations/Number of Observations
        System.out.println("Calculate Average Marks");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of subjects :");
        int n= in.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) {
            System.out.print("Enter the Marks "+i+ " :");
            int mark= in.nextInt();
            sum=sum+mark;
        }
        float avg= (float) sum /n;
        System.out.println("The Average "+n+" Marks is "+avg);

    }
}
