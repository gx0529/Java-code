


����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���


����һ���ַ���A�����ĳ���n���뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���


����������

"(()())",6
���أ�true

����������

"()a()()",7
���أ�false

import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = A.toCharArray();
        for(int i=0; i<n; i++){
            if(!(arr[i] >= 'a' && arr[i] <= 'z')){
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                } else if(is(stack.peek(),arr[i])){
                    stack.pop();
                } else{
                    stack.push(arr[i]);
                }
            }
        }
        return stack.size() == 0;
    }
    public boolean is(char c1, char c2){
        return (c1=='('&&c2==')') || (c1=='['&&c2==']') || (c1=='{'&&c2=='}');
    }
}


public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<n; i++){
            if(A.charAt(i) == '('){
                stack.push(A.charAt(i));
            } else if(A.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            } else{
                return false;
            }
        }
        return stack.size() == 0;
    }
}