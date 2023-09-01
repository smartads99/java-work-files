import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a=in.next();
        String b=in.next();
        int sum=a.length()+b.length();
        System.out.println(sum);
        if(a.length()<b.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1)+" "+b.substring(0, 1).toUpperCase() + b.substring(1));

    }
}
