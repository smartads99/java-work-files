public class pattern {
    public static void main(String[] args) {
//     p1(4);
//     System.out.println();
//     p2(5);
//     p3(4);
//     p4(5);
       patter13(5);


    }
    static void patter13(int n) {
        for (int row = 1; row < n; row++) {
            int spa = n - row;
            for (int i = 0; i < spa; i++) {
                System.out.print(" ");
            }
            for (int col =row; col <= row; col++) {
                System.out.print("*");
                    }
            for (int i = 1; i <row*2-1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
                }
        for (int i = 0; i < n*2-1; i++) {
            System.out.print("*");
        }
    }

            static void patter12 ( int n){
                for (int row = 0; row < n; row++) {
                    int spa = row;
                    for (int j = 0; j <= spa; j++) {
                        System.out.print(" ");
                    }
                    for (int col = row; col < n; col++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                for (int row = 0; row < n; row++) {
                    int spa = n - row - 1;
                    for (int j = 0; j <= spa; j++) {
                        System.out.print(" ");
                    }
                    for (int col = 0; col <= row; col++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
    static void patter11(int n){
        for (int row = 0; row <n; row++) {
            int spa=row;
            for (int j = 0; j <=spa; j++) {
                System.out.print(" ");
            }
            for (int col = row; col <n; col++) {
                System.out.print("*"+" ");
            }
//            for (int i = 0; i <row; i++) {
//                System.out.print("*");
//            }
            System.out.println();
        }
    }
    static void patter10(int n){
        for (int row = 0; row <n; row++) {
            int spa=n-row;
            for (int j = 0; j <=spa; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row; col++) {
                System.out.print("*"+" ");
            }
//            for (int i = 0; i <row; i++) {
//                System.out.print("*");
//            }
            System.out.println();
        }
    }
    static void patter9(int n){
        for (int row = 0; row <n; row++) {
            int spa=row-1;
            for (int j = 0; j <=spa; j++) {
                System.out.print(" ");
            }
            for (int col = row; col <n; col++) {
                System.out.print("*");
            }
            for (int i = 0; i <n-row-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patter8(int n){
        for (int row = 0; row <n; row++) {
            int spa=n-row;
            for (int j = 0; j <=spa; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row; col++) {
                System.out.print("*");
            }
            for (int i = 0; i <row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patter7(int n){
        for (int row = 0; row < n; row++) {
            int spa=row-1;
            for (int j = 0; j <=spa; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <n-row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patter6(int n){
        for (int i = 1; i <= n; i++) {
            int spa=n-i;
            for (int j = 0; j < spa; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patter2(int n){
        for (int i = 1; i <= n; i++) {
            int spa=n-i;
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 static void patter4(int n){
     for (int i = 1; i <= n; i++) {
         for (int j = 1; j <=i ; j++) {
             System.out.print(" "+j);
         }
         System.out.println();
     }
 }







    static void p5(int n){
        for (int row = 0; row <=n*2-1; row++) {
            int run;
            if(row>n){
                run=2*n-row;
            }else{
                run=row;
            }
            for (int col = 0; col<=run-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p4(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col=1; col<=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void p3(int n){
        for (int row = 0; row < n ; row++) {
            for (int col=0; col<n-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
