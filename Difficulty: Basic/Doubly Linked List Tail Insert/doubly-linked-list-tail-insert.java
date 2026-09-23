/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;
    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node insertInTail(Node head, int data) {
        Node temp = head;
         
        while(temp.next!=null){
            temp = temp.next;
        }
        
        Node newnode = new Node(data);
        
        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = null;
        return head;
        
    }
}