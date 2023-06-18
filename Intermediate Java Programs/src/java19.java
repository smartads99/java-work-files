import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
        //LCM Of Two Numbers
        /*
        num1 = 12
num2 = 14
for i in range(max(num1, num2), 1 + (num1 * num2)):
    if i % num1 == i % num2 == 0:
        lcm = i
        break
print("LCM of", num1, "and", num2, "is", lcm)
         */
        System.out.println("LCM Of Two Numbers");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x= in.nextInt();
        System.out.print("Enter the number : ");
        int y= in.nextInt();
        int max;
        int lcm = 0;
        if(x<y) {
            max=y;
        }else {
            max=x;
        }
        for (int i = max; i <(x*y+1) ; i++) {
          if (i%x==0 &&i%y==0){
              lcm=i;
              break;
          }
        }
        System.out.println("LCM of "+x+" and "+y+" is "+lcm);
    }
}
