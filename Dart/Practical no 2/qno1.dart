//Create a dart program to demonstrate hybrid inheritance between the classes of Student,
//BCAStudent, CommerceStudent, InternshipCandidate under both the streams.
//Student: name, roll no, institute name (static variable).
//Display fee information, the payment status and function to make payment.
//Subject selection method in BCA and Commerce.
//IntershipCandidate: Company, duration, stipend.

class Student {
  static String instituteName = "S.K Somaiya";
  String name;
  int rollNo;
  Student(this.name, this.rollNo);
  void displayFeeInfo() {
    print("Fee info for $name (Rollno: $rollNo) at $instituteName");
  }

  void paymentStatus() {
    print("Payment status for $name: Pending");
  }

  void makePayment() {
    print("Payment made for $name.");
  }
}

class BCAStudent extends Student {
  BCAStudent(String name, int rollNo) : super(name, rollNo);
  void selectSubjects() {
    print("$name has selected BCA subjects.");
  }
}

class CommerceStudent extends Student {
  CommerceStudent(String name, int rollNo) : super(name, rollNo);
  void selectSubjects() {
    print("$name has selected Commerce subjects.");
  }
}

mixin InternshipCandidate {
  String company = "";
  String duration = "";
  double stipend = 0.0;
  void displayInternshipDetails() {
    print(
        "Internship at $company for $duration with stipend of  Rs:\${stipend}");
  }
}

class BCAInternshipCandidate extends BCAStudent with InternshipCandidate {
  BCAInternshipCandidate(
      String name, int rollNo, String company, String duration, double stipend)
      : super(name, rollNo) {
    this.company = company;
    this.duration = duration;
    this.stipend = stipend;
  }
}

class CommerceInternshipCandidate extends CommerceStudent
    with InternshipCandidate {
  CommerceInternshipCandidate(
      String name, int rollNo, String company, String duration, double stipend)
      : super(name, rollNo) {
    this.company = company;
    this.duration = duration;
    this.stipend = stipend;
  }
}

void main() {
  BCAInternshipCandidate bcaIntern =
      BCAInternshipCandidate("Pratik", 019, "Tesla", "10 months", 19000);
  bcaIntern.displayFeeInfo();
  bcaIntern.paymentStatus();
  bcaIntern.makePayment();
  bcaIntern.selectSubjects();
  bcaIntern.displayInternshipDetails();
  print("=========================");
  CommerceInternshipCandidate commerceIntern =
      CommerceInternshipCandidate("Vinayak", 011, "Google", "10 months", 25000);
  commerceIntern.displayFeeInfo();
  commerceIntern.paymentStatus();
  commerceIntern.makePayment();
  commerceIntern.selectSubjects();
  commerceIntern.displayInternshipDetails();
}
