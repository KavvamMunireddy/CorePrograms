package com.muni;

import java.util.Scanner;

public class chintu {

public static void main(String[]args){
int i=0,j=0;
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
System.out.println("Fibonacci"+i);
System.out.println("Fiboanacci"+j);
for(int c=1;c<=k;c++)
{
c=i+j;
i=j;
j=c;
System.out.println("Fibonacci"+c);
}
}
}
