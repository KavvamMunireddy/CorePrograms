package com.muni;

public class Arrays
{
	
	public static void main(String[] args) 
	{
		String array[]={"empId","empName","empSal","DeptNo","Date Of Birth","Date Of Join"};
		String array1[]={"1001","MuniReddy","5000","10","06-03-1992","31-05-2016"};
		 
			for (int i = 0 ; i < array.length ; i++)
			{
			    System.out.println(array[i]);			    
			   System.out.println(array1[i]);
			   System.out.println("================");
			   
   
			   
		
			}
			
			String s1="Muni"; 
			String s2="Muni1";
			System.out.println( s1 == s2);//true or false
	}
}



