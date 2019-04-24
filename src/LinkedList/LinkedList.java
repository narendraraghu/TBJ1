package com.narendra.web.model;

//Java program to find n'th node from end using slow and fast pointers
class SinglyLinkedList {

    //remember this to create a node you need to create one data part and one pointer like construct

    static class Node {
        private Node next;          //for next node link which is type of node
        private String data;        //any data inside nore

        public Node(String data) {          //constructor
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node head; // Head is the first node in linked listn as usual

    /**
     * checks if linked list is empty
     *
     * @return true if linked list is empty i.e. no node
     */
    public boolean isEmpty() {
        return length() == 0;
    }

    /**
     * appends a node at the tail of this linked list
     *
     * @param data
     */
    public void append(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    /**
     * returns the last node or tail of this linked list
     *
     * @return last node
     */
    private Node tail() {
        Node tail = head;
        // Find last element of linked list known as tail
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    /**
     * method to get the length of linked list
     *
     * @return length i.e. number of nodes in linked list
     */
    public int length() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    /**
     * to get the nth node from end
     *
     * @param n
     * @return nth node from last
     */
    public String getLastNode(int n) {
        Node fast = head;
        Node slow = head;
        int start = 1;

        while (fast.next != null) {
            fast = fast.next;
            start++;

            if (start > n) {
                slow = slow.next;
            }
        }

        return slow.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node current = head;
        while (current != null) {
            sb.append(current).append("-->");
            current = current.next;
        }

        if (sb.length() >= 3) {
            sb.delete(sb.length() - 3, sb.length());

        }
        return sb.toString();
    }

}

class LinkedList
{
    public static void main(String args[]) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        System.out.println("linked list : " + list);

        System.out.println("The first node from last: " + list.getLastNode(1));
        System.out.println("The second node from the end: " + list.getLastNode(2));
        System.out.println("The third node from the tail: " + list.getLastNode(3));
    }
}
