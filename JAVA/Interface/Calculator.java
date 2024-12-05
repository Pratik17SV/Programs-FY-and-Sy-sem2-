package Interface;

import java.util.Scanner;

interface calcy{
    public void multiple(int a,int b);
    public void Division(int a,int b);
    public void add(int a,int b);
    public void subtract(int a,int b);
}

class buton implements calcy{
    public void Division(int a,int b) {
        int result = a/b;
        System.out.println("The square is :"+result);
    } 
    public void multiple(int a,int b){
        int result= a*b;
        System.out.println("The multiple is :"+result);
    }
    public void add(int a,int b){
        int result = a+b;
        System.out.println("The sum is :"+result);
    }
    public void subtract(int a,int b){
        int result = a-b;
        System.out.println("The subtraction is :"+result);
    }
}
class Calculator{
    public static void main(String[] args) {
        buton c = new buton();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x = sc.nextInt();
        System.out.print("Enter the Number:");
        int y = sc.nextInt();
        c.Division(x,y);
        c.multiple(x, y);
        c.add(x, y);
        c.subtract(x, y);
        sc.close();
    }
}