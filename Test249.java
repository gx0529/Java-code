


��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
�ж��������Ƿ��и�������

public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0){
            return false;
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}