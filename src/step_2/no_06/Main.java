package step_2.no_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 시각 입력
        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();

        // 요리하는 데 필요한 시간 입력
        int cookingTime = scanner.nextInt();

        // 오븐구이가 끝나는 시각 계산
        int endHour = currentHour;
        int endMinute = currentMinute + cookingTime;

        if (endMinute >= 60) {
            endHour += endMinute / 60;
            endMinute %= 60;
        }

        if (endHour >= 24) {
            endHour %= 24;
        }
        System.out.println( endHour + " " + endMinute);
    }
}
