import java.util.Scanner;

public class tryoutjava8 {
    public static void main(String[] args) {

        System.out.println("String is palindrome or not ");
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the string :");
        String arr=in.nextLine();
        String oname=arr;
        String nre="";
        for (int i = 0; i < arr.length(); i++) {
            char ch= arr.charAt(i);
            nre=ch+nre;
        }

        if(oname.equals(nre)){
            System.out.println("The "+arr+" is palindrome ");
        }else {
            System.out.println("The "+ arr+ " is not palindrome");
        }



    }
}


