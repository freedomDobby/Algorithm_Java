import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 전화 횟수
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} // 전화 시간 기억 저장

		// 민식이 요금제가 더 싼지, 영식이 요금제가 더 싼지 비교
		int M = 0;
		int Y = 0;
		for (int i = 0; i < arr.length; i++) {
			Y += (arr[i] / 30+1) *10;
			M += (arr[i] / 60+1) *15;
		}
//		System.out.println(M);
//		System.out.println(Y);
		
		  if (M < Y) {
	            System.out.println("M " + M);
	        } else if (M > Y) {
	            System.out.println("Y " + Y);
	        } else {
	            System.out.println("Y M " + M);
	        }
	    }
	}