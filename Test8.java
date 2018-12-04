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
    //从尾到头打印单链表
    void PrintReverse();
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
            this.head = newNode;
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

    @Override
    public void PrintReverse() {
        Node nodefirst = this.head;
        Node nodelast = this.last;
        System.out.println(this.last.data);
        while(nodelast != this.head) {
            nodefirst = this.head;
            while (nodefirst.next != nodelast) {
                nodefirst = nodefirst.next;
            }
            System.out.println(nodefirst.data);
            nodelast = nodefirst;
        }
    }
}

public class Test{
    public static void main(String[] args){
        ILink link = new LinkImpl();
        link.ListPushBack("火车头");
        link.ListPushBack("车厢1");
        link.ListPushBack("车厢2");
        link.ListPushBack("车厢3");
        link.ListPushBack("火车尾");
        link.printLink();
        System.out.println("==============");
        link.PrintReverse();
    }
}

//1.写两个线程，一个线程打印 1~52，另一个线程打印A~Z，
//打印顺序是12A34B...5152Z；
//
//2.编写一个程序，启动三个线程，三个线程的名称分别是 A，B，C；
//每个线程将自己的名称在屏幕上打印5遍，打印顺序是ABCABC...
//
//3.写3个线程，打印如下
//*Thread-0
//*Thread-0@Thread-1
//*Thread-0@Thread-1#Thread-2
//*Thread-0@Thread-1#Thread-2*Thread-0
//*Thread-0@Thread-1#Thread-2*Thread-0@Thread-1
//*Thread-0@Thread-1#Thread-2*Thread-0@Thread-1#Thread-2
//...
//重复30次






/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 1:
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2:
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 注意这五个元素可为任意顺序。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        int i, j;
//        for (i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                for (j=i+1; j<nums.length; j++) {
//                    if (nums[i] != nums[j]) {
//                        nums[i] = nums[j];
//                        nums[j] = val;
//                        break;
//                    }
//                }
//                if (j == nums.length) {
//                    return i;
//                }
//            }
//        }
//        return nums.length;
//    }
//}
//public class Test1{
//    public static void main(String[] args) {
//        int[] nums = new int[]{3,2,2,3};
//        System.out.println(new Solution().removeElement(nums, 3));
//    }
//}
//class Solution {
//    public boolean isHappy(int n) {
//        while(true){
//            int flag = getNext(n);
//            if(flag == 1){
//                return true;
//            }else{
//                n = flag;
//                if(n == 89){
//                    return false;
//                }
//            }
//        }
//    }
//    public int getNext(int num){
//        int result = 0;
//        result = result+((num%10)*(num%10));
//        num = num/10;
//        if(num == 0){
//            return result;
//        }else{
//            return result+getNext(num);
//        }
//    }
//}
//public class Test1 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().isHappy(19));
//    }
//}

//import java.util.concurrent.Callable;
////import java.util.concurrent.ExecutionException;
////import java.util.concurrent.FutureTask;
////
////class MyThread implements Callable<String>{
////    private Integer ticket = 10;
////    private String title;
////    public String call(){
////        for(int i=0; i<10; i++){
////            System.out.println("还剩下"+this.ticket--+"票");
////        }
////        return "票卖完了~";
////    }
////}
////public class Test1{
////    public static void main(String[] args) {
////        MyThread myThread = new MyThread();
////        FutureTask<String> futureTask = new FutureTask<>(myThread);
////        Thread thread = new Thread(futureTask);
////        Thread thread1 = new Thread(futureTask);
////        thread.start();
////        thread1.start();
////        try {
////            System.out.println(futureTask.get());
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        } catch (ExecutionException e) {
////            e.printStackTrace();
////        }
////    }
////}
////class Goods{
////    private String goodsName;
////    private int count;
////    //生产商品方法
////    public synchronized void set(String goodsName){
////        if(count>0){
////            System.out.println("商品还有库存~");
////            try {
////                //等待消费者消费
////                wait();
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
////        this.goodsName = goodsName;
////        count++;
////        System.out.println(Thread.currentThread().getName()+"生产"+goodsName+toString());
////        //唤醒等待消费的线程
////        notify();
////    }
////    //消费商品方法
////    public synchronized void get(){
////        if(count == 0){
////            System.out.println("商品已卖完~");
////            try {
////                //等待商品生产
////                wait();
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
////        count--;
////        System.out.println(Thread.currentThread().getName()+"消费"+goodsName+toString());
////        //唤醒生产者继续生产商品
////        notify();
////    }
////
////    @Override
////    public String toString() {
////        return " count = "+count;
////    }
////}
////
////class Consumer implements Runnable{
////    private Goods goods;
////    public Consumer(Goods goods) {
////        this.goods = goods;
////    }
////    @Override
////    public void run() {
////        goods.set("一套口红");
////    }
////}
////class Producer implements Runnable{
////    private Goods goods;
////    public Producer(Goods goods) {
////        this.goods = goods;
////    }
////    @Override
////    public void run() {
////        goods.get();
////    }
////}
////public class Test1{
////    public static void main(String[] args) throws InterruptedException {
////        Goods goods = new Goods();
////        Thread thread1 = new Thread(new Producer(goods),"消费者");
////        Thread thread2 = new Thread(new Consumer(goods),"生产者");
////        thread1.start();
////        thread2.start();
////    }
////}

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
//class Solution {
//    public boolean isPalindrome(int x) {
//        String str = ""+x;
//        char[] data = str.toCharArray();
//        char[] arr = new char[data.length];
//        for(int i = 0; i < data.length; i++){
//            arr[data.length-1-i] = data[i];
//        }
//        String str2 = new String(arr);
//        if(str.equals(str2)){
//            return true;
//        }else{
//            return false;
//        }
//    }
//}
//
//public class Test1{
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.isPalindrome(121));
//    }
//}