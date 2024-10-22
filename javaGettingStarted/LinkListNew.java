class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public int addElemToList(int data, int pos){
        Node newNode = new Node(data);
        if(pos==0){

            newNode.next = head;
            this.head = newNode;
            return 1;
        }

        Node currNode = head;
        int currPos = 0;
        while(currNode != null && currPos < pos-1){
            currNode = currNode.next;
            currPos++;
        }

        if(currNode ==null){
            System.out.println("Error");
            return 0;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;


        return 0;
    }

    public void addElemToEnd(int data){
        Node newNode = new Node(data);
        Node currNode = head;

        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;


    }

    public void viewElem(int pos){
        Node currPos = this.head;

        while(currPos!=null){
            System.out.println(currPos.data);

            currPos = currPos.next;
        }
    }

    
}

public class LinkListNew {
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElemToList(10, 0);
        ll.addElemToList(20, 1);
        ll.addElemToList(30, 2);
        ll.addElemToList(40, 3);
        ll.addElemToList(50, 1);
        // ll.viewElem(0);
        ll.addElemToEnd(234);
        ll.viewElem(0);

        
    }
    
}
