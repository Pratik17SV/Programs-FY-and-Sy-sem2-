class Mathematics {
  int num1 = 0;
  int num2 = 0;
  // Customized Setter Function

  // Customized getter
  int get getnum1 {
    return num1;
  }

  int get getnum2 {
    return num2;
  }

  void set setnum1(int val) {
    num1 = val * val;
  }

  void set setnum2(int val) {
    num2 = val * val;
  }
}

void main() {
  Mathematics m = new Mathematics();
  m.setnum1 = 5;
  m.setnum2 = 6;
  print(m.getnum1);
  print(m.getnum2);
}
