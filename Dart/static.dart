class student {
  static int count = 0;
  static increment() {
    print(count);
    count++;
    print("After Incremant: $count");
  }
}

void main() {
  student.increment();
}
