//Q2. Create a dart program to play the game of rock paper scissors between two players.
 
String getAwinner(String p1,String p2)
{
  if(p1==p2)
  {
    return "Its a tia";
  }else if((p1 == 'rock' && p2 == 'scissors') || (p1 == 'scissors' && p2 == 'paper') |(p1 == 'paper' && p2 == 'rock'))
  {
    return "Player 1 Winner";
  }
  else
  {
    return "Player 2 Winner";
  }
}
void main()
{
  String Player1 = "scissors";
  String Player2 = "scissors";
  print(getAwinner(Player1, Player2));

}