package employee;

import java.util.Scanner;

public class Bintodec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number to Binary:");
        int dec = sc.nextInt();
        System.out.print("Enter the Binery number to Decimal:");
        int bin = sc.nextInt();
        String sum1 = dectobin(dec);
        int sum2 = bintodec(bin);
        System.out.println("The Binary convercion of "+dec+" is :"+sum1);
        System.out.println("The Decimal convercion of "+bin+" is :"+sum2);
        sc.close();
    }
    public static String dectobin(int dec){
        return Integer.toBinaryString(dec);
    }
    public static  int bintodec(int bin){
        return Integer.parseInt(Integer.toString(bin), 2);
    }
}
