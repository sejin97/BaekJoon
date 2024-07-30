package step_1.no_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 세 개의 정수 A, B, C를 입력 받기
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        // A + B + C 계산
        long result = A + B + C;

        // 결과 출력
        System.out.println(result);

        // Scanner 객체 닫기
        scanner.close();
    }
}
