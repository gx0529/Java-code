
public class Practice149 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int i = 0;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int max = 0;
        List<String> res = new ArrayList<>();
        while (i < n){
            String[] str = bf.readLine().split(" ");
            int op = Integer.parseInt(str[0]);  //1������룬2����ȡ��
            int l = Integer.parseInt(str[1]);  //ľ���ĳ���
            max = 0;
            if (op == 1){
                list.add(l);
                count = count + l;
                for (int t : list){
                    if (t > max)
                        max = t;
                }
                int tmp1 = count - max;
                if (tmp1 > max){
                    res.add("Yes");}
                else {
                    res.add("No");
                }
            }else {
                count = count - l;
                for (int t : list){
                    if (t > max)
                        max = t;
                }
                int tmp2 = count - max;
                if (tmp2 > max){
                    res.add("Yes");}
                else {
                    res.add("No");
                }
            }
            i++;
        }
        System.out.println();
        for (String str : res)
            System.out.println(str);
    }

}
