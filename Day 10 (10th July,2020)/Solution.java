/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node curr = head;
        
        while(curr!=null){
            if(curr.child!=null){
                Node down =  curr.child;
                while(down.next!=null) down = down.next;
                Node temp = curr.next;
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child= null;
                down.next = temp;
                if(temp!=null) temp.prev = down;
            }
            curr = curr.next;
        }
        return head;
    }
}