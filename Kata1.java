package uk.ac.wlv.cs5006.kata1;

import java.util.Arrays;

public class Kata1 {
	   
		static void areAnagram(String inputOne, String inputTwo) {  
	        
			String wordOne = inputOne.replaceAll("\\s", "");  
	        String wordTwo = inputTwo.replaceAll("\\s", "");  
	        
	        int wordOneLength = inputOne.length();
	        int wordTwoLength = inputTwo.length();
	        
	        char wordOneChar, wordTwoChar;
	        
	        boolean status = true;  
	        
	        if(inputOne.equals(null) || inputTwo.equals(null))
        	
	        	status = false;
	        
	        if (inputOne.isEmpty() && inputOne.isEmpty())
	        {
	       
	        	status = true;
	        }
	        else {
	        
	        	        	
	        	status =false;
	        }
	        
	      
	        
	        if(wordOneLength>=0)
	        	 
	        	 for(int i=0;i<wordOneLength;i++)
	                {
	                    wordOneChar =wordOne.charAt(i);
	                    if(wordOneChar>48 && wordOneChar<58) 
	    
	                    status = false;
	                }
	         
	         if(wordTwoLength>0)
	        	 
	        	 for(int i=0;i<wordTwoLength;i++)
	                {
	                    wordTwoChar =wordTwo.charAt(i);
	                    if(wordTwoChar>48 && wordTwoChar<58) 
	    
	                    status = false;
	                }
	        
	
	        if (wordOne.length() != wordTwo.length()) { 
	            status = false;	
	       
	        
	        } else {  
	            char[] ArrayOne  = wordOne.toLowerCase().toCharArray();  
	            char[] ArrayTwo = wordTwo.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayOne);  
	            Arrays.sort(ArrayTwo);  
	            status = Arrays.equals(ArrayOne, ArrayTwo);  
	        }  
	        if (status) {  
	            System.out.println(wordOne + " and " + wordTwo + " are anagrams");  
	        } else {  
	            System.out.println(wordOne + " and " + wordTwo + " are not anagrams");  
	        }  
	    }  
	
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			areAnagram("123","");  // It must return false if either input string is null
			areAnagram("","");//It must return true if both input strings are empty.
	        areAnagram("each","haec"); //It must return true if, passing the above checks, the two strings are anagrams of each other
	        areAnagram("","wer"); // It must return false if exactly one input string is empty.
	        areAnagram("","wer2"); // It must return false if either input string contains numerals. 
    		



	}

}
