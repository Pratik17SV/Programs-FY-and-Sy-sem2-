void main() {
  Map n = new Map();
  n = {8: 10, 9: 15, 10: 20};
  Map a = n;
  int sum = 0;
  for (int i in n.keys) {
    sum += i;
  }
  print("the sum of the keys is $sum");
  print(n.values);
  print(a);
  a.addAll({"hello": sum});
  print(a);
  a.remove("hello");
  print(a);
  a.clear();
  print("removed all pair: $a");
  print("the length of the map is ${a.length}");
}
