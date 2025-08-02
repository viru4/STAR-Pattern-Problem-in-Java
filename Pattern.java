

public class Pattern {
    public static void pattern1(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i =1; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        
        for (int i =1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
           // for (int j = 1; j <= n-i; j++) {
                //System.out.print(" ");
            //}
            System.out.print("*".repeat(i));
            //for (int j = 1; j <=i; j++) {
               // System.out.print("*");
            //}

            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int i =0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int i =1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
           // for (int j = 1; j <= n-i; j++) {
                //System.out.print(" ");
            //}
            System.out.print("* ".repeat(i));
            //for (int j = 1; j <=i; j++) {
               // System.out.print("*");
            //}

            System.out.println();
        }
    }
    public static void pattern6(int n){
        for (int i =0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1||j==n||i==j||j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else System.out.print(" ");
                
            }
            
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for (int i =0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for (int i =0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i==0||i==n-1||j==0||j==n-1) {
                System.out.print("*");
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for (int i =0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (i==n-1||j==0||j==i) {
                System.out.print("*");
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for (int i =1; i <= n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if (i==n||j==1||j==i) {
                System.out.print("*");
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    public static void pattern13(int n){
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                if (i==1||j==n||j==i) {
                System.out.print("*");
                }
                else System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if (i==n||j==1||j==2*i-1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for (int i =1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*n-(2*i-1); j++) {
                if(i==1||j==1||j==2*n-(2*i-1)) 
                System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        //method 1 bt dividing the pattern upper and lower half
        //upper half
        // for (int i =1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //for lower half
        // for (int i =1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //method 2
        int columns=1;
        for (int i =1; i < 2*n; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
                }
            if (i<n) {
                columns++;      
            } 
            else {
                columns--;
            }
            
            System.out.println();
        }
    }
    public static void pattern18(int n) {
        int stars=1;
        int spaces=n-1;
        for (int i =1; i < 2*n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
                }
            for (int j = 1; j < 2*stars; j++) {
                System.out.print("*");
            }
            if (i<n) {
                stars++;
                spaces--;      
            } 
            else {
                stars--;
                spaces++;
            }
            
            System.out.println();
        }
    }
    public static void pattern19(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j <= 2*i-2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j = 1; j <= 2*n-2*i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern21(int n){
        for (int i = 1; i <2*n; i++) {
            for(int j=1; j<2*n;j++){
                if (i==2*n/2||j==2*n/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for (int i = 1; i <2*n; i++) {
            for(int j=1; j<2*n;j++){
                if (j==i||j==2*n-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern23(int n){
        for (int i = 1; i <2*n; i++) {
            for(int j=1; j<=n;j++){
                if ((i==1&&(j==1||j==n))||
                (i==n&&(j==1||j==n))||
                (i==2*n-1&&(j==1||j==n))) {
                    System.err.print(" ");
                }
                else if (i==1||i==2*n-1||i==n||j==1||j==n) {
                    System.out.print("*");
                }
                else System.out.print(" ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern23(5);
    }
}