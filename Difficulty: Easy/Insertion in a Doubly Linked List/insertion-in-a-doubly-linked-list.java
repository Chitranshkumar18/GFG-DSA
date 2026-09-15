class Solution {
    Node insertAtPos(Node head, int p, int x) {

        Node temp = head;

        // Reach the pth node
        for (int i = 0; i < p; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(x);

        // Insert newNode after temp
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
    }
}