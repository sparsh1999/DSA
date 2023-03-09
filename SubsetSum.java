// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int prices[] = new int[]{1,5,8,9,10,17,17,20};
        int dp[][] = new int[2][prices.length+1];
        int index = 0;
        
        for (int i =0;i<=prices.length;i++){
            for (int j = 0;j<=prices.length;j++){
                if (i==0||j==0) {
                    dp[index][j] = 0;
                    continue;
                }
                
                // exlclude case 
                dp[index][j] = dp[1-index][j];
                
                // include case 
                if (j-i>=0){
                    dp[index][j] = Math.max(dp[index][j] , 
                     dp[index][j-i] + prices[i-1]);
                }
            }
            index = 1-index;
        }
        
        System.out.println(dp[1-index][prices.length]);
        
        
        // System.out.println(findMaxValueCut(prices, prices.length, prices.length));
    }
    
    
public static int findMaxValueCut(int prices[], int sum, int index) {
	
	if (sum<0 || index<=0) return -1;
	
	if (sum==0) return 0;
	
	int include = findMaxValueCut(prices, sum - index, index);
	int exclude = findMaxValueCut(prices, sum, index-1);
	
	if (include !=-1) include += prices[index-1];
	
	return (int)Math.max(include, exclude);
}
}
