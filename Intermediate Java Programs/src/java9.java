import java.util.Scanner;

public class java9 {
    //Batting Average Calculator (Cricket)
    //batting average (cricket) = scored runs / times out
    public static void main(String[] args) {
        System.out.println("Batting Average Calculator (Cricket)");
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Runs Scored :");
        int rs= in.nextInt();
        System.out.print("Enter the Times Out :");
        int to= in.nextInt();
        float ba= (float) rs /to;
        System.out.format("Batting average is %.2f",ba);
    }
}
