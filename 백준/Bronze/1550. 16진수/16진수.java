import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next(); // 16진수 입력 받기

        int ans = Integer.parseInt(hex, 16); // 16진수를 10진수로 변환
        System.out.println(ans);
    }
}