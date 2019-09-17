public class MyLinkedList<E> {

    private Node head;
    private int numberNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numberNodes++;

    }



    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        holder = temp.getNext();
        temp.setNext(new Node(element));
        temp.getNext().setNext(holder);
        numberNodes++;

    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.setNext(temp);
        numberNodes++;

    }

    public void addLast(E element) {
        Node temp = head;
        for (int i = 1; i < numberNodes - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(new Node(element));
        numberNodes++;
    }

    public boolean add(E element) {
        Node temp = head;
        for (int i = 0; i < numberNodes - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(new Node(element));
        numberNodes++;
        return true;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numberNodes - 1; i++) {
            temp = temp.getNext();
        }
        return (E) temp.getData();

    }

    public E remove(int index) {
        Node temp = head;
        Node result = temp.getNext();
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
        numberNodes--;
        return (E) result;

    }

    public boolean remove(E element) {
        Node temp = head;
        if (temp.getData() == element) {
            head = temp.getNext();
            numberNodes--;
            return true;
        }
        for (int i = 0; i < numberNodes; i++) {

            if (temp.getNext().getData() == element) {
                temp.setNext(temp.getNext().getNext());
                numberNodes--;
                return true;
            }
            temp = temp.getNext();


        }
        return false;
    }

    public int size() {
        return numberNodes;
    }

    public boolean contains(E element) {
        Node temp = head;
        for (int i = 0; i <= numberNodes; i++) {

            if (temp.getData() == element) {
                return true;
            }
            temp = temp.getNext();
        }

        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i <= numberNodes; i++) {
            if (temp.getData() == element) {
                return i;
            }
            temp = temp.getNext();
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        Node temp = head;
        if (numberNodes < minCapacity) {
            for (int i = 0; i < minCapacity-1 ; i++) {
                if (temp.getNext() == null) {
                    temp.setNext(new Node());
                    numberNodes++;
                }
                temp = temp.getNext();

            }
        }
    }

    public void clear() {
        head.setNext(new Node());
        numberNodes = 1;
    }




}
