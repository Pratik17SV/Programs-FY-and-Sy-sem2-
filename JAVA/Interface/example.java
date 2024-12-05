package Interface;

interface A
{
    void method1();
    void method2();
}
interface B extends A
{
    void method3();
}
public class example implements B
{
    public void method1()
    {
        System.out.println("Method 1");
    }
    public void method2()
    {
        System.out.println("Method 2");
    }
    public void method3()
    {
        System.out.println("Method 3");
    }
    public static void main (String args[])
    {
        example e = new example();
        e.method1();
        e.method2();
        e.method3();
    }
}

