import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100).
        /* Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
         */
        Scanner in=new Scanner(System.in);
        System.out.println("Student Mark List");
        System.out.print("Enter the name : ");
        String name= in.nextLine();
        System.out.print("Enter the mark 1 : ");
        int m1= in.nextInt();
        System.out.print("Enter the mark 2 : ");
        int m2= in.nextInt();
        System.out.print("Enter the mark 3 : ");
        int m3= in.nextInt();
        System.out.print("Enter the mark 4 : ");
        int m4= in.nextInt();
        System.out.print("Enter the mark 5 : ");
        int m5= in.nextInt();
        System.out.println("\n=================");
        System.out.println("Student Mark List");
        System.out.println("=================");
        System.out.println("Name :"+name);
        System.out.println("Mark 1 : "+m1);
        grade(m1);
        System.out.println("Mark 2 : "+m2);
        grade(m2);
        System.out.println("Mark 3 : "+m3);
        grade(m3);
        System.out.println("Mark 4 : "+m4);
        grade(m4);
        System.out.println("Mark 5 : "+m5);
        grade(m5);
        markout(m1,m2,m3,m4,m5);


    }

    public static void markout(int m1, int m2, int m3, int m4, int m5) {
        int total = m1 + m2 + m3 + m4 + m5;
        int avg = total / 5;
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);

    }

    public static void grade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Wrong Entry");
        } else if (marks < 40) {
            System.out.println("Fail");
        } else if (marks >= 41 && marks < 50) {
            System.out.println("Grade is DD");
        } else if (marks >= 51 && marks < 60) {
            System.out.println("Grade is CD");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade is BC");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade is BB");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade is AB");
        } else {
            System.out.println("Grade is AA");
        }
    }

}

