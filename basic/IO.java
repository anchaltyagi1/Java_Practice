import java.util.Scanner;
public class IO {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        char ch=str.charAt(0);
       
        if(ch>='A'&&ch<='Z')
        System.out.println( "1");
        else if(ch>='a'&&ch<='z')
        System.out.println("0");
        else
        System.out.println("-1");
         sc.close();
            }
}
