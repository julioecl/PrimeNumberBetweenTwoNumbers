package primenumbersbetweentwonumbers;
import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {

    public static void main(String[] args) {        
        getPrimeNumbers();        
    }
    
    public static void getPrimeNumbers(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positives number in ascending order: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int count = 0;
        
        for (int i = number1; i<= number2 ; i++){                       
            if (isPrime(i)) {
                count += 1;
                System.out.print(i + " ");                
            }
        }
        System.out.println();
        System.out.println("The total count of prime numbers between " 
                + number1 + 
                " and " 
                + number2 +
                " is " 
                + count + 
                ".");
    }
    
    public static boolean isPrime(int number){
        
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}