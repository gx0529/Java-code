
interface ILink {
    /**
     * 链表增加节点操作
     * @param data 节点内容
     * @return
     */
    boolean add(Object data);

    /**
     * 判断指定内容节点在链表中是否存在
     * @param data 要判断的内容
     * @return 返回找到的节点索引
     */
    int contains(Object data);

    /**
     * 删除指定内容节点
     * @param data
     * @return
     */
    boolean remove(Object data);

    /**
     * 根据指定下标修改节点内容
     * @param index 索引下标
     * @param newData 替换后的内容
     * @return 替换之前的节点内容
     */
    Object set(int index,Object newData);

    /**
     * 根据指定下标返回节点内容
     * @param index
     * @return
     */
    Object get(int index);

    /**
     * 链表清空
     */
    void clear();

    /**
     * 将链表转为数组
     * @return 返回所有节点内容
     */
    Object[] toArray();

    /**
     * 链表长度
     * @return
     */
    int size();

    /**
     * 遍历链表
     */
    void printLink();
}

class LinkImpl implements ILink{
    private Node head;
    private Node last;
    private int size;

    private class Node{
        private Node prev;
        private Object data;
        private Node next;
        public Node(Node prev, Object data, Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
    @Override
    public boolean add(Object data) {
        Node temp = this.last;
        Node newNode = new Node(temp, data, null);
        newNode.data = data;
        this.last = newNode;
        if(this.head == null){
            this.head = newNode;
        }
        else{
            temp.next = newNode;
        }
        this.size++;
        return true;
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
                if(temp.data.equals(data)){
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object data) {
        if(data == null){
            for(Node temp=this.head; temp!=null; temp=temp.next){
                if(temp.data == data){
                    unLink(temp);
                    return true;
                }
            }
        }else{
            for(Node temp=this.head; temp!=null; temp=temp.next){
                if(temp.data.equals(data)){
                    unLink(temp);
                    return true;
                }
            }
        }
        return false;
    }

    private Object unLink(Node x){
        Object elementData = x.data;
        Node prev = x.prev;
        Node next = x.next;
        if(prev == null){
            this.head = next;
        }else{
            prev.next = next;
            x.prev = null;
        }
        if(last == null){
            this.last = prev;
        }else{
            next.prev = prev;
            x.next = null;
        }
        x.data = null;
        this.size--;
        return elementData;
    }
    @Override
    public Object set(int index, Object newData) {
        if(!(isLinkIndex(index))){
            return null;
        }else{
            Node node = node(index);
            Object elementData = node.data;
            node.data = newData;
            return elementData;
        }
    }

    @Override
    public Object get(int index) {
        if(!(isLinkIndex(index))){
            return null;
        }
        return node(index).data;
    }

    private Node node(int index){
        if(index < (this.size>>1)){
            Node temp = this.head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp;
        }
        Node temp = this.last;
        int i = 0;
        for(i = size-1; i>index; i--){
            temp = temp.prev;
        }
        return temp;
    }
    @Override
    public void clear() {
        for(Node temp=head; temp!=null;){
            temp.data = null;
            Node node = temp.next;
            temp = temp.prev = temp.next = null;
            temp = node;
            this.size--;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for(Node temp=head; temp!=null; temp=temp.next){
            result[i++] = temp.data;
        }
        return result;
    }

    @Override
    public int size() {
        return this.size();
    }

    @Override
    public void printLink() {
        Object[] data = this.toArray();
        for(Object temp:data){
            System.out.println(temp);
        }
    }
    private boolean isLinkIndex(int index){
        return index>=0 && index<this.size;
    }
}

public class Test{
    public static void main(String[] args){
        ILink link = new LinkImpl();
        link.add("火车头");
        link.add("车厢1");
        link.add("车厢2");
        link.add("车厢尾");
        System.out.println(link.get(1));
        link.printLink();
    }
}
