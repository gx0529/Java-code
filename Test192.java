public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// The total number of nodes
		int n = scanner.nextInt();
		// The address of the head node
		int headAddress = scanner.nextInt();
		// key �ǽ���ַ��value �� value �� next
		// ���� 12345 { 1, -1 } ���ֽṹ
		// �����ҵ���Щ�����Ҫ����
		HashMap<Integer, int[]> addressToNode = new HashMap<>();
		// key �ǽ��� key, value �ǽ��ĵ�ַ
		// �����������ṹ
		TreeMap<Integer, Integer> keyToAddress = new TreeMap<>();
		// The n lines of the node description
		// It's guaranteed that
		// 1) all the keys are distinct.
		// 2) there is no cycle in the linked list.
		for (int i = 0; i < n; i++) {
			int address = scanner.nextInt();
			int key = scanner.nextInt();
			int nextAddress = scanner.nextInt();
			int[] pair = new int[] { key, nextAddress };
			addressToNode.put(address, pair);
		}
		// �����Ŀ�ľ��Ǵ� head ��ʼ���������е� n ����㣬�ҳ���Ҫ����Ľ��
		int next = headAddress;
		int length = 0;
		while (next != -1) {
			int[] pair = addressToNode.get(next);
			keyToAddress.put(pair[0], next);
			next = pair[1];
			length++;
		}
		System.out.format("%d ", length);
		for (Map.Entry<Integer, Integer> entry : keyToAddress.entrySet()) {
			int key = entry.getKey();
			int address = entry.getValue();
			System.out.format("%05d\n%05d %d ", address, address, key);
		}
		System.out.println(-1);
	}
}