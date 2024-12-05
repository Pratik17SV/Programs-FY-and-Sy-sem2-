package Interface;

class animal
{
}
class mammal extends animal
{
}
class reptile extends animal
{
}
public class dog extends mammal
{
  public static void main(String args[])
  {
    animal a = new animal();
    mammal m = new mammal();
    dog d = new dog();
    System.out.println(m instanceof animal);
    System.out.println(d instanceof mammal);
    System.out.println(d instanceof animal);
  }
}
