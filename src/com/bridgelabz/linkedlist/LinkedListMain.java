package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist1 = new LinkedList<>();
        linkedlist1.push(70);
        linkedlist1.push(56);
        linkedlist1.push(30);

        linkedlist1.display();

        Integer popData = linkedlist1.pop();
        if (popData == null) {
            System.out.println("Empty linked list.");
        } else
            System.out.println("POP First Successfully done.Pop data : " + popData);
        linkedlist1.display();

        System.out.println("******************************\n");

        LinkedList<Integer> linkedlist2 = new LinkedList<>();
        linkedlist2.append(56);
        linkedlist2.append(30);
        linkedlist2.append(45);
        linkedlist2.append(70);

        linkedlist2.display();

        Integer popLastElement = linkedlist2.popLast();
        if (popLastElement == null)
            System.out.println("Empty linked list.");
        else
            System.out.println("POP Last Successfully done.Pop data : " + popLastElement);
        linkedlist2.display();

        System.out.println("******************************\n");

        LinkedList<Integer> linkedlist3 = new LinkedList<>();
        linkedlist3.search(45);

        linkedlist3.append(56);
        linkedlist3.append(30);
        linkedlist3.append(45);
        linkedlist3.append(70);
        linkedlist3.display();

        Node<Integer> searchElement = linkedlist3.search(30);
        if (searchElement == null)
            System.out.println("Element not Found.");
        else {
            System.out.println("Element Found.");
            System.out.println(searchElement);

            System.out.println("******************************\n");

            System.out.println("Insert Node Between Node");
            LinkedList<Integer> linkedlist4 = new LinkedList<>();
            linkedlist4.append(56);
            linkedlist4.append(30);
            linkedlist4.append(70);
            linkedlist4.display();

            linkedlist4.insertAfter(30, 40);
            linkedlist4.display();

            System.out.println("******************************\n");

            System.out.println("Delete Node Between Node");
            linkedlist4.deleteAfter(40);
            linkedlist4.size();
            linkedlist4.display();
        }
    }
}