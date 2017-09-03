package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci {
	
	public int fibonacci(int n) {
		
		// first two fibonacci numbers
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			// generate the nth fibonacci number
			int a = 0;
			int b = 1;
			for(int i = 2; i <= n; i++) {
				// 
				int temp = a;
				a = b;
				b = temp + b;
			}
			return b;
		}
			
		
	}

}
	
