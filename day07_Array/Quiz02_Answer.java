package day07_Array;

import java.util.Scanner;
	/*
	 * "¦��"�Ǵ� "Ȧ��" �Է½� ¦���� ¦���� ���� ���, Ȧ���� Ȧ���� ���� ���
	 * ¦��, Ȧ�� �Է�: ¦��
	 * ¦�� :10
	 * ¦�� :54
	 * ¦�� :30
	 * 
	 * ¦��, Ȧ�� �Է�: Ȧ��
	 * Ȧ�� : 13
	 * Ȧ�� : 17
	 * Ȧ�� : 25
	 */
class Quiz02_Answer {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.println("¦, Ȧ �Է� : ");
		odd_even = input.next();
		if(odd_even.equals("¦��"))/*equals�� ����ؾ��Ѵ�*/ {
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i]%2 ==0) {
				System.out.println(odd_even+":"+arr[i]);
			}
		}
		}else {
			for(int i=1 ; i<arr.length ; i++) {
				if(arr[i]%2 ==1) {
					System.out.println(odd_even+":"+arr[i]);
				}
			}
		}
		}
	}

