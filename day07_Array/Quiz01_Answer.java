package day07_Array;

public class Quiz01_Answer {
	public static void main(String[] args) {
		/*
		 * �ݺ����� �̿��ؼ� arr�� ����Ǿ� �ִ� ¦���� ���� 
		 * Ȧ���� ���� ���� ����Ͻÿ�
		 * ¦�� : 10
		 * ¦�� : 54
		 * Ȧ�� : 13
		 * Ȧ�� : 17
		 * Ȧ�� : 25
		 * ¦�� : 30
		 */
		int arr[] = new int[] {10,54,13,17,25,30};
		
		//�ش�:
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i] % 2 ==0) {
				System.out.println("¦�� : "+arr[i]);
			}else {
				System.out.println("Ȧ�� : "+arr[i]);
			}
		}
	}
}
