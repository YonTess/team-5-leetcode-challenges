import java.lang.classfile.components.ClassPrinter.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Create a dummy node to store the linked list result 
        ListNode result = new ListNode(0);

        // Set pointer to the empty result node
        ListNode pt = result;

        // initialize carry to store carried values
        int carry = 0;

        // Loop through both linked lists
        while (l1 != null || l2 != null) {
            
            int sum = 0 + carry;

            // If l1 has value, add it to the sum and jump to the next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // If l2 has value, add it to the sum and jump to the next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum /10;    // Calculate the new carry
            sum = sum % 10;     // Keep only the modulus    
            pt.next = new ListNode(sum);      // create a new node with sum and link to the result list
            pt = pt.next;       // move pointer to the next node
        }

        // Add remaining carry to the new node
        if (carry == 1) {
            pt.next = new ListNode(1);
        }

        // Return the head of the result
        return result.next;
    }
}
