package day07_Array;

import java.util.Scanner;
	/*
	 * "Â¦¼ö"¶Ç´Â "È¦¼ö" ÀÔ·Â½Ã Â¦¼ö¸é Â¦¼öÀÇ °ª¸¸ Ãâ·Â, È¦¼ö¸é È¦¼öÀÇ °ª¸¸ Ãâ·Â
	 * Â¦¼ö, È¦¼ö ÀÔ·Â: Â¦¼ö
	 * Â¦¼ö :10
	 * Â¦¼ö :54
	 * Â¦¼ö :30
	 * 
	 * Â¦¼ö, È¦¼ö ÀÔ·Â: È¦¼ö
	 * È¦¼ö : 13
	 * È¦¼ö : 17
	 * È¦¼ö : 25
	 */
class Quiz02_Answer {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.println("Â¦, È¦ ÀÔ·Â : ");
		odd_even = input.next();
		if(odd_even.equals("Â¦¼ö"))/*equals¸¦ »ç¿ëÇØ¾ßÇÑ´Ù*/ {
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

