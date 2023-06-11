import java.util.Scanner;

public class tryoutjava2 {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name= input.nextLine();
        System.out.println("Hi "+ name +" your doing good keep going..");
    }
}

