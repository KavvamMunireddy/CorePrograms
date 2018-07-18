package com.muni1;

//Family class
import java.util.*;
import java.io.*;
//import java.util.Iterator;
public class Family implements Human
{
//String me,myPatner,famMembers;
int myAge;
//private Child ourChild;
String rating;
ArrayList familia;
private String name;
private int age;
public Family(String name, int age)
{
    this.name=name;
    this.age=age;
//    ourChild=new Child("",0); 
    familia = new ArrayList();
    
}
// protected String getPName(String pName)
//{
//  return famMembers = pName;
//
//}  
public String getMovieGoers()
{
    return rating;  
}

//return all family members
public void listAll()
{
        for (int cnt=0; cnt<familia.size(); cnt++)
        {
            System.out.println(familia.get(cnt));
        }
}
@SuppressWarnings("unchecked")
public  void addHumans(Adult newAdult)
{
    try
    {
            familia.add(newAdult);
    }
    catch (NullPointerException npe)
    {
            System.err.println("Error: " + npe);
    }		
}
public static void main(String args[])
{
     Family  familia = new Family("",0);
     Adult father = new Adult("Russel" , 32);
     Adult mother = new Adult("Lisa",28);           
     
     // Populate the list using the .addHumans() methods
     familia.addHumans(father);
     familia.addHumans(mother);       
     //calls listAll() method to display the family members          
     familia.listAll();
}
}