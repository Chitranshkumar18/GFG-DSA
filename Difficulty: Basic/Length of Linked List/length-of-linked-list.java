class Solution {
    public int getCount(Node head) {
      Node temp = head;
      int length =0;
      while(temp != null){
          temp = temp.next;
          length++;
      }
      return length;
      
        
    }
}