import java.util.Scanner;

public class Bronze_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		int min = 60 * h + m;
		min += c;
		
		int hour = (min / 60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
	} 
   
}
