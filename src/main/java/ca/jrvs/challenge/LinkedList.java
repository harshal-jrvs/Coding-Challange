package ca.jrvs.challenge;

public class LinkedList {
    Node head;

    public static LinkedList addFirst(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node temp = list.head;
            list.head = new_node;
            list.head.next = temp;

        }

        return list;
    }

    public static LinkedList addLast(LinkedList list, int data) {
        //Step:1 Create a new node with data received
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            // Step2: Find the last node in the linked list
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LiinkedList: ");
        //Traverse through linked list
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static LinkedList deletebykey(LinkedList list, int key) {
        Node currNode = list.head, prev = null;
        //If the elemeted to be deleted is at the head
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println("\n" + key + " found and deleted");
            return list;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println("\n" + key + " found and deleted");
        }
        if (currNode == null) {
            System.out.println("\n" + key + " Not found");
        }
        return list;
    }

    public static LinkedList deletebyposition(LinkedList list, int index) {
        Node currNode = list.head, prev = null;
        if (currNode != null && index == 0) {
            list.head = currNode.next;
            System.out.println("\n" + index + " Position element deleted");
            return list;
        }
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;
                System.out.println("\n" + index + " Postion element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println("\n" + index + " Position element not found");
        }
        return list;
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {//constructor
            data = d;
            next = null;
        }
    }