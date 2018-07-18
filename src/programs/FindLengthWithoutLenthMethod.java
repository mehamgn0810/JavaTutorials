package programs;

import java.util.Scanner;

public class FindLengthWithoutLenthMethod{

    public static void main(String []args){
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String to find Length: ");
       String input = sc.nextLine();
       
       sc.close();
       
       int length = input.lastIndexOf("");
       System.out.println(length);
    }
}
