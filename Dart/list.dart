// void main() {
//   var Fruits = new List.filled(5, "ABC", growable: true);
//   Fruits.add("Apple");
//   print(Fruits);
//   print(Fruits.runtimeType);
//   List<int> number = new List.empty(growable: true);
//   number.add(1);
//   number.add(60);
//   print(number);
//   print(number.runtimeType);
//   List<int> a = new List.filled(5, 5, growable: false);
//   print(a);
// }
void main() {
  List<int> list = [1, 2, 3, 4, 5];
  List fruits = new List.filled(5, "Fruit", growable: true);
  fruits.add(1);
  print(fruits);
  fruits[0] = "apple";
  print(fruits);
  fruits.remove(1);
  print("1 removed : $fruits");
  print("the length of the list is ");
  print(list.length);
  print(list.reversed);
  list.replaceRange(0, 1, [8, 9]);
  print(list);
}
