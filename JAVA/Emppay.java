import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp("Anu", 23, "Female", 12000);
        e.calculateSalary();
        e.printValues();
    }
}

