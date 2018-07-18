package com.muni1;

import java.util.*;
import java.io.*;
public class Cinima 
{
  public static final int maxRate = 3;
  public static final int minRate = 1;
  float cost;
  String Title,humans;
  ArrayList mGoers;
      public Cinima (String mtitle, float pounds) 
      {
              this.Title=mtitle;
              this.cost = pounds;
              mGoers = new ArrayList();
      }
      public float getcost (int people) 
      {
          return cost * people;
      }
      //methods for adding movie goers which takes a collection of Humans
      public void addMovieGoers()
      {
          int minAge=18;
          Family fam = new Family("",0);
          
          fam.listAll();
//          for (int cnt=0; cnt<mGoers.size(); cnt++)
//          {
//              Adult stud = (Adult) mGoers.get(cnt);
//              System.out.println(stud);
//          }
    
      }
      
      /**
      * Method check that the movie title and rating have been set,
      * if not throw an exception.
      */
      public void setMovie(Movie movieNew) throws IOException
      {
          try
          {
     
              if (!isObjectEmpty(movieNew.getTitle()) && !isObjectEmpty(movieNew.getRating()))
              {
                   System.out.println("The movie is called " +movieNew.getTitle()+ 
                          " and is rated " +movieNew.getRating()+ ".");
              }
              else
              {
                   System.out.println("Movie title and rating not set");
              }
          }
          catch(Exception e)
          {
              System.out.println("Title and Rating not Set");
          }
      }
      public void showMovie() 
      {
          try
          {
              Movie mv = new Movie("","");
              String mRating = mv.getRating();
              String mTitle = mv.getTitle();
              if((mRating!=null)&& (mTitle!=null))
              {
                  System.out.println("Title is "+mTitle+" and is Rated "
                          +mRating+"");
              }
              else
              {
                  System.out.println("Either Title or Rating is missing");
              }
          }
          catch(Exception e)
          {
              System.out.println("The Movie properties not set");
          }
          finally
          {
             System.out.println("The movie is over.");
          }
      }
      
      /**
      * Checks is indiacated Object is empty.
      * restrictions for raiting type (rating must be >=1 and <=3)
      */
      
      public boolean isObjectEmpty(Object obj)
      {
          int rating=1;
          boolean result = obj==null;
          if((rating<1)||(rating>3))
          {
              System.out.println("The rating is out of bounds");
          }
          else
          {
              System.out.println("Movie properly rated");
          }
          return result;
      }
      
      public static void main(String args[])
      {
          String temp;
          int rate;
          System.out.println("What's the Movie rating:");
          BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
          
          try
          {
              temp= stdin.readLine(); 
              rate=Integer.parseInt(temp);
              if((rate<1)||(rate>3))
              {
                  System.out.println("Rate out of bounds!");
              }
              else
              {
                  System.out.println("The following can go for a movie:");
                  Cinima cin = new Cinima("PG",maxRate);
                  cin.addMovieGoers();                 
              }
          }
          catch(Exception e)
          {
               System.out.println("Movie not properly rated.");
          }
          finally
          {
              System.out.println("Cinema closed now.");
          }
         
      }

      
}
