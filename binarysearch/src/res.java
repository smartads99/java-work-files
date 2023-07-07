public class res {
    public static void main(String[] args) {
        int x=123;
        System.out.println(reverse(x));
        int num=1122;
        int check=num;
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=(res*10)+rem;
            num=num/10;
        }
        System.out.println(res);
        if (check==res){
            System.out.println(check +" is Palindrome");
        }else {
            System.out.println(check + " is not a Palindrome");
        }


    }
    static int reverse(int x) {
        int ans=0;
        while(x!=0){
            int res=x%10;
            ans=(res*10)+ans;
            x=x/10;
        }
        return ans;
    }
}
