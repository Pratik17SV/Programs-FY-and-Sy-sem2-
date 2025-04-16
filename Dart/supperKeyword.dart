void main() {
  MobliePhone m = new MobliePhone('S 23', "Samasung");
}

class Electronic {
  //supper class
  Electronic(String brand) {
    print("This is electronic constructor.");
    print("Brand Recived:" + brand);
  }
}

class MobliePhone extends Electronic {
  //child class
  MobliePhone(String model, String brand) : super(brand) {
    print("this is mobile phone Constructor. Model: $model");
  }
}
