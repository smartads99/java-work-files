import java.util.Scanner;

public class tryoutjava4 {
    public static void main(String[] args) {
        System.out.println("Eb bill");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name= input.nextLine();
        System.out.print("Enter the Reg.no :");
        int reg= input.nextInt();
        System.out.print("Enter your Previous unit : ");
        int pu= input.nextInt();
        System.out.print("Enter your Current unit : ");
        int cu= input.nextInt();
        int unit=pu-cu;
        System.out.println("====Eb bill====");
        System.out.println("Reg.No :"+reg);
        System.out.println("Name :"+name);
        System.out.println("Eb Unit is :"+unit);
        //1000 unit *10, 500 unit *5  300 unit *3 else unti*2
        if (unit>=1000){
            System.out.println("Your Eb Amount is Rs:"+(unit*10));
        }
        else if (unit>=500) {
            System.out.println("Your Eb Amount is Rs:"+(unit*5));
        }
        else if (unit>=300) {
            System.out.println("Your Eb Amount is Rs:"+(unit*3));
        }
        else {
            System.out.println("Your Eb Amount is Rs:"+(unit*2));
        }


    }
}
