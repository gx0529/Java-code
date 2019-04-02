
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            int N = scanner.nextInt();
            scanner.nextLine();
            int[] credit = new int[N];
            for(int i=0; i<N; i++){
                credit[i] = scanner.nextInt();
            }
            scanner.nextLine();
            double sum = 0;
            int[] score = new int[N];
            for(int i=0; i<N; i++){
                score[i] = scanner.nextInt();
            }
            scanner.nextLine();
            for(int i=0; i<N; i++){
                if(90<=score[i] && score[i]<=100) sum += 4.0*credit[i];
                if(85<=score[i] && score[i]<=89) sum += 3.7*credit[i];
                if(82<=score[i] && score[i]<=84) sum += 3.3*credit[i];
                if(78<=score[i] && score[i]<=81) sum += 3.0*credit[i];
                if(75<=score[i] && score[i]<=77) sum += 2.7*credit[i];
                if(72<=score[i] && score[i]<=74) sum += 2.3*credit[i];
                if(68<=score[i] && score[i]<=71) sum += 2.0*credit[i];
                if(64<=score[i] && score[i]<=67) sum += 1.5*credit[i];
                if(60<=score[i] && score[i]<=63) sum += 1.0*credit[i];
                if(score[i]<60)  sum += 0*credit[i];
            }
            float credits = 0;
            for(int i=0; i<N; i++){
                credits += credit[i];
            }
            System.out.println(String.format("%.2f", sum/credits));
        }
    }
}