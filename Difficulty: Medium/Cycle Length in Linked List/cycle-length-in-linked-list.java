class Solution {
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                int length = 1;
                fast = fast.next;

                while (slow != fast) {
                    fast = fast.next;
                    length++;
                }

                return length;
            }
        }

        return 0;
    }
}