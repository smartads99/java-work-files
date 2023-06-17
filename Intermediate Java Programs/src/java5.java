import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
//        Calculate Distance Between Two Points
        /*
        Find the distance between two points if the coordinates are (5,2) and (7,8) and
         verify using the distance calculator.

Solution:

Distance between two points = √[(x2 - x1)2 + (y2 - y1)2]

= √[(7 - 5)2 + (8 - 2)2]

= √[(2)2 + (6)2]

= √[4 + 36]

= √[40]

= 2√10

= 6.32 units
         */
        System.out.println("Calculate Distance Between Two Points");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the A point :");
        int x1= in.nextInt();
        int x2= in.nextInt();
        System.out.print("Enter the b point :");
        int y1= in.nextInt();
        int y2=in.nextInt();
        int vx=y1-x1;
        int vy=y2-x2;
        int ans=(vx*vx)+(vy*vy);  //√[(x2 - x1)2 + (y2 - y1)2]
        float unit = (float) Math.sqrt(ans);
        System.out.format("%.2f units",unit);

    }
}
