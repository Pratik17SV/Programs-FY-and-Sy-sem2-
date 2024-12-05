import java.util.Scanner;

public class sot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numner of element:");
        int n = sc.nextInt();
        int k,i,j,temp;
        int arr[] = new int[n];
        System.out.print("Enter the Nmubers:");
        for(int a=0;a<=(n-1);a++)
        {
            arr [a]= sc.nextInt();
        }
        for(i=0;i<(n-1);i++)
        {
            for(j=0;j<(n-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(k=0;k<=n;k++)
        {
            System.out.print(arr[k]+" ");
        }    
      sc.close();
    }
}
