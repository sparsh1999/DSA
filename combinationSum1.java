// combniation Sum1 
// can include a element more then once 
// only contain unqiue elements 
// more details on combinationSum2.java problem and about the differences in these two problems
import java.util.*;

public class Main
{
    static int a[] = new int[]{2,4,12,6,8};
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Arrays.sort(a);
		findCombination(0, 8, stack);
	}
	
	public static void findCombination(int i, int x, Stack<Integer> stack){
    	if(i>=a.length || x<0) return ;
    	if (x==0) {
    	    System.out.println(stack);
    	    return;
    	}
    	if(a[i]<=x) {
    		stack.add(a[i]);
    		findCombination(i, x-a[i], stack);
    		stack.pop();
    	    findCombination(i+1,x,stack);
    	}
    }

}

