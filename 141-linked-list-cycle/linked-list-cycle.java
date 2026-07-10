/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Edge case: an empty list or a list with only one node cannot have a cycle
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Move pointers until fast reaches the end of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;         // moves 1 step
            fast = fast.next.next;    // moves 2 steps
            
            // If they meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }
        
        // If fast reaches null, there is no cycle
        return false;
    }
}