import java.util.Scanner;

public class divisibility
{
    public static void (String[]args)
    {
    int num,div;
    Scanner s = new Scanner(System.in)
     
    System.out.println("Enter numerator");
    num=s.nextInt();
    System.out.println("Enter denominator");
    div =s.nextInt();
    
    if(num%div==0)
        System.out.println("/n"+num+"is divisible by "+ div);
    else
        System.out.println("/n"+num+"is not divisible by "+ div);
}
}