public class Number_of_Good_Pairs {
    //1512. Number of Good Pairs
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans++;
                }
                }
            }
        System.out.println(ans);
        }


        public int numIdenticalPairs(int[] nums) {
            int counter = 0;

            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        counter++;
                    }
                }
            }
            return counter;
        }
    }


