class Calculation
{
    int z;
    public void addition (int x, int y)
    {
        z = x + y;
        System.out.println("The sum of the given number: "+z);
    }
    public void subtraction(int x, int y)
    {
        z = x - y;
        System.out.println("The difference of the given number: "+z);
    }
}
class My_Calculation extends Calculation
{
    public void multiplication (int x, int y)
    {
        z = x * y;
        System.out.println("The product of the given number: "+z);
    }
    public static void main (String args[])
    {
        int a = 12, b = 6;
        My_Calculation demo = new My_Calculation();
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);
    }
}

