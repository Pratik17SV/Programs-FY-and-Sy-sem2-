public class student {
  int age;
  int m1;
  int m2;
  int m3;

  public void accept(int a, int mark1, int mark2, int mark3) {
      age = a;
      m1 = mark1;
      m2 = mark2;
      m3 = mark3;
  }

  public void display() {
      int total = m1 + m2 + m3;
      double percentage = (total * 100.0) / 300.0;
      System.out.println("Age: " + age);
      System.out.println("Marks in subject 1: " + m1);
      System.out.println("Marks in subject 2: " + m2);
      System.out.println("Marks in subject 3: " + m3);
      System.out.println("Total: " + total);
      System.out.println("Percentage: " + percentage);
  }

  public static void main(String args[]) {
      student stu1 = new student();
      stu1.accept(18, 95, 90, 85);
      stu1.display();
      student stu2 = new student();
      stu2.accept(19, 80, 75, 70);
      stu2.display();
      student stu3 = new student();
      stu3.accept(20, 65, 60, 55);
      stu3.display();
      student stu4 = new student();
      stu4.accept(21, 50, 45, 40);
      stu4.display();
      student stu5 = new student();
      stu5.accept(22, 35, 30, 25);
      stu5.display();
  }
}