// also solve combinationSum1
// difference between this and combinationSum1 is
// 1. we can have duplicate elements
// 2. we cant include a element more then once 
//
import java.util.*;

public class Main
{
    static int a[] = new int[]{10 ,1 ,2 ,7 ,6 ,1 ,5};
	public static void main(String[] args) {
		System.out.println("Hello World");
		String s = "nitin";
		Arrays.sort(a);
		Stack<Integer> stack = new Stack<>();
		findCombination(0, 8, stack);
	}
	
	public static void findCombination(int i, int x, Stack<Integer> stack){
    	if(i>=a.length || x<0) return ;
    	if (x==0) {
    	    System.out.println(stack);
    	    return;
    	}
    	if(a[i]<=x){
    		stack.add(a[i]);
		// this is also different, we included this elemet , so now include next one 
		// in combinationSum1 , we can include it again
    		findCombination(i+1, x-a[i], stack);
    		stack.pop();
    		int j = i+1;
		// this is needed as we want to ignore the duplicates 
		// so for 1 1 5 , and k = 6 
		// on the 0th index, we included 1 (0th index)
		// but then we should not include 1 (1st index ) as it will just form a duplicate
    		while(j!=a.length && a[j]==a[i]) j++;
    	    findCombination(j,x,stack);
    	}
    }

}

