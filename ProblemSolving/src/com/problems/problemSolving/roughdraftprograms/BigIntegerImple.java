package com.problems.problemSolving.roughdraftprograms;

import java.math.BigInteger;

public class BigIntegerImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       BigInteger bigInteger = new BigInteger("10000000000000000000000000000000");

	        System.out.println("Value is: " +bigInteger);
	
	        BigInteger a = BigInteger.valueOf(12345);
	        BigInteger b = BigInteger.valueOf(45);

	        BigInteger c = a.add(b);  // equivalent to a + b
	        BigInteger d = a.subtract(b); // equivalent to a - b
	        BigInteger e = a.divide(b); // equivalent to a / b
	        BigInteger f = a.multiply(b); // equivalent to a * b

	        BigInteger g = a.mod(b); // equivalent to a % b
	        BigInteger h = a.xor(b); // equivalent to a ^ b

	        System.out.println("Value of c : " +c);
	        System.out.println("Value of d : " +d);
	        System.out.println("Value of e : " +e);
	        System.out.println("Value of f : " +f);
	        System.out.println("Value of g : " +g);
	        System.out.println("Value of h : " +h);
	        
	        byte byteValue = 22;
	        short shortValue = 33;
	        int intValue = 123456;
	        long longValue = 123456789;

	        BigInteger bigIntegerFromByte = BigInteger.valueOf(byteValue);
	        BigInteger bigIntegerFromShort = BigInteger.valueOf(shortValue);
	        BigInteger bigIntegerFromInt = BigInteger.valueOf(intValue);
	        BigInteger bigIntegerFromLong = BigInteger.valueOf(longValue);
	   
	        System.out.println(bigIntegerFromByte);
	        System.out.println(bigIntegerFromShort);
	        System.out.println(bigIntegerFromInt);
	        System.out.println(bigIntegerFromLong);
	
	}

}

