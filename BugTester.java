/*
* Programmer --> Akhil Devarapalli
* 10/7/2020
* On my honor I have neither given or recived unauthorized help
*/
import java.util.Scanner;
public class BugTester
{
   public static void main(String [] args)
   {
   //Get input to pass into a new bug class
      int StartPos;
      int StartDirection;
      System.out.println("Input a starting postion from -100 to 100 and -1 for it start facing left and 1 for it to start facing right");
      Scanner scan = new Scanner(System.in);
      StartPos = scan.nextInt();
      StartDirection = scan.nextInt();
      Bug ladyBug = new Bug(StartPos, StartDirection);
      // We are going to verify if the input that we passed into ladyBug works correctly
      //Write the code here
    /*
    * Make the bug move one return value
    * Turn it around and move one and return value
    * Call moveOne 3 times and return values
    * Call TurnAround and call moveOne again
    * Have it return value
    * The code below makes sure the moveOne, TurnAround, GetPosition, GetDirection works. They do
    */
    
      ladyBug.moveOne();
      System.out.println(ladyBug.GetPosition());
      ladyBug.TurnAround();
      for (int i = 0; i <= 3; i++){
         ladyBug.moveOne();
      }
      System.out.println(ladyBug.GetPosition());
      ladyBug.TurnAround();
      ladyBug.moveOne();
      System.out.println("The Position is " + ladyBug.GetPosition() + " The Direction is " + ladyBug.GetDirection());
    /*
    * Uses the same lady bug class but this one makes sure that the SetPostion mutator method works
    * We will start on ladyBugs last poistion and try to move it to 50 and print position.
    * When we get position it should return 50
    */  
      ladyBug.setPosition(50);
      System.out.println("The Position is " + ladyBug.GetPosition() + " The Direction is " + ladyBug.GetDirection());
    /*
      We are going to do what we did above, but this time we will create a Bug class and not pass in any parameters
      We will create Bug with no values and make it go three units, turn around and go two units 
      We will print direction and postion, the output should be "The postion is 1 the direction is -1"
    */
      Bug ladyBug2 = new Bug();
      for (int i = 0; i <=3; i++)
      {
         ladyBug2.moveOne();
      }
      ladyBug2.TurnAround();
      for(int i = 0; i <= 2; i++)
      {
         ladyBug2.moveOne();
      }
      System.out.println("The Position of bug 2 is " + ladyBug2.GetPosition() + " The Direction of bug 2 is " + ladyBug2.GetDirection());
     /*
      We are going to test SetPostion to 50
      The final output here should be "The Position of bug 2 is 1  The Direction of bug 2 is -1"
     */
      ladyBug2.setPosition(50);
      System.out.println("The Position of bug 2 is " + ladyBug2.GetPosition() + " The Direction of bug 2 is " + ladyBug2.GetDirection());
   }
}