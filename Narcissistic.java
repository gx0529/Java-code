
public class Narcissistic{
    public static void main(String[] args){
        int m1, m2, m3;
        for(int i=100; i<=999; i++){
            m1 = i%10;
            m2 = (i/10)%10;
            m3 = i/100;
            if(i == m1*m1*m1+m2*m2*m2+m3*m3*m3){
                System.out.print(i+" ");
            }
        }
    }
}


