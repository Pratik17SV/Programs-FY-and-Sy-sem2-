import java.util.Scanner;

public class equation {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value for a:");
        int a= sc.nextInt();
        System.out.print("Enter the value for b:");
        int b=sc.nextInt();
        System.out.print("Enter the value for c:");
        int c=sc.nextInt();
        double sq;
        double result1,result2;
       sq=Math.sqrt((b*b)-4*a*c);
       result1= (-b+sq)/(2*a);
       result2= (-b-sq)/(2*a);
       System.out.println("The roots are "+result1+" and "+result2);
       sc.close();
    }
}
