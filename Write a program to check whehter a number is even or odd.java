import java.util.Scanner; // declaring Scanner class which allows user to input value
public class NewMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  // initialization for Scanner class
        
        
         System.out.println("Enter the number");  // asking user to enter a number to determine the if the numebr is even or odd
         
        double num = sc.nextDouble(); // declaring and initializing the double value
        
        if(num%2==0){  // if the number that user enter has no remainder
            System.out.println("The number is even");  // print even number
    
        }
        
        else{  // if the number that user enter has remainder
             System.out.println("The number is odd");  // print odd number 
        }
        
    }
}
