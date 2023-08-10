package seminar3;

public class LinkedList {
    Node root;
    Node tail;

    private class Node {
        Integer value;
        Node previous;
        Node next;

    }

    public void reverse() {
        Node currentNode = root;
        while (currentNode != null) {
            Node _next = currentNode.next;
            Node _previous = currentNode.previous;
            currentNode.next = _previous;
            currentNode.previous = _next;
            if (_previous != null) {
                tail = currentNode;
            }
            if (_next == null) {
                root = currentNode;
            }
            currentNode = _next;
        }
    }

    public void add(Integer value) {
        Node node = new Node();
        node.value = value;
        if (root == null) {
            root = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void print() {
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}