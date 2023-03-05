// Here i want to find min partitions , so that consequtive characters make a palindrome 
// ababbbabbababa
// answer 10
// a b a bbb a bb a b a b a

import java.util.*;
class HelloWorld {
    private static int count = 0;
    public static void main(String[] args) {
        String s= "ababbbabbababa";
        System.out.println(findMinCuts(s, 0, "", 0));
    }
    
    
    private static int findMinCuts(String s, int index, String prev, int count){
    	if (index==s.length()){
    		return count;
    	}
    	
    	int min = Integer.MAX_VALUE;
    	
    	String temp = prev+s.charAt(index);
    	
    	
    	if (isPalindrome(temp)){
    		min = Math.min(min, findMinCuts(s, index+1, temp, count));
    	}
    	
	// this is needed in all case, as this might make a good pair in later part of string
    	min = Math.min(min, findMinCuts(s, index+1, String.valueOf(s.charAt(index)), count+1));
    	
    	System.out.println();
    	return min;
	
    }
    
    private static boolean isPalindrome(String s){
        int n= s.length();
        for(int i =0;i<n/2;i++){
            if (s.charAt(i)!=s.charAt(n-i-1))
            return false;
        }
        return true;
    }

}
