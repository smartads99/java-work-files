import java.util.Scanner;

public class substringcomparison {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n=in.next();
        int num=in.nextInt();
        System.out.println(getSmallestAndLargest(n,num));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        StringBuilder e=new StringBuilder(s);
        e.reverse();
        smallest=e.substring(0,3);
        largest=s.substring(0,3);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }
}
