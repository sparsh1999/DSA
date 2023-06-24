# DSA
Contains alternative solutions to famous dsa problems

Binary Search 
  1. https://leetcode.com/problems/find-peak-element/description/
     Here binary search is applied on a partially sorted array
     Intuition https://leetcode.com/problems/find-peak-element/solutions/1290642/intuition-behind-conditions-complete-explanation-diagram-binary-search/
     Essentially we are trying to find a local maxima, so just check if where is peak sitting wrt mid element and traverse there

DP 
  with Loop 
  1. 
     https://leetcode.com/problems/house-robber-ii/solutions/59934/simple-ac-solution-in-java-in-o-n-with-explanation/
     take two variables include and exclude, in each iteration include = last exclude + nums[i] and exclude = max(last include , last exclude)
     find return max of these two variables
     for loop say 1-11 --> if 1 is taken then 11 can not be taken and vice versa 
     we can reduce it to max (1->10 , 2->11) 
