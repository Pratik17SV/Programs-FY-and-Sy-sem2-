fact(number) {
  if (number <= 0) {
    return 1;
  } else {
    return number * (fact(number - 1));
  }
}

void main() {
  print(fact(5));
}
