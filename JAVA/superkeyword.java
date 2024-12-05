public class superkeyword extends Hero{
   public static void main(String[]args){
    Hero hero = new Hero("IronMan",18,"IronSute");
   }
}
public class Hero extends person{
   String Power;
   public Hero(String name,int age,String Power){
      super(name,age);
      this.Power=Power;
   }
}
public class person{
   String name;
   int age;
   public person(String name, int age){
      this.name = name;
      this.age= age;
   }
}