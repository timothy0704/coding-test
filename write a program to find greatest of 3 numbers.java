import java.util.Scanner;  // declaring Scanner class which allows user to input value
public class NewMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   // initialization for Scanner class
        
         System.out.println("Enter the three numbers"); // asking user to enter number to see which mumber is the greatest amoung all the numbers
        int num1 = sc.nextInt();  // declasring and initializing the int value
        int num2 = sc.nextInt(); // declasring and initializing the int value
        int num3 = sc.nextInt(); // declasring and initializing the int value
        
        
        if(num1>num2 && num1> num3){  // if statment is used to see if the num1 has the grtest value 
            
            System.out.println("num1 is the greatest number");  // if num1 is gretest print num1 is the greatest number
        }
        
        else if(num2 > num1 && num2 > num3){  // if the 'if' statement is false than it comes to else to see num2 is the gretest value
         System.out.println("num2 is the greatest number"); // if num1 is gretest print num2 is the greatest number
    }
        
        else{  // if both conditionn is false, than it comes to else and print num3 is the greatest
             System.out.println("num3 is the greatest number");// if num1 is gretest print num3 is the greatest number
        }
        
    }
    
}
