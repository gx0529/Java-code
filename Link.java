class Node{
    private String Data;
    private Node Next;
    public Node(String Data){
        this.Data = Data;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}

public class Test{
    public static void main(String[] args){
        Node head = new Node("火车头");
        Node first = new Node("车厢1");
        Node second = new Node("车厢2");
        Node last = new Node("火车尾");
        head.setNext(first);
        first.setNext(second);
        second.setNext(last);
        printlink(head);
    }
    public static void printlink(Node node){
        if(node != null){
            System.out.println(node.getData());
            node = node.getNext();
            printlink(node);
        }
    }
}
