This Code is being tested with 1336 TestCases...



Solution:-

Approach 1: Binary Search

	This question is easy in a sense that one could run an exhaustive iteration to obtain the result. 
	That could work, except that it would run out of time when the input becomes too large. 
	So let us take a step back to look at the problem, before rushing to the implementation.

	Assume that the answer is kk, i.e. we've managed to complete kk rows of coins. 
	These completed rows contain in total 1 + 2 + ... + k = k(k+1)/2 coins. 

	We could now reformulate the problem as follows:

	Find the maximum k such that k(k + 1)/2 <= N

	The problem seems to be one of those search problems. 
	And instead of naive iteration, one could resort to another more efficient algorithm called binary search, 
	as we can find in another similar problem called search insert position.

Code:- 
	class Solution {
  		public int arrangeCoins(int n) {
    			long left = 0, right = n;
    			long k, curr;
    			while (left <= right) 
			{
      				k = left + (right - left) / 2;
      				curr = k * (k + 1) / 2;

			        if (curr == n) return (int)k;

		                if (n < curr) 
        			    right = k - 1;
				else
        			    left = k + 1;
      			}
		       return (int)right;
  		}
	}

Time Complexity =>  O(log n)
Space Complexity =>  O(1)




Approach 2: Math

	If we look deeper into the formula of the problem, we could actually solve it with the help of mathematics, without using any iteration.
	As a reminder, the constraint of the problem can be expressed as follows:

		k(k+1) ≤ 2N
 
	This could be solved by completing the square technique,

		(k+(1/2))^2 - (1/4)  <= 2N

	that results in the following answer:
		
		k = Math.sqrt( (2N+(1/4)) - (1/2) )

Code:-
	class Solution {
  		public int arrangeCoins(int n) {
    			return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
  		}
	}

Time Complexity => O(1)
Space Complexity => O(1)

