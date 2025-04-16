class Laptop {
  String brand = "Unknown";
  int price = 0;

  // Default Constructor
  Laptop(this.brand, this.price) {
    this.brand = brand;
    this.price = price;
  }
  Laptop.noparameter() {
    print("Default Constructor: Brand is $brand, Price is $price");
  }
  // Parameterized Constructor
  Laptop.withDetails(this.brand, this.price) {
    print("Parameterized Constructor: Brand is $brand, Price is $price");
  }

  // Named Constructor
  Laptop.named(String b) {
    brand = b;
    print("Named Constructor: Brand is $brand");
  }
}

void main() {
  Laptop l1 = Laptop.noparameter(); // Calls default constructor
  Laptop l2 = Laptop.withDetails("HP", 50000); // Calls parameterized constructor
  Laptop l3 = Laptop.named("Dell"); // Calls named constructor
}
