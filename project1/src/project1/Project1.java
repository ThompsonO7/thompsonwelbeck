/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;



class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return l1 != null ? l1 : l2;
        }
        
        ListNode Empty = new ListNode(-1);
        ListNode prev = Empty;
        ListNode c1 = l1;
        ListNode c2 = l2;
        
        while(c1 != null && c2 != null){
            if(c1.val >= c2.val){
                prev.next = c2;
                c2 = c2.next;
            }
            else{
                prev.next = c1;
                c1 = c1.next;
            }
            prev = prev.next;
        }
        
        prev.next = c1 != null ? c1 : c2;
        
        return Empty.next;
        
    }
}
