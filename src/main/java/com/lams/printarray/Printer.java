package com.lams.printarray;

public class Printer {
	public static < E > void printArray( E[] inputArray )
	   {    
	     for ( E element : inputArray ){        
	        System.out.printf( "%s\n", element );
	     }
	   } 
}
