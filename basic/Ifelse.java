import java.util.Scanner;
public class Ifelse {

public static void main(String[] args) {
    System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b= sc.nextInt();
        System.out.println(compareIfElse(a, b));  
        sc.close();


}
  
        public static String compareIfElse(int a, int b) 
        {
            // Write your code here
         
            if(a>b)
                return "greater";
               
            else if(a<b)
            return "smaller";
            
            else 
           return "equal";
            
           
        }
     
    }
    

