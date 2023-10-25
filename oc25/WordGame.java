package train.oc25;

import java.util.Scanner;
import java.util.Vector;
/**
 * 요구명세서
 * 타자연습게임
 * WordGenerator라는 쓰레디가 Vector에 2초마다 단어를 하나씩 추가
 * 단어를 입력해서 Vector랑 맞으면 삭제
 * */
public class WordGame {

    Vector words = new Vector();
    String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
    int interval = 2 * 1000; // 2초
    WordGenerator wg = new WordGenerator();

    public static void main(String args[]) {
        WordGame game = new WordGame();
        game.wg.start(); // . 단어를 생성하는 쓰레드를 실행시킨다
        Vector words = game.words;
        while (true) {
            System.out.println(words);
            System.out.println("소녀시대 그룹원을 입력하세요");
            String prompt = ">>";
            System.out.print(prompt);
            // . 화면으로부터 라인단위로 입력받는다
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();
            int index = words.indexOf(input); // words . 입력받은 단어를 에서 찾는다
            if (index != -1) { // 찾으면
                words.remove(index); // words . 에서 해당 단어를 제거한다
            }
        }
    }
    class WordGenerator extends Thread {
        public void run() {
            while (true) {
                // 1. interval(2 ) data 초 마다 배열 의 값 중 하나를 임의로 선택해서
                int rand = (int) (Math.random() * data.length);
                // 2. words . 에 저장한다
                words.add(data[rand]);
                try {
                    Thread.sleep(interval); // 2 (interval) . 초 동안 쉰다
                } catch (Exception e) {
                }
            }
        }
    }
}