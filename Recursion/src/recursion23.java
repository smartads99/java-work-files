public class recursion23 {
    public static void main(String[] args) {
        System.out.println(recusiontry(7));
    }
    static int recusiontry(int n){
        if(n<2){
            return n;
        }
        return recusiontry(n - 1)+recusiontry(n-2);
    }
}
