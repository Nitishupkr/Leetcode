/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast =head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
        
        
    }
}
// The algorithm uses two pointers, a "slow" pointer and a "fast" pointer, that traverse the linked list. The slow pointer moves one node at a time, while the fast pointer moves two nodes at a time. This means that the fast pointer will reach the end of the linked list twice as fast as the slow pointer.

// When the fast pointer reaches the end of the linked list, the slow pointer will be at the middle of the list. This is because the slow pointer moves at half the speed of the fast pointer, so it will have traversed half the distance.

// The code uses a while loop to move the pointers through the linked list. The loop continues as long as the fast pointer is not null (which means it has not reached the end of the list) and the fast pointer's next node is not null (which means the fast pointer has at least one more node to move to).

// Inside the loop, the slow pointer is moved to its next node, and the fast pointer is moved to its next next node (i.e., two nodes ahead). When the loop exits, the slow pointer will be at the middle of the list, so it is returned as the result.