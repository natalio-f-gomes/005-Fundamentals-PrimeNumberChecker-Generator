/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumberchecker.generator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author natalio.f.gomes
 */
public class PrimeNumberCheckerGenerator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to check if  anumber is prime");
        System.out.println("Enter 2 to generate a prime number");
        System.out.print("A: ");
        int userChoice = scanner.nextInt();
        switch(userChoice){
            case 1: primeChecker(scanner);break;
            case 2: generatePrimeNumber(scanner);break;
            default: System.out.println("Invalid choice");break;
        }

    }
    
    public static void primeChecker(Scanner scanner){
        System.out.println("Welcome to Prime Number Checker!");
        int userInput = getUserInput(scanner, "Enter the number to check if it is prime:");
        ArrayList<Integer> check = checkPrime(userInput);
        if(check.size() == 0){System.out.println("The number: " + userInput + " is prime");}
        else{
            System.out.println("The number: " + userInput + " is not prime, hence it can be devided by:");
            check.forEach(number -> System.out.print(number + " "));
        }
    }
    
    public static int getUserInput(Scanner scanner,String message){
        System.out.println(message);
        System.out.print("A: ");
        boolean validInput = false;
        int userChoice = 0;
        while(!validInput){
            try{
                userChoice = scanner.nextInt();
                scanner.nextLine();
                validInput = true;
            }catch(Exception e){
                System.out.println("Invalid Input. " + e);
            } 
           }
        return userChoice;
    
}
    public static ArrayList<Integer> checkPrime(int number){
        int squareRoot = (int) (Math.sqrt(number));
        ArrayList list = new ArrayList<Integer>();
        for(int i=2;i<squareRoot+1;i++){
            System.out.println("DEBUG: numer: " + number + " i " + i);
            if(number % i == 0){
                list.add(i);
            } 
        }
        return list;
    }
    
    public static void generatePrimeNumber(Scanner scanner){
        boolean validChoice = false;
        Map<Integer, ArrayList<Integer>> map = new HashMap();
        while(!validChoice){
        try{
            System.out.print("Enter the lower Bound(Inclusive)- A: ");
            int lowerBound = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the upper Bound(Inclusive)- A: ");
            int upperBound = scanner.nextInt();
            scanner.nextLine();
            if(lowerBound%2==0){lowerBound +=1;}
            for(int i=lowerBound; i <= upperBound ; i += 2){
                System.out.println(i);
                map.put(i, checkPrime(i)) ;
            }
        validChoice = true;
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
        map.forEach((number , list)-> {
        if(list.isEmpty()){
            System.out.println("Number " + number + " is prime");
            }
        }
        );
    
                
    }
}

//get number
//get the square root(round up)
//devide the number by all of the numbers from 2 to sqaure root, if the remainder is 0, the number is not prime
//if it reaches to the upperbound sqaure root value, without havign any remainder 0, the numer is prime

// cannot be even
// user inputs lower bound and upperbound
// generate a collection of numbers(odd numbers between lowerbound and upperbound inclusive)
// loop trhough the number and varify if its prime and add it to the prime number  list
//return the primeumber list