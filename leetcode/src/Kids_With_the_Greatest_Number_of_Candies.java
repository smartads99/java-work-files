import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    //1431. Kids With the Greatest Number of Candies
    public static void main(String[] args) {
        int  []candies={2,3,5,1,3};
        int n=3;


    }
    public static List<boolean> kids(int []candies,int n){
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int i=1;i< candies.length;i++)
            if(candies[i] > max)
                max = candies[i];

        for(int i:candies) {
            if(n >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
