package com.muni1;

public class Movie 
{
	 private String title;
	  private String mrating;
  String movieRating;
  public Movie(String rated, String mtitle) 
  {
      this.mrating=rated;
      this.title=mtitle;
  }
 
  public void setRating(String Rating) 
  {
      movieRating = Rating;
  }
  // Get the rating
  public String getRating() 
  {
      return movieRating;
  }
  public void setTitle(String title) 
  {
      this.title = title; 
  }

 
  public String getTitle() 
  { 
      return title; 
  }
  @Override
  public String toString() 
  {
      return "Movie"
      +" title="+getTitle() + 
      " rating="+getRating();
  }
  public static void main(String args [])
  {
      Movie mv= new Movie("","");
      mv.toString();
  }
              
 
  
}
