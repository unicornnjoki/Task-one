import java.util.Scanner;

public class calculator {
    public static void main (String[]args){
        
    char operator;
    Double number1,number2,result;
    
    // create an object of scanner class 
    Scanner input=new
   Scanner(System.in);
    
    //ask users to enter operator
    System.out.println("Choose an operator:=,-,* or /");
     operator=input.next().charAt(0);
     
     //ask users to enter numbers
     System.out.println("Enter first number");
     number1=input.nextDouble();
     
     System.out.println("Enter second number");
      number2=input.nextDouble();
      
      switch(operator){
          
      }
     //performs addition between numbers
     case '+' :
     results=number1 + number2;
     System.out.println(number1 +"+"+ number2 + "="+ results);
     break;
     
       //performs subtraction between numbers
     case '-':
     results=number1 - number2;
     System.out.println(number1 +"-"+ number2 + "="+ results);
     break;
     
       //performs multiplication between numbers
     case '*':
     results=number1 * number2;
     System.out.println(number1 +"*"+ number2 + "="+ results);
     break;
     
       //performs division between numbers
     case '/':
     results=number1 / number2;
     System.out.println(number1 +"/"+ number2 + "="+ results);
     break;
     
     default:
     System.OutOfMemoryError.println("Invalid operator!");
     break;
    }
     input.close();
}

