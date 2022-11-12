import java.util.*;

public class names {

    public static void main(String[]args) {
 
    try(Scanner s = new Scanner (System.in)){
  System.out.println("Enter your surname:");
  String st=s.nextline();

System.out.println("Enter your age:");
  int age=s.nextline();
  
  int age = s.nextInt();
  if(age%2!=0)
  System.out.println(age+"is an odd number");
          
  System.out.println("Name:"+st);
  System.out.println("Age:"+age);       
  
    }
    }

