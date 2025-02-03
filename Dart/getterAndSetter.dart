class Mathematics{
  int num = 0;
  int den = 0;
  // Customized Setter Function 
  void set setnumerator(int val){
    num = val * 6;
  }
  void set setdenometer(int val){
    den = val * 10;
  }
  // Customized getter
  int get getnumerator {
    return num;
  }
  int get getdenometer{
    return den;
  }
}
void main(){
  Mathematics m = new Mathematics();
  m.setnumerator = 5;
  m.setdenometer = 6;
  print(m.getnumerator);
  print(m.getdenometer);
}


