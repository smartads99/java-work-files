import java.util.Scanner;

public class java20 {
    public static void main(String[] args) {
        //Java Program Vowel Or Consonant
        System.out.println("Alphabet is Vowel or Consonant");
        System.out.print("Enter the Alphabet : ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(ch +"  is Vowel");
                break;
            default:
                System.out.println(ch+"  is Consonant");
        }
    }
}
