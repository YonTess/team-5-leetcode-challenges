# team-5-leetcode-challenges

Solutions to Leetcode challenges

1. Average Salary

The goal is to calculate the average salary excluding the minimum and maximum values.
First, the code loops through the array to find the smallest and largest salaries.
Then, it calculates the total sum of all salaries.
It subtracts the min and max salaries from the total to get the adjusted sum.
Finally, it divides that sum by (length - 2) to get the average of the remaining salaries.

2. SortedSquares

The solution behind the SortedSquares code is based on the fact that squaring negative numbers turns them positive, which can change the order in a sorted array.

So, even though the input array is sorted, squaring its elements may result in a new, unsorted array.

To summarize;

The code uses two pointers, one at the start and one at the end of the array.

It compares the squares of the values at each end and places the larger square at the end of the result array.

This continues until the entire result array is filled.

This strategy avoids the need to sort the squared array afterward, achieving O(n) time complexity.

3. Missing Number

The array contains n numbers from the range [0, n] with one number missing.

The code calculates the expected total of numbers from 0 to n using the formula n \* (n + 1) / 2.

It then sums the actual numbers in the array.

The difference between the expected sum and the actual sum reveals the missing number, since all other values are present and accounted for. This approach runs in O(n) time complexity.

4. AddTwoNumbers

The solution behind the AddTwoNumbers code is based on the process of adding two numbers digit by digit, just like how you’d add them by hand, starting from the least significant digit and carry over when the sum is above 9.

The two linked lists represent numbers in reverse order, so:

The code loops through both lists simultaneously,

Adds corresponding digits along with any carry from the previous step,

Creates a new node for each digit of the result,

Finally adds an extra node if there’s a leftover carry.

This way, the function builds a new linked list that represents the sum of the two input numbers.

5. mergeTwoLists

The solution behind the mergeTwoLists code is to combine two already sorted linked lists into one sorted list. It does this by:

Comparing the current nodes of both lists,

Attaching the smaller node to the result list,

Moving forward to the next node in the list,

Continue this process until one or both lists are fully traversed.

Finally, it attaches any remaining nodes from the non-empty list since they are all sorted.
