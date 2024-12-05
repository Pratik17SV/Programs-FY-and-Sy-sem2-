import java.util.Scanner;

public class Arrey9 {
     public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);
         int a[]=new int[3];
         String b[]=new String[3];   
         int count[]=new int[3];
         int c[]=new int[3];
        for(int k=0;k<3;k++)  
        {
            
            b[k]=scanner.next();
           
            a[k] =scanner.nextInt();
        } 
        for(int i=0;i<=3;i++)
        { 
            c[i]=a[i];
            if(c[i]!=0)
            { 
        while(c[i]!=0)
        {
            c[i]=c[i]/10;
            count[i]++;
        }
        break;
           }
        }
        System.out.println("================================");
        for(int j=0;j<3;j++)
        {
            if(count[j]==3)
            {
             System.out.println(b[j]+"\t\t"+a[j]);
            }
            else
            {
                System.out.println(b[j]+"\t\t0"+a[j]);  
            }
        }
        System.out.println("================================");
        scanner.close();
    }
    
}