package com.muni3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Exception 
{
	public static void main(String[] args)
	{
		try{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a  value");
		int a=s.nextInt();
		System.out.println("enter b  value");
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(InputMismatchException re){System.out.println("please enter two integer values only");}
		catch(ArithmeticException re){System.out.println("please enter b>0");}
		catch(RuntimeException re){System.out.println("please enter valid input");}
		System.out.println("===================================");
		
		Stack s=new Stack();
		s.push("Hello");
		System.out.print(s.pop()+" ");
		s.push("36");
		System.out.println(s.pop());
		
	}

	
}
