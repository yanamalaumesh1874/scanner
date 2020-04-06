import java.util.Scanner; 
class method1
{
  public static void main(String[] args)	
   {
    int x, y, z;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("enter a value");
    x=myObj.nextInt(); 
    System.out.println("enter b value");
    y=myObj.nextInt(); 
    z=x+y;  
    System.out.println("Sum is"+z); 
  }
} 
