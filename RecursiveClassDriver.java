package recursiveClassDriver;

import recursiveClassImpl.RecursionImpl;

public class RecursiveClassDriver {
	public static void main (String[] args){
		RecursionImpl recursion = new RecursionImpl();
		
		//factoResursive
		int factorial = recursion.factoRecursive(5);
		System.out.println(factorial);
		
		//factoIteritive
		int factorialIterative = recursion.factoIterative(5);
		System.out.println(factorialIterative);
		
		//fibonacciRecursive
		int fib = recursion.fibRecursive(10);
		System.out.println(fib);
		
		//fibonacciRecursiveWithDisplay
		recursion.fibRecursiveWithDisplay(10);
		System.out.println();
		
		//gcd
		double gcd = recursion.gcd(48, 24);
		System.out.println(gcd);
		
		//recursive length of string
		int length = recursion.lengthStringRecursive("JoelGina");
		System.out.println(length);
	}
}
