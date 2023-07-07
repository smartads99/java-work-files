public class testcase {
    public static void main(String[] args) {
        int n=1534236469;
        System.out.println(reverse(n));
    }
    public static int reverse(int x) {
        boolean s=false;
        if(x <= 2147483647 && x >= -2147483648){
            s=true;
        }
        if(s==true){
            int res=0;
            while(x!=0){
                int rem=x%10;
                res=(res*10)+rem;
                x=x/10;
            }
            return res;
        }
        return 0;
    }
}
