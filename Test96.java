
ÿ������ʼ�����һ���������ƺ�һ��������ɣ��� @ ���ŷָ���

���磬�� alice@leetcode.com�У� alice �Ǳ������ƣ��� leetcode.com ��������

����Сд��ĸ����Щ�����ʼ������ܰ��� ',' �� '+'��

����ڵ����ʼ���ַ�ı������Ʋ����е�ĳЩ�ַ�֮����Ӿ�㣨'.'��������������ʼ�����ת��������������û�е��ͬһ��ַ�����磬"alice.z@leetcode.com�� �� ��alicez@leetcode.com�� ��ת����ͬһ�����ʼ���ַ�� ����ע�⣬�˹�����������������

����ڱ�����������ӼӺţ�'+'���������Ե�һ���Ӻź�����������ݡ����������ĳЩ�����ʼ������� m.y+name@email.com ��ת���� my@email.com�� ��ͬ�����˹�����������������

����ͬʱʹ������������

���������ʼ��б� emails�����ǻ����б��е�ÿ����ַ����һ������ʼ���ʵ���յ��ʼ��Ĳ�ͬ��ַ�ж��٣�

 

ʾ����

���룺["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
�����2
���ͣ�ʵ���յ��ʼ����� "testemail@leetcode.com" �� "testemail@lee.tcode.com"��

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> strings = new HashSet<>();
        for (String email : emails) {
            int plusPos = email.indexOf("+");
            int twoPos = email.indexOf("@");
 
            String substring = email.substring(0, plusPos);
            String substring1 = email.substring(twoPos, email.length());
            strings.add(substring.replace(".", "") + substring1);
            
        }
        return strings.size();
    }
}