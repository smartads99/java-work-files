import java.util.Scanner;

public class base2 {
    public static void main(String[] args) {
//        Area Of Triangle
        System.out.println("Area of Triangle");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Base :");
        int b=in.nextInt();
        System.out.print("Enter the Height :");
        int h=in.nextInt();
//        A = 1/2 × b × h
        float a=(b*h)*(1/2f);
        System.out.println("Area of Triangle is :" +a);

    }
}

