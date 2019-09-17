class Node {
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

    public void setNext(Node n){
        this.next= n;
    }

    public Node getNext(){
        return this.next;
    }
}
