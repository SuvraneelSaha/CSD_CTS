public class POTD{
  // 876. Middle of the Linked List
  public static void main(String[] args)
  {

  }
  public ListNode middleNode(ListNode head) {
    ListNode slow = head, fast = head;
   while (fast != null && fast.next != null) {
       slow = slow.next;
       fast = fast.next.next;
   }
   return slow;
}
}