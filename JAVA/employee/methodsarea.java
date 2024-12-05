package employee;

public class methodsarea {
    public int area(int s){
        int result = s*s;
        return result;
    }
    public int area(int l, int b){
        int result = l*b;
        return result; 
    }
    public static void main(String[] args) {
        methodsarea c = new methodsarea();
        int result1 = c.area(5);
        System.out.println("the area of square is "+result1);
        int result = c.area(8,6);
        System.out.println("the area of Rectangle is "+result);
    }
}
