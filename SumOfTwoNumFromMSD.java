/*
Program to add two numbers. You are given two non-empty linked lists representing two non-negative integers.
The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return
it as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example : Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
          Output: 7 -> 8 -> 0 -> 7
Time complexity - O(n)
Space complexity - O(1)
*/
public class SumOfTwoNumFromMSD {
    static ListNode head;
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int v) {
            this.val = v;
        }
    }
    //Function to add two numbers
    static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        for (ListNode currNode1 = l1, currNode2 = l2; currNode1 != null || currNode2 != null;) {
            if (currNode1 == null) {
                l1 = padZero(l1);
            } else if (currNode2 == null) {
                l2 = padZero(l2);
            }

            if(currNode1!=null){
                currNode1=currNode1.next;
            }

            if(currNode2!=null){
                currNode2=currNode2.next;
            }
        }
        ListNode result =  addTwoNumbersNormalized(l1, l2);

        if(result.val>9){
            result.val=result.val-10;
            ListNode newNode = new ListNode(1);
            newNode.next = result;
            result = newNode;
        }
        return result;
    }

    //Recursive function to get sum
    static ListNode addTwoNumbersNormalized(ListNode l1,ListNode l2){
        if(l1==null || l2==null){
            return null;
        }

        ListNode nextNode = addTwoNumbersNormalized(l1.next,l2.next);

        boolean carry = false;

        if(nextNode!=null && nextNode.val>9){
            carry=true;
            nextNode.val=nextNode.val-10;
        }

        ListNode currNode=new ListNode(l1.val+l2.val+(carry?1:0));
        currNode.next=nextNode;
        return currNode;
    }

    //Function to add 0 pad in list
    static ListNode padZero(ListNode node){
        ListNode new_node = new ListNode(0);
        new_node.next=node;
        return new_node;
    }

    //Function to print list
    static void printList(ListNode node){
        while (node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ListNode list1 = new ListNode(7);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(3);
        System.out.println("List - 1 : ");
        printList(list1);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
        System.out.println("List - 2 : ");
        printList(list2);

        System.out.println("Sum of two lists : ");
        printList(addTwoNumbers(list1,list2));


    }
}
