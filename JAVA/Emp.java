
public class Emp {
    String name;
    int empid;
    String category;
    int bpay;
    int hra;
    int da;
    int npay;
    int pf;
    int grossPay;
    int incomeTax;
    int allowance;

    public Emp(String name, int empid, String category, int bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
    }

    public void calculateSalary() {
        hra = 0;
        da = 0;
        npay = 0;
        pf = 0;
        grossPay = 0;
        incomeTax = 0;
        allowance = 0;
    }

    public void printValues() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Cateory: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + npay);
        System.out.println("PF: " + pf);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Allowance: " + allowance);
    }
}
