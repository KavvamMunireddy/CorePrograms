package com.muni1;
//Movie class

//Cinema class

//MovieRating class
import java.util.HashMap;
import java.util.Map;
public class MovieRating 
{
  private Map ageMap = new HashMap();
  public MovieRating()
  {
      ageMap.put("G", new Integer(18));
      ageMap.put("PG", new Integer(16));
  }
  public boolean getStatus(String rating, int age)
  {
      Integer rateAge = (Integer)ageMap.get(rating);
      if(rateAge != null)
      {
          int minAge = rateAge.intValue();
          if (age < minAge )
          {
              return false;
          }
          else
          {
              return true;
          }
      }
      return false;
  }
}