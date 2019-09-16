public class MyLinkedList<E> {

    private Node head;
    private int numberNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numberNodes++;

    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Node() {
            this.data = null;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numberNodes++;

    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numberNodes++;

    }

    public void addLast(E element) {
        Node temp = head;
        for (int i = 0; i < numberNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numberNodes++;
    }

    public boolean add(E element) {
        Node temp = head;
        for (int i = 0; i < numberNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numberNodes++;
        return true;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numberNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;

    }

    public E remove(int index) {
        Node temp = head;
        Node result = temp.next;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numberNodes--;
        return (E) result;

    }

    public boolean remove(E element) {
        Node temp = head;
        if (temp.data == element) {
            head = temp.next;
            numberNodes--;
            return true;
        }
        for (int i = 0; i < numberNodes; i++) {

            if (temp.next.data == element) {
                temp.next = temp.next.next;
                numberNodes--;
                return true;
            }
            temp = temp.next;


        }
        return false;
    }

    public int size() {
        return numberNodes;
    }

    public boolean contains(E element) {
        Node temp = head;
        for (int i = 0; i <= numberNodes; i++) {

            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i <= numberNodes; i++) {
            if (temp.data == element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        Node temp = head;
        if (numberNodes < minCapacity) {
            for (int i = 0; i < minCapacity-1 ; i++) {
                if (temp.next == null) {
                    temp.next = new Node();
                    numberNodes++;
                }
                temp = temp.next;

            }
        }
    }

    public void clear() {
        head.data = null;
        head.next=null;
        numberNodes = 1;
    }


}
