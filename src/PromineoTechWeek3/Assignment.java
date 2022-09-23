package PromineoTechWeek3;

import java.util.Scanner;

public class Assignment {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) 
	{

		// Homework Assignment 1 part A and B  **********************************************
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 37};		
		int subtract = ages[0] - ages[ages.length - 1];
		System.out.println("Assignment 1a and b: " + subtract);
		
		
		// HomeworK Assignment 1 part C  ****************************************************
		double average = 0;
		for (int i = 0; i < ages.length; i++) 
		{
			average += ages[i];
		}
		System.out.println("Assignment 1c: " + "The average age is " + average / ages.length);
	
		// Homework Assignment 2 part A  ****************************************************
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double  averageLetters = 0;
		
		for (int i = 0; i < names.length; i++) 
		{
			averageLetters += names[i].length();
		}
		System.out.println("Assignment 2a: " + averageLetters / names.length);
		
		//Homework Assignment 2 part B  ******************************************************
		String concatenation = "";
		
		for(int i = 0; i < names.length; i++) 
		{
			concatenation += names[i] + " ";
		}
		System.out.println("Assignment 2b: " + concatenation); 
		
		
		//Homework Assignment 5  ************************************************************
		int[] nameLengths = new int[names.length];		
		for (int i = 0; i < names.length; i++) 
		{
			nameLengths[i] = names[i].length();
						
		}
		
		//Homework Assignment 6  ************************************************************
		int sum = 0;
		for (int j = 0; j < nameLengths.length; j++) 
		{
			sum += nameLengths[j];
		}
		System.out.println("Assignment 6: " + sum);
		
		System.out.println("Assignment 7: " +  repeat("Hello", 3)); // also part of Assignment 7
		
		System.out.println("Assignment 8: " + buildName("Peter", "Parker")); // also part of Assignment 8
		
		int[] sumNum = { 1, 2, 3, 44, 5, 36, 7, 8, 9, 10};// part of Assignment 9, also used for Assignment 10
		System.out.println("Assignment 9: " + intArray(sumNum));// part of Assignment 9
		System.out.println("Assignment 10: " + average(sumNum));// part of Assignment 10
		
		double [] d1 = {1.99, 5.33, 0.67, 2.9};// part of Assignment 11
		double [] d2 = {0.56, 2.07, 1.23, 6.32};// part of Assignment 11
		System.out.println("Assignment 11: " + greaterArrayValue(d1, d2));// part of Assignment 11
		
		System.out.println("Assignment 12: " + willBuyDrink(true, 7.95));// part of Assignment 12
		
		/*
		 * Homework Assignment 13
		 * What Type of Pokemon is Pickachu?
		 */
		
		System.out.println("What type of PokéMon is Pikachu?");
		//Scanner in = new Scanner(System.in);  // receive user input
		String userInput = in.next(); // stores user input in the String variable userInput
		System.out.println(pikachuType(userInput)); // Prints out the result of the method pikachuType passing in the userInput String variable
		in.close(); // closes scanner
		
	}
	
	//Homework Assignment 7  ************************************************************
	public static String repeat(String word, int n) 
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) 
		{
			result.append(word);
		}
		return result.toString();
	}
	
	//Homework Assignment 8  ************************************************************
	public static String buildName(String firstName, String lastName) {
		StringBuilder fullName = new StringBuilder(firstName + " " + lastName);
		return fullName.toString();
	}
	
	//Homework Assignment 9  ************************************************************
	
	public static boolean intArray (int[] num) {
		int sum = 0; 
		
		for(int i = 0 ; i < num.length; i++) 
		{
			sum += num[i];
		}
		
		if (sum > 100) 
		{
			return true;
		}
		else 
		{
			return false;
		}		
		
	}
	
	//Homework Assignment 10  ************************************************************
	public static double average (int[] averageNum) {
		
		double num = 0;
		int i = 0;
		
		for(i = 0 ; i < averageNum.length; i++) 
		{
			num += averageNum[i];
		}
		
		num /=  i;		
		return num;
	}
	
	//Homework Assignment 11  ************************************************************
	public static boolean greaterArrayValue (double[] double1, double[] double2) {
		
		double sum1 = 0;
		double sum2 = 0;
		
		for(int i = 0 ; i < double1.length; i++) 
		{
			sum1 += double1[i];
		}
		for(int j = 0 ; j < double2.length; j++) 
		{
			sum2 += double2[j];
		}
		
		if (sum1 > sum2) {
			return true;
		}
		else {
			return false;
		}
		

	}
	
	//Homework Assignment 12  ************************************************************
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		if (isHotOutSide && moneyInPocket >= 10.50) {
			return true;
		} else {
			return false;
		}
		
	}
	
	

	/*	Homework Assignment 13  ************************************************************
	 * This method asks what type of pokemon is Pikachu. (Hint: The correct answer is Electric)
	 * 
	 */
	
	public static String pikachuType(String pokeType) {
		boolean correctAnswer = false;
		
		while (correctAnswer == false) { // Loops through until user inputs the correct answer.
            
			if (pokeType.equalsIgnoreCase("Electric")) {  // checks the string pokeType value and compares it to the string literal "Electric" while ignoring the case
				correctAnswer = true;
			}
			else {
				System.out.println( "Pikachu is not a " + pokeType + " type Pokemon sorry. Try Again!");// else if user types in anything that is not the correct answer this will return
				pokeType = in.next(); // Gets the user input until it matches the answer we are looking for.
			}
		
		}
		return "Correct Pikachu is in fact an " + pokeType + " type of PokéMon!"; // if user types in "Electric" (in any case) this will return

	}
	

}
































