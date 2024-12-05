public class Arrayadd {
    public static void main(String[] args) {
        int arr1[][] = {{2,2,2},{2,2,2},{2,2,2}};
        int arr2[][] = {{2,2,2},{2,2,2},{2,2,2}};
        int sum[][] = new int[3][3];
        for(int i=0;i<=2;i++){
            for (int j=0;j<=2;j++){
            sum[i][j]= arr1[i][j]+ arr2[i][j];
            
            }
        }
        for(int n =0;n<=2;n++){
            for(int m=0;m<=2;m++){
                System.out.print(sum[n][m]+" ");
            }
            System.out.println();
        }
    }
}
