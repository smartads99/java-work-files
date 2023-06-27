import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>(5);
        list.add(10);
        list.add(30);
        list.add(1);
        list.add(0);
        list.add(10);
        list.add(305);
        list.add(120);
        list.add(305);
        list.add(10);
        list.add(30);
        list.add(1);
        list.add(0);
        list.add(10);
        list.add(305);
        list.add(120);
        list.add(305);
        list.add(10);
        list.add(30);
        list.add(1);
        list.add(0);
        list.add(10);
        list.add(305);
        list.add(120);
        list.add(305);
        list.add(4444);

        System.out.println(list);

        ArrayList<ArrayList<Integer>>multarraylist=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            multarraylist.add(new ArrayList<>(i));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                multarraylist.get(i).add(in.nextInt());
            }
        }
        System.out.println(multarraylist);


    }
}