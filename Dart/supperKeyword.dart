void main(){
  MobliePhone m = new MobliePhone('S 23',"Samasung");
}
class Electronic{//supper class
  Electronic(String brand){
    print("This is electronic constructor.");
  }

  double height = 56;
  double width = 56;
  double thickness = 56;
}
class MobliePhone extends Electronic{//child class
  MobliePhone(String model,String brand):super(brand){
  print("this is mobile phone Constructor. Model:$brand $model");
  }
}