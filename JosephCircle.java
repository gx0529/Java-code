package www.bit.java;


class MyLinkedList {
    int size;
    Node head ;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public MyLinkedList() {

    }

    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }
        Node tmp = head;
        if(head == null){
            return -1;
        }
        for(int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node tmp = head;
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
        newNode.next = null;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index > size || index < 0){
            return;
        }
        if(index == 0){
            addAtHead(val);
        } else{
            Node tmp = head;
            Node node = null;
            for (int i=0; i < index; i++) {
                node = tmp;
                tmp = tmp.next;
            }
            Node newNode = new Node(val);
            newNode.next = node.next;
            node.next = newNode;
            size++;
        }

    }

    public void deleteAtIndex(int index) {
        if(index >= size || index < 0){
            return;
        }
        if(index == 0){
            head = head.next;
        } else if(index == size-1){
            Node tmp = head;
            Node node = null;
            for(int i=0; i<index; i++){
                node = tmp;
                tmp = tmp.next;
            }
            node.next = null;
        } else{
            Node tmp = head;
            Node node = null ;
            for(int i=0; i<index; i++){
                node = tmp;
                tmp = tmp.next;
            }
            node.next = tmp.next;
        }
        size--;
    }

    public void Print(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.val+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    //单链表实现约瑟夫环
    public int JosephCircle(int k){
        //先将链表构成环
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        //结束条件是链表剩下最后一个结点
        Node cur = head;
        Node prev = null;
        while(cur.next != cur){
            for(int i=0; i<k-1; i++){
                prev = cur;
                cur = cur.next;
            }
            //此时cur就是要删除的节点
            prev.next = cur.next;
            cur = prev.next;
        }
        cur.next = null;
        return cur.val;
    }
}

public class Test2{
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        for(int i=1; i<=7; i++){
            myLinkedList.addAtTail(i);
        }
        System.out.println(myLinkedList.JosephCircle(4));
    }
}