package www.bit.java.util;

public class Test1{
    public static void main(String[] args) {
        Integer a = 55;
        Integer b = 55;
        //==比较的是值，b会复用已有对象，即a与b会指向同一块空间，所以为true
        System.out.println(a==b);
        //只要有new就会重新产生空间，这时不会再复用已有对象，指向两个完全不同的空间，即为false
        System.out.println(a==new Integer(55));
        //equals比较的是内容，两块空间的内容完全相同，即为true
        System.out.println(a.equals(new Integer(55)));
        Integer c = 129;
        Integer d = 129;
        //对于Integer 在-128~127之间赋值，在Integer常量池产生就会复用已有对象，超出这个范围就会
        //重新开辟空间，即使c与d的内容相等，但却是两块不同的空间，==比较的是值，即为false
        System.out.println(c==d);
    }
}