
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        List<Character> list = new ArrayList<>();
        char[] temp = A.toCharArray();
        for(int i=0; i<n; i++){
            if(temp[i]!='(' && temp[i]!=')'){
                return false;
            }
            if(temp[i] == '('){
                list.add(temp[i]);
            }
            if(temp[i] == ')'){
                if(list.size() == 0){
                    return false;
                }
                list.remove(list.size()-1);
            }
        }
        if(list.size() == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = null;
        if(scanner.hasNext()){
            str = scanner.nextLine();
        }
        Parenthesis test = new Parenthesis();
        test.chkParenthesis(str,str.length());
    }
}