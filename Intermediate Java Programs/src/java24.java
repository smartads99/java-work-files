import java.util.Scanner;

public class java24 {
    public static void main(String[] args) {
        //Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.
        System.out.println("Write a program to count the number of days he can go out in the month of August");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Month : ");
        int m= in.nextInt();
        int day=0;
        if(m<=12) {
            if (m==2)
            {
                for (int i = 1; i <= 28; i++) {
                    if (i % 2 == 0) {
                        day = day + 1;
                    }
                }
            }
            else if (m % 2 == 0) {
                for (int i = 1; i <= 31; i++) {
                    if (i % 2 == 0) {
                        day = day + 1;
                    }
                }

            } else {
                for (int i = 1; i <= 30; i++) {
                    if (i % 2 == 0) {
                        day = day + 1;
                    }
                }
            }
        } else {
            System.out.println("In invalid Month pls Enter ( 1 to 12 ).....");
        }

        System.out.println("Kunal you can out "+day+" days in Month "+m);
    }
}
