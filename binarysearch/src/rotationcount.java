public class rotationcount {
    public static void main(String[] args) {
        int [][] mat={
                {2,3,4},
                {2,3,5},
                {22,33,44}
        };
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat.length; j++) {
                System.out.print(","+mat[i][j]);
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
