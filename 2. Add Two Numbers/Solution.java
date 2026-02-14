public class Solution {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      int sum = carry;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      curr.next = new ListNode(sum % 10);
      curr = curr.next;

      carry = sum / 10;
    }
    return dummy.next;
  }

  //helper method to print the linked list
  public static void printList(ListNode head) {
    ListNode h1 = head;

    while (h1 != null) {
      System.out.print(h1.val);
      if (h1.next != null)
        System.out.print(" -> ");
      h1 = h1.next;
    }


    System.out.println();

    int placeVal = 1;
    int val = 0;
    while (head != null) {
      val += head.val * placeVal;
      placeVal *= 10;
      head = head.next;
    }
    System.out.println(val);
    System.out.println();
  }

  public static void main(String[] args) {

    //Test Case 1
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(7);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(8);
    l2.next.next = new ListNode(1);
    l2.next.next.next = new ListNode(9);

    ListNode l3 = new ListNode(0);
    l3.next = new ListNode(3);

    ListNode result1 = addTwoNumbers(l1, l2);
    ListNode result2 = addTwoNumbers(l1, l3);
    ListNode result3 = addTwoNumbers(l2, l3);

    printList(result1);
    printList(result2);
    printList(result3);
  }
}
