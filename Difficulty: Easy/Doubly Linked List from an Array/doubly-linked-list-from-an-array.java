class Solution {
    public Node createDLL(int arr[]) {
        Node head = new Node(arr[0]);
        head.prev = null;
        head.next = null;

        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node arrnode = new Node(arr[i]);
            arrnode.next = null;
            arrnode.prev = null;

            temp.next = arrnode;
            arrnode.prev = temp;
            temp = temp.next;
        }

        return head;
    }
}