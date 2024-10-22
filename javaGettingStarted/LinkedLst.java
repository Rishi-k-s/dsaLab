class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
class SinglyLinkedList{
    Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void addElemToLinkedListStart(int data){
        Node node = new Node(data);

        node.next = head;

        head = node;
    }

    public void viewElem(){
        Node currentNode = this.head;

        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void searchElem(int key){
        Node searchNode = this.head;

        while(searchNode != null){
            if(key == searchNode.data){
                System.out.println(searchNode.next);
                System.out.println(searchNode.data);
                break;
            }
            searchNode = searchNode.next;
        }


    }

    public static Node insertAtEnd(Node head, int value){
        // Create a new node with the given value
        Node newNode = new Node(value);

        // If the list is empty, make the new node the head
        if (head == null)
            return newNode;

        // Traverse the list until the last node is reached
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Link the new node to the current last node
        curr.next = newNode;

        return head;
    }


}
public class LinkedLst {
    
    public static void main(String[] args) {
        SinglyLinkedList sLinkList = new SinglyLinkedList();
        sLinkList.addElemToLinkedListStart(10);
        sLinkList.addElemToLinkedListStart(20);
        sLinkList.addElemToLinkedListStart(30);
        sLinkList.addElemToLinkedListStart(40);
        sLinkList.addElemToLinkedListStart(50);
        sLinkList.viewElem();
        sLinkList.searchElem(30);

    }
    
}