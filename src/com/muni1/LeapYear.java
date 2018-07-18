package com.muni1;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String args[])
    {
       
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Year : ");
       int yr = scan.nextInt();
	   
       if((yr%4 == 0) && (yr%100!=0)||(yr%400==0))
       {
           System.out.print("This is a Leap Year");
       }
       else
       {
           System.out.print("This is not a Leap Year");
       }
    }

}
