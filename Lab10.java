//LinkList Stack and Queue

class LinkedStack<E> {

    private static class SinglyLinkedNode<E> {

        private E data;
        private SinglyLinkedNode<E> next;

        public SinglyLinkedNode(E d) {
            this.data = d;
            this.next = null;
        }

        public SinglyLinkedNode(E d, SinglyLinkedNode<E> n) {
            this.data = d;
            this.next = n;
        }

        public E getData() {
            return this.data;
        }

        public SinglyLinkedNode<E> getLink() {
            return this.next;
        }

        public void setLink(SinglyLinkedNode<E> n) {
            this.next = n;
        }
    }

    private SinglyLinkedNode<E> head = null;
    private int size = 0;

    public LinkedStack() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        System.out.println("Stack of Linkedlist will never be full ! ");
        return false;
    }

    public void push(E item) {
        SinglyLinkedNode<E> newNode = new SinglyLinkedNode<E>(item, head);
        head = newNode;

    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty ");
            return null;
        }
        E data = head.getData();//retrieve the data
        head = head.getLink();//make the head point to the next node
        return data;

    }

}

class LinkedQueue<E> {

    private static class SinglyLinkedNode<E> {//Non-static class

        private E data;
        private SinglyLinkedNode<E> next;

        public SinglyLinkedNode(E d) {
            this.data = d;
            this.next = null;
        }

        public SinglyLinkedNode(E d, SinglyLinkedNode<E> n) {
            this.data = d;
            this.next = n;
        }

        public E getData() {
            return this.data;
        }

        public SinglyLinkedNode<E> getLink() {
            return this.next;
        }

        public void setLink(SinglyLinkedNode<E> n) {
            this.next = n;
        }
    }

    private int size = 0;
    private SinglyLinkedNode<E> head = null;
    private SinglyLinkedNode<E> tail = null;

    public LinkedQueue() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        System.out.println("Queue of LinkedList will never be full ");
        return false;
    }

    public void add(E item) {
        SinglyLinkedNode<E> newNode = new SinglyLinkedNode<>(item);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setLink(newNode);//make the last node point to the new node
            tail = newNode;
        }
        size++;
    }
    
    public E remove(){//only remove element from the head
        if (isEmpty()) {
            System.out.println("Queue is empty ");
            return null;
        }
        E data = head.getData();//retrieve the data
        head = head.getLink();//make the head point to the next node
        size--;
        if (isEmpty()) {
            tail = null;//Initialize the state of tail
        }
        return data;
    }
}

public class Lab10 {

    public static void main(String[] args) {
        LinkedStack<Integer> linkStackObject1 = new LinkedStack<>();
        System.out.println("Stack is empty ? " + linkStackObject1.isEmpty());
        System.out.println("Stack is full ? " + linkStackObject1.isFull());
        linkStackObject1.push(1);
        linkStackObject1.push(2);
        linkStackObject1.push(3);
        System.out.println("Use pop() method to pop the top element : " + linkStackObject1.pop());
        System.out.println("Stack is empty ? " + linkStackObject1.isEmpty());
        System.out.println();
        
        LinkedQueue<Integer> linkQueueObject1=new LinkedQueue<>();
        System.out.println("Queue is empty?"+linkQueueObject1.isEmpty());
        System.out.println("Queue is full?"+linkQueueObject1.isFull());
        linkQueueObject1.add(1);
        linkQueueObject1.add(2);
        linkQueueObject1.add(3);
        System.out.println("Queue is empty?"+linkQueueObject1.isEmpty());
        
        linkQueueObject1.remove();//Use remove() method to delete one element
        linkQueueObject1.remove();
        linkQueueObject1.remove();
        System.out.println("Queue is empty?"+linkQueueObject1.isEmpty());
        
        
        
        

    }
}
