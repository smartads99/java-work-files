import java.util.Scanner;

public class java18 {
    public static void main(String[] args) {
        //HCF Of Two Numbers Program
        /*
        x = 50
y = 100
if x > y:
  x, y = y, x
for i in range(1,x+1):
  if x%i == 0 and y%i == 0:
    hcf = i

print("HCF of", x, "and", y, "is:", hcf)
         */
        System.out.println("HCF Of Two Numbers Program");
        System.out.print("Enter the number : ");
        Scanner in=new Scanner(System.in);
        int x= in.nextInt();
        System.out.print("Enter the number :");
        int y= in.nextInt();
        int hcf = 0;
        for (int i = 1; i <x+1 ; i++) {
            if(x%i==0&&y%i==0){
                hcf =i;
            }
        }
        System.out.println("HCF of "+x+" and "+ y+ " is "+hcf);
    }
}
