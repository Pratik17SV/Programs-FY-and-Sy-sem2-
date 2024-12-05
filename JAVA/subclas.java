class superclass
{
  int age;
  superclass(int age)
  {
    this.age = age;
  }
  public void getage()
  {
    System.out.println("The value of variable named age in super class is " +age);
  }
}
public class subclas extends superclass
{
  subclas(int age)
  {
    super(age);
  }
  public static void main (String args[])
  {
    subclas s = new subclas(24);
    s.getage();
  }
}

