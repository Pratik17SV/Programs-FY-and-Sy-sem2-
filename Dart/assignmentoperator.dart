void main() {
  int a = 10; // Assignment
  int? b;
  b ??= 20; // Null-aware assignment
  a ??= 5;
  print(a); // 10
  print(b); // 20
}
