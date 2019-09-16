public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Object> myLinkedList = new MyLinkedList<>("aaaa");
        myLinkedList.addFirst(1);
        myLinkedList.addLast(10000);
        myLinkedList.ensureCapacity( 16);


        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(15));
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.getFirst());

        myLinkedList.clear();
        System.out.println(myLinkedList.size());
        myLinkedList.ensureCapacity(5);
        System.out.println(myLinkedList.size());



    }

}
