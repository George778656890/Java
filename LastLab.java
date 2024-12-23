//
import java.util.*;

class DLList<E> {

    private static class Node<E> {

        E data;
        Node<E> next, prev;

        Node(E d) {
            data = d;
            next = prev = null;
        }

        public E getData() {
            return this.data;
        }

        public Node<E> getNext() {
            return this.next;
        }

        public Node<E> getPrev() {
            return this.prev;
        }

        public void setNext(Node<E> n) {
            this.next = n;
        }

        public void setPrev(Node<E> n) {
            this.prev = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public DLList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFront(E item) {
        System.out.println("\n---------addFront() method------------");
        Node<E> newNode = new Node<>(item);

        if (isEmpty()) {
            System.out.println("Adding to Empty DLL");
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            
        }
        head = newNode;
        size++;
        System.out.println(item + " is added to the Double Linked List .");
    }

    public void addEnd(E item) {
        System.out.println("\n---------addEnd() method------------");
        Node<E> newNode = new Node<>(item);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node<E> prev = tail;
            newNode.setPrev(prev);
           
            prev.setNext(newNode);
             
        }
         tail = newNode;
        size++;
        System.out.println(item + " is added to the Double Linked List .");
    }

    public void add(int index, E item) {
        Node<E> newNode = new Node<>(item);
        Node<E> current = head;

        System.out.println("\n---------add() method------------");
        for (int count = 0; count < index && current.next != null; count++) {

            current = current.getNext();
        }

        newNode.next = current.next;
        newNode.setPrev(current);
        current.setNext(newNode);
        newNode.next.setPrev(newNode);
        size++;
        System.out.println(item + " is added to the Double Linked List .");
    }

    public E removeFront() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        E nodeValue = head.data;
        head = head.next;
        head.setPrev(null);
        System.out.println(nodeValue + "- successfully removed ");
        size--;
        if (isEmpty()) {
            head = null;
            tail = null;
        }
        return nodeValue;
    }

    public E removeEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        E nodeValue = tail.data;
        tail = tail.prev;
        tail.setNext(null);
        System.out.println(nodeValue + "- successfully removed ");
        size--;
        if (isEmpty()) {
            head = null;
            tail = null;
        }
        return nodeValue;

    }

    public E remove(int index) {
        System.out.println("\n-----------remove() method-------------");
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int count = 1; count < index && current.next != null; count++) {

            current = current.getNext();
        }
        E nodeValue = current.next.data;
        current.setNext(current.next.next);
        current.next.setPrev(current);
        System.out.println(nodeValue + "- successfully removed ");
        size--;
        return nodeValue;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int count = 1; count < index && current.next != null; count++) {

            current = current.getNext();
        }
        E nodeValue = current.next.data;
        return nodeValue;
    }

}

public class LastLab {

    public static int[] merge(int[] a, int[] b) {
       int[] finalArray = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                finalArray[k] = a[i];
                i++;
            } else {
                finalArray[k] = b[j];
                j++;
            }
            k++;
        }
        
        while (i < a.length) {
            finalArray[k] = a[i];
            i++;
            k++;
        }
        
        while (j < b.length) {
            finalArray[k] = b[j];
            j++;
            k++;
        }
        
        return finalArray;}

    public static void main(String[] args) {

        int[] a = {1, 4, 5};
        int[] b = {2, 3};
        int[] tmp1 = merge(a, b);
        for (int i = 0; i < tmp1.length; i++) {
            System.out.print(tmp1[i] + " ");
        }
        System.out.println();

        int[] c = {2, 3};
        int[] d = {1, 4, 5};
        int[] tmp2 = merge(c, d);
        for (int i = 0; i < tmp2.length; i++) {
            System.out.print(tmp2[i] + " ");
        }
        System.out.println();

        int[] e = {1, 3, 5, 7};
        int[] f = {2, 4, 6, 8};
        int[] tmp3 = merge(e, f);
        for (int i = 0; i < tmp3.length; i++) {
            System.out.print(tmp3[i] + " ");
        }

        java.io.PrintStream o = System.out;
        DLList<String> list = new DLList<>();
        list.addEnd("D");
        list.addFront("B");
          for (int i = 0; i < 2; i++) {
            o.print(" " + list.get(i));
        }
        list.addEnd("E");
         for (int i = 0; i < 3; i++) {
            o.print(" " + list.get(i));
        }
        list.add(1, "C");
        list.addFront("A");
        for (int i = 0; i < 5; i++) {
            o.print(" " + list.get(i));
        }
        o.println();
        list.removeFront();
        list.removeEnd();
        list.remove(1);
        for (int i = 0; i < 2; i++) {
            o.print(" " + list.get(i));
        }
        o.println();
        list.remove(0);
        list.remove(0);
        o.println(list.isEmpty());
        list.add(0, "B");
        list.addFront("A");
        list.add(2, "C");
        for (int i = 0; i < 3; i++) {
            o.print(" " + list.get(i));
        }
        o.println();
        list.remove(3); //Note: the "3" is out of bounds

    }

}
