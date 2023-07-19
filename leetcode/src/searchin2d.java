public class searchin2d {
    public static void main(String[] args) {
        int [][]arr={
                {1,3}
        };
        System.out.println(searchMatrix(arr,3));
        System.out.println(arr[1].length);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if(matrix[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
