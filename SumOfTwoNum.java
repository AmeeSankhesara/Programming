//Program to get sum of two numbers.
public class SumOfTwoNum {
    //Linked list node
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //function to add two numbers
    static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        //Initialize N and M as l1 and l2 and current as head
        ListNode N = l1,M=l2,current=head;
        //Initialize carry to 0
        int carry=0,x,y;
        //Iterate till end of List1 and List2
        while (N!=null || M!=null){
            //If list 1 is not null then assign its value to x
            if(N!=null){
                x=N.val;
            }else {
                x=0;
            }
            //If list 2 is not null then assign its value to y
            if(M!=null){
                y=M.val;
            }else {
                y=0;
            }
            //Add x,y and carry
            int sum = x+y+carry;
            //get carry by dividing sum by 10. carry should 0 or 1
            carry=sum/10;
            //Set current to value sum%10
            current.next = new ListNode(sum%10);
            current=current.next;
            //Advance N and M
            if(N!=null) N=N.next;
            if(M!=null) M=M.next;
        }
        //Check if remaining carry is greater than 0 then add carry to next node
        if(carry>0){
            current.next = new ListNode(carry);
        }
        return head.next;
    }

    //Function to insert node in linked list
    static ListNode push(ListNode node,int value){
        ListNode new_node = new ListNode(value);
        new_node.next = node;
        node=new_node;
        return node;
    }

    //Function to print linked list
    static void printList(ListNode node){
        while (node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
    }

    public static void main(String[] args)
    {
        ListNode node1 = null;
        node1 = push(node1,3);
        node1 = push(node1,4);
        node1 = push(node1,2);

        ListNode node2 = null;
        node2 = push(node2,4);
        node2 = push(node2,6);
        node2 = push(node2,5);

        System.out.println("Created Linked List - 1 : ");
        printList(node1);
        System.out.println("\nCreated Linked list - 2 : ");
        printList(node2);

        System.out.println("\nSum of two numbers : ");
        printList(addTwoNumbers(node1,node2));
    }
}
