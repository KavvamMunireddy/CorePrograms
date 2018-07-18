package com.muni3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class RepeaWord 
{
	public static void findDuplicateChars(String str)
	{			
			Map<String, Integer> dupMap = new HashMap<String, Integer>(); 
			String[] chrs=str.split(" ");
			for(String ch:chrs)
			{
				if(dupMap.containsKey(ch))
				{
					dupMap.put(ch, dupMap.get(ch)+1);
				} 
				else 
				{
					dupMap.put(ch, 1);
				}
			}
			Set<String> keys = dupMap.keySet();
			for(String ch:keys)
			{
				if(dupMap.get(ch) > 1)
				{
					System.out.println(ch+"--->"+dupMap.get(ch));
				}
			}
		}
		
		public static void main(String a[]){
			
			findDuplicateChars("java2 java2 java2 java2 novice 22 22 jk jk jbkjmkunimMuniMmuni");
		}
	}

