/*
* Programer --> Akhil Devarapalli
* 10/7/2020
* On my honor I have neither given or recived unauthorized help
*/
public class Bug
{
   //instacne variable
   private int position;
   private int direction;
   
   //constructor methods
   public Bug(int Initialposition, int Initialdirection)
   {
      position = Initialposition;
      direction = Initialdirection;
   }
   
   //Defualt values
   public Bug()
   {
      position = 0;
      direction = 1;
   }
   
   //Accessor methods
   public int GetPosition()
   {
      return position;
   }
   
   public int GetDirection()
   {
      return direction;
   }
   
   //mutator methods
   public void setPosition(int newPosition){
      position = newPosition;
   }
   
   public void moveOne()
   {
      /*If statement here to check if we are -100 or 100 and handle things accordingly*/
      if (position == -100 && direction < 0 || position == 100 && direction > 0){
         System.out.println("The bug has no more rope to move on");
      }else
      {
         if(direction > 0){
            position += 1;
         }else
         {
            position -= 1;
         }
      }
   }
   
   public void TurnAround()
   {
      direction *= -1;
   }
}