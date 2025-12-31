# 005-Fundamentals-PrimeNumberChecker-Generator

## Prime Number Checker & Generator

A simple Java console application that allows users to either:

1. Check if a given number is prime (and show divisors if it's not).
2. Generate and list all prime numbers within a specified range (inclusive).

## Features

- Interactive menu-driven interface
- Checks primality by testing divisors up to the square root of the number
- For non-prime numbers, displays the divisors found
- Generates all prime numbers between a user-defined lower and upper bound
- Basic input validation with error handling

## How to Run

### Requirements
- Java JDK 8 or higher
- Any IDE or command line

### Steps

1. Compile the program:
   ```bash
   javac com/mycompany/primenumberchecker/generator/PrimeNumberCheckerGenerator.java
   ```

2. Run the program:
   ```bash
   java com.mycompany.primenumberchecker.generator.PrimeNumberCheckerGenerator
   ```

### Usage Example

```
Enter 1 to check if a number is prime
Enter 2 to generate a prime number
A: 1

Welcome to Prime Number Checker!
Enter the number to check if it is prime:
A: 17

The number: 17 is prime
```

Or for generation:
```
A: 2
Enter the lower Bound(Inclusive)- A: 10
Enter the upper Bound(Inclusive)- A: 30

Number 11 is prime
Number 13 is prime
Number 17 is prime
Number 19 is prime
Number 23 is prime
Number 29 is prime
```



Simple, educational tool for learning about prime numbers in Java!