import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int []digits={1,2,0};
        int len=digits.length-1;
        int last=digits[len];
        System.out.println(last);
        if(last<=9){
            digits[len]=last+1;
        }
        if(last==0){
            digits[len+1]=last+1;
        }
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]+" ");
        }
//        for (int i = name.length()-1; i>=0; i--) {
//            System.out.print(name.charAt(i)+ " ");
//        }
    }
}
