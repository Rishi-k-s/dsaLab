class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    // Method to add element at a specific position
    public int addElemToList(int data, int pos) {
        Node newNode = new Node(data);
        
        // Inserting at the head (position 0)
        if(pos == 0){
            newNode.next = head;
            this.head = newNode;
            return 1;
        }

        // Inserting at other positions
        Node current = head;
        int count = 0;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        
        if (current == null) {
            // Position is out of bounds
            System.out.println("Position out of bounds");
            return -1;
        }
        
        newNode.next = current.next;
        current.next = newNode;
        return 1;
    }

    // Method to add element at the end of the list
    public void addElemAtEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            // If the list is empty, the new element becomes the head
            head = newNode;
            return;
        }

        Node current = head;
        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Insert the new node at the end
        current.next = newNode;
    }

    // Method to add an element before a given key
    public void addBeforeKey(int key, int data) {
        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            System.out.println("List is empty. Cannot add before key.");
            return;
        }

        // If the head contains the key, add before the head
        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        // Traverse the list to find the node before the key
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        // If key is found
        if (current.next != null) {
            newNode.next = current.next; // Link the new node before the key
            current.next = newNode;
        } else {
            System.out.println("Key not found in the list.");
        }
    }

    // Method to add an element after a given key
    public void addAfterKey(int key, int data) {
        Node newNode = new Node(data);

        Node current = head;
        // Traverse the list to find the key
        while (current != null && current.data != key) {
            current = current.next;
        }

        // If key is found
        if (current != null) {
            newNode.next = current.next; // Link the new node after the key
            current.next = newNode;
        } else {
            System.out.println("Key not found in the list.");
        }
    }

    // Method to delete element at a specific position
    public int deleteElem(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        
        if (pos == 0) {
            head = head.next; // Deleting head
            return 1;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        
        if (current == null || current.next == null) {
            System.out.println("Position out of bounds");
            return -1;
        }

        current.next = current.next.next; // Bypassing the node at position
        return 1;
    }

    // Method to view elements in the linked list
    public void viewElem() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Method to view a specific element at a position
    public void viewElemAtPos(int pos) {
        Node current = head;
        int count = 0;
        while(current != null && count < pos) {
            current = current.next;
            count++;
        }
        if(current == null) {
            System.out.println("Position out of bounds");
        } else {
            System.out.println("Element at position " + pos + ": " + current.data);
        }
    }
}

public class LinkedListGPT {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElemToList(10, 0);
        ll.addElemToList(20, 1);
        ll.addElemToList(30, 2);
        ll.addElemToList(40, 3); // Inserting at specific position
        ll.addElemToList(50, 4);

        System.out.println("View all elements:");
        ll.viewElem();

        System.out.println("\nAdding element before key 30:");
        ll.addBeforeKey(30, 25); // Adding before 30

        System.out.println("\nView all elements after adding before key:");
        ll.viewElem();

        System.out.println("\nAdding element after key 30:");
        ll.addAfterKey(30, 35); // Adding after 30

        System.out.println("\nView all elements after adding after key:");
        ll.viewElem();
    }
}
