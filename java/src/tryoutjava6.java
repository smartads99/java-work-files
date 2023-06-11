import java.util.Scanner;

public class tryoutjava6 {
    public static void main(String[] args) {
//        1 Indian Rupee equal 0.012 United States Dollar
//        Input currency in rupees and output in USD.
        System.out.println("Inr into USD");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Rs. ");
        int rs= input.nextInt();
        float usd= rs /82.4f;
        System.out.println("Rs." +rs+" Equal to Usd $"+usd);



    }
}
