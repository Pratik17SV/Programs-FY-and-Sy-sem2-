public class pascal 
{
    public static void main(String[] args)
    {
      int outerValue, innerValue, spaces, num;
      for(outerValue=0; outerValue<5; outerValue++)     //Used to print the outer values
        {
          for(spaces=5; spaces>outerValue; spaces--)
            {
              System.out.print(" ");        //Used to print spaces before outer values
            }
          num = 1;
          for(innerValue=0; innerValue<=outerValue; innerValue++)
            {
              System.out.print(num + " ");      //Used to print inner values
              num = (num * (outerValue-innerValue)/(innerValue+1));     //Used to increment inner values
            }
          System.out.print("\n");   //Used for next line
        }
    }
}
