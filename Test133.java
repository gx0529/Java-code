public class UnusualAdd {
	public int addAB(int A, int B) {
		if(B==0)
			return A;
		int sum = A ^ B; //��ӵ�����λ
		int jin = (A & B) << 1; //��λ�������
		return addAB(sum, jin);
	}
}
