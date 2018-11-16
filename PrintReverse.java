package www.bit.java.util;

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




