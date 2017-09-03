package edu.usfca.cs.cs245;

public class FibonacciRecursive implements Fibonacci {

	public int fibonacci(int n) {
		// base case 
		if(n == 0 || n == 1) {
			return n;
		}
		// recursive case
		else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}

}
