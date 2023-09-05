import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name1= in.next();
        String name2=in.next();
        name1=name1.toLowerCase();
        name2=name2.toLowerCase();

        // check if length is same
        if(name1.length() == name2.length()) {

            // convert strings to char array
            char[] charArray1 = name1.toCharArray();
            char[] charArray2 = name2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println("Anagrams");
            }
            else {
                System.out.println("Not Anagrams");
            }
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}
//        boolean ans=false;
//        for (int i = 0; i < name1.length(); i++) {
//            for (int j = i+1; j <name2.length() ; j++) {
//                if(name1.charAt(i)==name2.charAt(j)){
//                    ans=true;
//                }else{
//                    ans=false;
//                  }
//            }
//        }
//        if(ans==true){
//            System.out.println("Anagrams");
//        }else{
//            System.out.println("Not Anagrams");
//        }
////        int add1=0;
////        int add2=0;
////        for (int i = 0; i < name1.length(); i++) {
////            add1=add1+(int)name1.charAt(i);
////        }
////        for (int i = 0; i < name2.length(); i++) {
////            add2=add2+(int)name2.charAt(i);
////        }
////        if((add1-add2)==0){
////            System.out.println("Anagrams");
////        }else {
////            System.out.println("Not Anagrams");
////        }

