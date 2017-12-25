import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>Implements the Sieve of Eratosthenes to 
 * calculate prime numbers from zero to a given value.</p>
 *
 * @author Lauren Kwa
 * @version 1.0
 */
public class Primes {
    
    /**
     * Contains boolean values to denote whether index number is prime or not.
     */
    private List<Boolean> primes;
    
    /**
     * Represents the user input upper bound number 
     *  to use in calculation of prime values.
     */
    private final int upperBound;
    
    /**
     * 
     * Constructs the object of type Primes.
     * @param bound as integer
     */
    public Primes(int bound) {
        
        primes = new ArrayList<Boolean>();
        
        upperBound = bound; 
        
        for (int i = 0; i <= upperBound; i++) {
            primes.add(i, true);
        }
        
        if (upperBound <= 1) {
            throw new IllegalArgumentException("Please input "
                    + "number greater than 1");
        }
        
        calculatePrimes(upperBound);
    }
    
    /**
     * Calculates prime numbers from 0 to N. 
     * @param bound as integer
     */
    private void calculatePrimes(int bound) {

        primes.set(0, false);
      
        primes.set(1, false);

        for (int j = 2; j <= Math.sqrt(bound); j++) {
            
                if (isPrime(j)) {
                    for (int k = 2; j * k <= bound; k++) {
                        primes.set(j * k, false);
                    }
                }   
        }
        
        
    }
    
    /**
     * Returns true if parameter is a prime number. 
     * @param x an integer
     * @return isPrime as boolean
     */
    public boolean isPrime(int x) {
        boolean isPrime = false;
        
        int i = 2;
        
        if (x == 0 || x == 1) {
            isPrime = false;
        } else if (x == 2) {
            isPrime = true;
        } else if (x > 2) {
            do {
                if (x % i == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }
           
                i++;
            } while (isPrime && i * i <= x);
        
        } else if (x < 0 || x > upperBound) {
            throw new IllegalArgumentException("Please enter number "
                    + "within range [0,upperbound]");
        }
            
            return isPrime;
        
    }
    
    /**
     * Print primes array prime numbers. 
     */
    public void printPrimes() {
       
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
           
        
        }
    }
    
    /**
     * Returns number of prime numbers in primes array. 
     * @return count as integer
     */
    public int countPrimes() {
        int count = 0;
        
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        
        return count;
        
    }
    
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperBound;
        
        System.out.println("Enter upperbound number greater than 1: ");
        upperBound = scan.nextInt();
        
        try {
            Primes primes = new Primes(upperBound);
            
            int primeCount = primes.countPrimes();
            System.out.println("There are " + primeCount + " primes:");
            
            System.out.println("The prime numbers between 0 and " 
                    + upperBound + " are: ");
            primes.printPrimes();
            
           
            
            System.out.println("");
            
        } catch (IllegalArgumentException e) {
            System.out.println("please enter number greater than 1.");
        }
        
       
        System.out.println("Question two was called and ran sucessfully.");
        
        scan.close();
    }

};
