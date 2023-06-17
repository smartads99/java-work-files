import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
//        Calculate Discount Of Product
        /*
        Example: If the list price of a product is $4500, and there is a 40% discount on it,
         calculate the price at which the customer can buy the product.

Discount percentage as a decimal = 40/100 = 0.4

Discount = 40% on the list price = 0.4 × 4500 = $1800

Therefore, Selling Price = List Price - Discount ($) = $4500 − $1800 = $2700.

Therefore, after the discount, the customer can buy the product for $2700.
         */
        System.out.println("Calculate Discount Of Product");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Price :");
        int price= in.nextInt();
        System.out.print("Enter the Discount :");
        float dis= in.nextFloat();
        float discount=(dis/100);
        int list_price= (int)(discount*price);
        int amount=price-list_price;
        System.out.println("After the discount,You can buy this product at Rs: "+amount);



    }
}
