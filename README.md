# Primes

Implements the Sieve of Eratosthenes to calculate prime numbers from zero to a given value.

Created by Lauren Kwa

Language used: Java

Description:

Created a class called "Primes".

The class contains a boolean ArrayList which will store a "true" if the index is a prime number.

In its constructor, Primes accepts an integer representing the upperbound limit as a parameter. This upperbound will determine the length of the arraylist.

The class has the following methods:
  1. "calculatePrimes" - will fill the ArrayList with boolean values through a loop.
  2. "isPrime" - will determine whether a number is a prime number or not; returns a boolean value
  3. "printPrimes" - will print out the prime numbers in the ArrayList
  
  
Notes:

  1. 0 and 1 are not considered prime numbers.
  
  2. The Sieve of Erathosthenes is used in the loop to calculate primes. This method will only check for primes 
  until the square root of the upper bound limit. For every prime number found, the loop will set the multiples of that 
  number as "false" because they are not prime.
  
  Example: "2" is a prime. It's multiples will automatically not be prime (4, 6, 8 ...)
 
 
 
  
  
  







