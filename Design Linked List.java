package www.bit.java;

/**
 *设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。
 * val 是当前节点的值，next 是指向下一个节点的指针/引用。
 * 如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 *
 * 在链表类中实现这些功能：
 *
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 */
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
}

public class Test2{
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.addAtHead(8);
        System.out.println(myLinkedList.get(1));
        myLinkedList.addAtTail(81);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(26);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.Print();
    }
}