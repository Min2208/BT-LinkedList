public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Object> myLinkedList = new MyLinkedList<>("aaaa");
        System.out.println(myLinkedList.getFirst());
        myLinkedList.addLast(5);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(0));

        MyLinkedList<Object> myLinkedList1 = new MyLinkedList<>(1);




    }

}
