// recursive implementation of LIS problem 

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[] = new int[]{50, 3, 10, 7, 40, 80};
        System.out.println(lis(arr, arr.length, Integer.MAX_VALUE));
    }
    
    public static int lis(int arr[], int index, int max) {
        if (index==0) return 0;
        
        int maxLength = Integer.MIN_VALUE;
        if (arr[index-1]<max){
            maxLength = lis(arr, index-1, arr[index-1])+1;
        }
        return Math.max(maxLength,lis(arr, index-1, max));
    }

    // i = arr.length
    // length = max length of lis 
    // lis[] = LIS dp array 
    while(i>=0&&length>=0){
	if (lis[i] == length){
		print a[x];
		max--;
		length--;
	}
	i--;
}
    
}
