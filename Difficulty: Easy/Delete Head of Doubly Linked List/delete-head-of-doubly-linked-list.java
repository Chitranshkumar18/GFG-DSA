/* Structure of doubly linked list Node
class Node {
public:
    int data;
    Node next;
    Node prev;

    public Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
};*/
class Solution {
    public Node deleteHead(Node head) {
        Node temp = head;
        
        temp = head.next;
        temp.prev = null;
        head = temp;
        return head;
        
    }
};