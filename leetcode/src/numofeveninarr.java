public class numofeveninarr {
    public static void main(String[] args) {
        int []arr={22,345,4556,666,7,78};
        System.out.println(digit(4556));
        System.out.println(even(122));
        System.out.println(findeven(arr));

    }

    static int findeven(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i]){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int number=digit(num);
        return number % 2 == 0;
    }
    static int digit(int arr){
        if(arr<0){
            arr=arr*-1;
        }
        if(arr==0){
            return 1;
        }
        int count=0;
        while(arr>0){
            count++;
            arr=arr/10;
        }
      return count;
    }
}


