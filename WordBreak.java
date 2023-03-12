import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("i");
        set.add("like");
        set.add("sam");
        set.add("sung");
        set.add("world");
        
        String s = "ilikesaml";
        int n = s.length();
        
        boolean dp[][] = new boolean[n+1][n+1];
        
        for (int k=0;k<=n;k++) {
        	for (int i=0,j=k; i<=n&&j<=n; i++,j++) {
        		if (i==j) {
        		    dp[i][j] = true; 
        		    continue;
        		}
        		
        		boolean full = set.contains(s.substring(i,j));
        		
        		dp[i][j] = dp[i][j] | full;
        		
        		for (int l = i+1;l<=j;l++){
        			dp[i][j] = dp[i][j] | (dp[i][l] && dp[l][j]);
        		}
        	}
        }
        
        for (int i =0;i<=n;i++){
            for (int j =0;j<=n;j++){
                System.out.print(dp[i][j]+" ");
            }
        	System.out.println();
        }
        
        System.out.println(dp[0][n]);
    }
    
    
    
    
}
