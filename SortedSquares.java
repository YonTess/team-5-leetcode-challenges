import javax.swing.text.Position;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        
        // Get the length of the input array
        int n = nums.length;
        // Create a new array to store the squared values in sorted order
        int[] result = new int[n];
        
        // Start left pointer starting at the beginning of the array

        int left = 0;

        // Start right pointer starting at the end of the array
        int right = n - 1;
        
        // Position pointer to fill the result array from the end
        int pos = n - 1;

        // Loop until both pointers meet
        while (left <= right) {

            // Square the values at both ends of the array
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            // Compare the squared values
            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;

            } else {
                result[pos] = rightSq;
                right--;
            }

            pos--;
        }

        // Return the final sorted squares array
        return result;
    }
}
