// in tihs for w=1 and 2 and so on i am continously considering the same element again and again 
// so this will not work 
// i have to consider a element only 1 time

for (int i = 1 ; i<W;i++) {
	for (int j = 1;j<=n;j++){
		if (i>=weight[j]){
			dp[i] = Math.max(dp[i], dp[i-weight[j]+value[j]);
		}
	}
}

// now improvement 
// outer loop runs on elements 
// inner loop runs on weights (but from which direction ) 
// left to right , here again same problem , weight of i = 1 , so it will be counted in all weights uptil W
// right to left, here my weight will be counted as the previous iteration weight (event if i go back for the remaining weight after deducing current weight)
for (int i = 1; i < n + 1; i++) {
	for (int w = W; w >= 0; w--) {

		if (wt[i - 1] <= w)

			// Finding the maximum value
			dp[w]= Math.max(dp[w], dp[w - wt[i - 1]]+ val[i - 1]);
