import java.util.Scanner;

public class java15 {
    public static void main(String[] args) {
//Reverse A String In Java
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String :");
        String n=in.nextLine();
        String a ="";
        for (int i = 0; i < n.length(); i++) {
            a = n.charAt(i) + a;
        }
        System.out.print("Reverse of "+n+" is "+a);
    }
}
