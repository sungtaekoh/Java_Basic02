package day07_Array;
//국비지원 강의 복습
public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 배열
		 * - 같은 자료형으로 여러개의 공간을 만들어 사용하는 것
		 * - 자료형 [] 변수명(배열명)
		 * - 자료형 배열명(변수명) []
		 * - index(첨자) : 0번째부터 시작 
		 */
		
		int[] arr = new int[5];
		/*
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		System.out.println("arr 0 : " +arr[0]);
		System.out.println("arr 1 : " +arr[1]);
		System.out.println("arr 2 : " +arr[2]);
		System.out.println("arr 3 : " +arr[3]);
		System.out.println("arr 4 : " +arr[4]);
		
		System.out.println(arr.length);//공간의 개수를 알려준다
		*/
		
		
		//위의 출력을 반복문을 통해 만들어보자
		for(int i =0; i< arr.length; i++) {
			arr[i] = (i + 1) * 100;
		System.out.println(arr[i]);
		}		
		System.out.println("arr.length : "+arr.length);
		//배열 초기화
//		두개 다 같은 양식
//		int arr01 [] = new int [] {10,20,30,40,50};
		int arr01 [] = {10,20,30,40,50};
		
		for(int A = 0 ; A<arr.length; A++) {
			System.out.println( arr01[A]);
		}
		System.out.println(arr01.length);		
		}
		}
