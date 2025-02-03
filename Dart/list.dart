void main(){
    var Fruits = new List.filled(5,"ABC",growable:true);
    Fruits.add("Apple");
    print(Fruits);
    print(Fruits.runtimeType);
}