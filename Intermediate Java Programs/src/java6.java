import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        /*
        An example calculation: a blue widget is sold for $70.
        The salesperson works on a commission - he/she gets 14% out of every transaction,
        which amounts to $9.80.

So the formula is: commission_amount = sale price * commission_percentage / 100.
         */
//        Calculate Commission Percentage
        System.out.println("Calculate Commission Percentage");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Sale price :");
        int sp=in.nextInt();
        System.out.print("Enter the Commission percentage :");
        float cp= in.nextInt();
        float ans = (sp * cp) /100;
        System.out.format("Rs:%.2f",ans);

    }
}
