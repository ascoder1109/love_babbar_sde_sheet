import static java.lang.StringTemplate.STR;

public class SinglyLinkedList {

    public ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertNode(int value){
        ListNode newNode = new ListNode(value);
        newNode.next =head;
        head = newNode;
    }
    public int count(){
        ListNode current = head;
        int count = 0;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void insert(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null!= current.next){
            current = current.next;
        }
        current.next=newNode;
    }
    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // Connect them together to form a chain
        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        singlyLinkedList.display();
        System.out.println();
        singlyLinkedList.insert(23);
        singlyLinkedList.display();

        System.out.println();
        System.out.println(STR."no of nodes:\{singlyLinkedList.count()}");

    }

}
