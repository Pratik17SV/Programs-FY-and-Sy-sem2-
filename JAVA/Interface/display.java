package Interface;
interface FirstInterface
{
  public void method1();
}


interface SecondInterface
{
  public void method2();
}


class demo implements FirstInterface, SecondInterface
{
  public void method1()
  {
    System.out.println("Method 1");
  }
  public void method2()
  {
    System.out.println("Method 2");
  }
}


public class display
{
  public static void main(String[] args)
  {
    demo d = new demo();
    d.method1();
    d.method2();
  }
}

