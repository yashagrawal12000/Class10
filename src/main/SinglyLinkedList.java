package main;

import java.net.SocketOption;

public class SinglyLinkedList {
    private static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
        private int size = 0;
        private Node head = null;

    public static void main(String[] args) {
       SinglyLinkedList linkedlist = new SinglyLinkedList();
       System.out.println(linkedlist);
        linkedlist.inserthead(42);
        linkedlist.inserthead(52);
        System.out.println(linkedlist);

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");

        Node temp = this.head;
        while (temp != null)
        {
            result.append(temp.data);
            if(temp.next != null)
            {
                result.append(" ==> ");
            }
            temp = temp.next;
        }

        result.append("]");
        return result.toString();
    }
    private void inserthead(int data){
        Node newNode = new Node(data,this.head);
        this.head = newNode;
        size++;
    }
    private void insertAfter(int data,Node node)
    {
        Node newNode = new Node(data,node.next);
        node.next = newNode;
        size++;
    }
}
