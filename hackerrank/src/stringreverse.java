import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        StringBuilder n = new StringBuilder(name);
        n.reverse();
        System.out.println(name);
        System.out.println(n);
        if(name.contentEquals(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
//        if(n==ans){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//        System.out.println(ans);
    }
}
