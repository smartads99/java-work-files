import java.util.Scanner;

public class inttostring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String ans= String.valueOf(n);
        if (n == Integer.parseInt(ans)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
