import java.util.Scanner;

public class Bronze_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double score[] = new double[num];
		double max = 0;
		double sub = 0;

		for (int i = 0; i < num; i++) {
			score[i] = sc.nextInt();
		}

		for (int k = 0; k < num; k++) {
			if (max < score[k]) {
				max = score[k];
			}
		}
//		System.out.println(max);

		for (int j = 0; j < num; j++) {
			score[j] = score[j] / max * 100;
//			System.out.println(score[j]);
			sub += score[j];
		}
//		System.out.println(sub);
		double avg = sub / num;
		System.out.println(avg);
	}

}
