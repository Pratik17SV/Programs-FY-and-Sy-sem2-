class Mathematics{
  int _num = 0;
  int _den = 0;
  // Customized Setter Function 
  void set setnumerator(int val){
    _num = val * 6;
  }
  void set setdenometer(int val){
    _den = val * 10;
  }
  // Customized getter
  int get getnumerator {
    return _num;
  }
  int get getdenometer{
    return _den;
  }
}
void main(){
  Mathematics m = new Mathematics();
  m.setnumerator = 5;
  m.setdenometer = 6;
  print(m.getnumerator);
  print(m.getdenometer);
}


