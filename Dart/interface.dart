class Sports{
  void scheduleMySports(){
	print("This method is about Sports Schedule");
  }
}
 
class Music{
  void selectMusic(){
	print("This is about Music selection");
  }
}
class Student implements Sports, Music{
  void scheduleMySports(){
	print("I have chosen my Sports category");
  }
  void selectMusic(){
	print("I have made my Music Selection");
  }
}
void main(){
  Student s1 = new Student();
  s1.scheduleMySports();
  s1.selectMusic();
}
