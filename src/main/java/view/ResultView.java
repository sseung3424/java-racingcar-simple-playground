package view;

import java.util.List;

public class ResultView {
  public static void printWinners(List<String> winners) {
    String result = String.join(", ", winners);
    System.out.println(result + "가 최종 우승했습니다.");
  }

}
