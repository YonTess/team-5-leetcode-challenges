public class MissingNumber {
    public int missingNumber(int[] nums) {
        
        // Get the size of the array
        int n = nums.length;

        // Calculate the expected sum of the numbers in the array  
        // from 0 to n using the formula n * (n+1) / 2
        int total = n * (n + 1) / 2;

        // Initialize a variable to store the sum of elements in the array
        int sum = 0;

        // Loop through the array and compute the actual sum
        for (int num : nums) {
            sum += num;

        }

        // The missing number is the difference between expected total and actual sum
        return total - sum;
        
    }
}
