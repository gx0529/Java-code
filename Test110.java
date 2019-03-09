
public class Test3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] strs = str.split(" ");
            int[] data = new int[strs.length];
            for(int i=0; i<data.length; i++){
                data[i] = Integer.parseInt(strs[i]);
            }
            for(int i=0; i<data.length-1; i++){
                int count = 1;
                for(int j=i+1; j<data.length; j++){
                    if(data[j] == data[i]){
                        count++;
                    }
                }
                if(count >= data.length/2){
                    System.out.println(data[i]);
                }
            }
        }
    }
}