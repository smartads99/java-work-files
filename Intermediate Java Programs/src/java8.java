import java.util.Scanner;

public class java8 {
    //Depreciation per year  =Asset Cost - Salvage Value/Useful life
    public static void main(String[] args) {
        //Calculate Depreciation of Value
        System.out.println("Calculate Depreciation of Value");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Asset Cost :");
        int ac= in.nextInt();
        System.out.print("Enter the Salvage Value :");
        int sv= in.nextInt();
        System.out.print("Depreciation Years :");
        int dy= in.nextInt();
        int dpy=(ac-sv)/dy;
        System.out.println("The depreciation per year is Rs: "+dpy);
    }
}
