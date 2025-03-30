public class MergeTwoLIsts {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create a dummy node to store the linked list result
        ListNode result = new ListNode(0);
        
        // Set pointer to track the current position in the new list
        ListNode current = result;

        // Loop through both linked lists as long as neither are null
        while (list1 != null && list2 != null) {

            // compare the current nodes of the two lists 
            // and attach the smaller one

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
        }

        // Move the current pointer to the next value
        current = current.next; 
          
        // Attach any remaining nodes from either lists
        }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // Return the head of the result
        return result.next;
    }
   
}
