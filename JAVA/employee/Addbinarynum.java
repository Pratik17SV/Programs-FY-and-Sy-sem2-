package employee;

import java.util.Scanner;

public class Addbinarynum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First Binary Number:");
        String binary1 = sc.nextLine();
        System.out.print("Enter the second binary number:");
        String binary2= sc.nextLine();
        sc.close();
        String sum = addbin(binary1,binary2);
        System.out.println("The sum of two binary number is:"+sum);
    }
    public static String addbin(String binary1,String binary2){
        int num1 = Integer.parseInt(binary1,2);
        int num2 = Integer.parseInt(binary2,2);
        int sum = num1+num2;
        return Integer.toBinaryString(sum);
    }
}
