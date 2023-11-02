package train.Nov02.Account;

import java.util.Scanner;
/**
 * 요구명세서
 * 예금,출금,잔고 기능을 가진 은행 프로그램 제작
 * */
public class AccountExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 키보드 입력을 받기 위한 Scanner 객체 생성
        boolean run = true;  // 프로그램 실행 여부를 나타내는 변수
        int money;  // 입금 및 출금 금액을 저장하는 변수
        Account account = new Account("123-12345-123456");  // 계좌 객체 생성 및 초기화

        while (run) {  // run이 true인 동안 반복
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------");
            System.out.print("선택>");  // 사용자에게 선택 메뉴를 입력하도록 요청
            int menuNo = sc.nextInt();  // 사용자가 선택한 메뉴 번호를 읽음

            switch (menuNo) {
                case 1:
                    System.out.print("예금액>");  // 사용자에게 입금액을 입력하도록 요청
                    money = sc.nextInt();  // 사용자가 입력한 금액을 읽음
                    account.deposit(money);  // 계좌에 입금
                    break;
                case 2:
                    System.out.print("출금액>");  // 사용자에게 출금액을 입력하도록 요청
                    money = sc.nextInt();  // 사용자가 입력한 금액을 읽음
                    account.withdraw(money);  // 계좌에서 출금
                    break;
                case 3:
                    System.out.print("잔고액>");  // 현재 잔고를 출력
                    account.showBalance();
                    break;
                case 4:
                    System.out.print("프로그램 종료");  // 프로그램 종료 메시지 출력
                    run = false;  // run을 false로 설정하여 프로그램 종료
                    break;
                default:
                    System.out.println("다시 입력해주세요");  // 잘못된 메뉴 번호 입력 시 안내 메시지 출력
                    break;
            }  // switch
        }  // while

        sc.close();  // Scanner 객체 닫기
    }
}