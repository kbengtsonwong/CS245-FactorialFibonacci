package edu.usfca.cs.cs245;

public class FactorialIterative implements Factorial {

	public int factorial(int n) {
		// temporary variable to hold factorial amount
		int amount = n;
		
		// decrease step by one, each iteration, multiplying amt by the decreasing step value until it reaches 1
		for(int i = n-1; i > 0; i--) {
			amount *= i;
		}
		return amount;
	}
	
}

