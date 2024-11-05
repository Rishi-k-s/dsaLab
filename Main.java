class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;
    
    // Method to add a digit to the linked list
    public void addDigit(int digit) {
        Node newNode = new Node(digit);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    // Method to compute the sum of digits until it reduces to a single digit
    public int getSingleDigitSum() {
        int sum = 0;
        Node temp = head;
        
        // Summing up the digits in the linked list
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        
        // Reduce sum to a single digit
        while (sum >= 10) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }
        
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 987654;  // Example number
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Storing each digit in the linked list
        while (number > 0) {
            int digit = number % 10;
            list.addDigit(digit);
            number /= 10;
        }
        
        // Finding the single digit sum
        int singleDigitSum = list.getSingleDigitSum();
        System.out.println("Single Digit Sum: " + singleDigitSum);
    }
}
