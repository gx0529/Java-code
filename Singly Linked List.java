package www.bit.java;

interface ILink{
    boolean ListPushFirst(Object data);
    boolean ListPushBack(Object data);
    boolean ListInsert(Object data);
    boolean ListPopFront();
    boolean ListPopBack();
    boolean ListErase();
    int size();
    void printLink();
    int contains(Object data);
}

class LinkImpl implements ILink{
    private Node head;
    private Node last;
    private int size;
    private class Node{
        private Node next;
        private Object data;
        public Node(Node next, Object data){
            this.next = next;
            this.data = data;
        }
    }

    @Override
    public boolean ListPushFirst(Object data) {
        if (this.head != null) {
            Node temp = this.head;
            Node newNode = new Node(null,data);
            newNode.data = data;
            newNode.next = temp;
            this.head = newNode;
            Node x = this.head;
            while(x.next != null){
                x = x.next;
            }
            this.last = x;
            this.size++;
            return true;
        }else{
            Node newNode = new Node(null,data);
            newNode.data = data;
            this.head = this.last = newNode;
            this.size++;
            return true;
        }
    }

    @Override
    public boolean ListPushBack(Object data) {
        if (this.last != null) {
            Node temp = this.last;
            Node newNode = new Node(null,data);
            newNode.data = data;
            temp.next = newNode;
            this.last = newNode;
            this.size++;
            return true;
        } else {
            Node newNode = new Node(null,data);
            newNode.data = data;
            this.last = newNode;
            this.size++;
            return true;
        }
    }

    @Override
    public boolean ListInsert(Object data) {
        int index = contains("火车尾");
        Node temp = this.head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node newNode = new Node(null,data);
        newNode.next = temp.next;
        temp.next = newNode;
        this.size++;
        return true;
    }

    @Override
    public boolean ListPopFront() {
        Node temp = this.head.next;
        this.head = temp;
        this.size--;
        return true;
    }

    @Override
    public boolean ListPopBack() {
        if(this.head.data.equals(this.last.data)){
            this.head = null;
            this.last = null;
            this.size--;
            return true;
        }else{
            Node temp = this.head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            this.last = temp;
            temp.next = null;
            this.size--;
            return true;
        }
    }

    @Override
    public boolean ListErase() {
        int index = contains("车厢3");
        Node temp = this.head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        this.size--;
        return true;
    }

    @Override
    public void printLink() {
        Object[] data = this.toArray();
        for(Object temp:data){
            System.out.println(temp);
        }
    }

    private Object[] toArray(){
        Object[] result = new Object[this.size];
        int i = 0;
        for(Node temp=this.head; temp!=null; temp=temp.next){
            result[i++] = temp.data;
        }
        return result;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int contains(Object data) {
        if(data == null){
            int i = 0;
            for(Node temp=this.head; temp!=null; temp=temp.next){
                if(temp.data == null){
                    return i;
                }
                i++;
            }
        }else{
            int i = 0;
            for(Node temp=this.head; temp!=null; temp=temp.next){
                if(data.equals(temp.data)){
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}

public class Test{
    public static void main(String[] args){
        ILink link = new LinkImpl();
        link.ListPushFirst("车厢2");
        link.ListPushFirst("车厢1");
        link.ListPushFirst("火车头");
        link.ListPushBack("火车尾");
        link.ListInsert("车厢3");
        System.out.println(link.contains("车厢2"));
        link.printLink();
        System.out.println("-----------------");
        link.ListErase();
        link.printLink();
    }
}
