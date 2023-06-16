import java.util.Scanner;

public class base22 {
    public static void main(String[] args) {
//        Subtract the Product and Sum of Digits of an Integer
        /*
        Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
         */
        System.out.print("Enter the Number :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        subtractProductAndSum(n);

//        int apd = 1;
//        int sum = 0;
//
//        while (n != 0) {
//            int pd = n % 10;
//            n = n / 10;
//            apd = apd * pd;
//            sum = sum + pd;
//        }
//        int ans=apd-sum;
//        System.out.println("Result :"+ans);
    }

    public static int subtractProductAndSum(int n) {
        int apd = 1;
        int sum = 0;

        while (n != 0) {
            int pd = n % 10;
            n = n / 10;
            apd = apd * pd;
            sum = sum + pd;
        }
        int ans = apd - sum;
        return ans;
    }

    }

