package racing.view;

import java.util.Scanner;

public class RacingView {
    static Scanner scanner = new Scanner(System.in);

    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public int inputTimes() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(scanner.nextLine());
    }
}
