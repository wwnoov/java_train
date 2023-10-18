package com.myStudy.train.train1018;

import java.text.SimpleDateFormat;
import java.util.*;

/** 요구명세서
 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요. *
 * 번호, 제목, 내용, 작성자, 작성일 *
 * 목록에서는 조회, 등록, 종료
 * 상세화면에서는 수정, 삭제, 목록
 */
public class Board {

    // 게시판 데이터를 담을 ArrayList와 날짜 포맷을 위한 SimpleDateFormat 선언
    ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
    SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 게시판 객체를 생성
        new Board().start();
    }

    private void start() {
        // 무한 루프로 게시판 기능 실행
        while (true) {
            // 게시판 목록 출력
            printBoardList();

            System.out.println("1.조회  2.등록  0.종료>");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    read(); // 게시물 조회
                    break;
                case 2:
                    insert(); // 게시물 등록
                    break;
                case 0:
                    System.out.println("프로그램이 종료되었습니다.");
                    System.exit(0);
                    break;
            }
        }
    }

    private void printBoardList() {
        // 게시판 목록 출력
        System.out.println("=================================");
        System.out.println("번호\t제목\t작성자\t작성일");
        System.out.println("---------------------------------");
        for (int i = boardTable.size() - 1; i >= 0; i--) {
            HashMap<String, Object> board = boardTable.get(i);
            System.out.println(board.get("BOARD_NO")
                    + "\t" + board.get("TITLE")
                    + "\t" + board.get("USER_NAME")
                    + "\t" + format.format(board.get("REG_DATE")));
        }
        System.out.println("=================================");
    }

    private void read() {
        // 게시물 조회 메서드
        System.out.print("조회할 게시물 번호>");
        int boardNo = sc.nextInt();

        HashMap<String, Object> board = null;
        for (int i = 0; i < boardTable.size(); i++) {
            if (boardNo == (int) boardTable.get(i).get("BOARD_NO")) {
                board = boardTable.get(i);
            }
        }

        // 조회한 게시물 상세 정보 출력
        printBoardDetail(board);

        System.out.print("1.수정  2.삭제  0.목록>");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                update(board); // 게시물 수정
                break;
            case 2:
                delete(board); // 게시물 삭제
                break;
            case 0:
                break;
        }
    }

    private void printBoardDetail(HashMap<String, Object> board) {
        // 조회한 게시물의 상세 정보 출력
        System.out.println("=======================");
        System.out.println("번호\t: " + board.get("BOARD_NO"));
        System.out.println("-----------------------");
        System.out.println("작성자\t: " + board.get("USER_NAME"));
        System.out.println("-----------------------");
        System.out.println("작성일\t: " + format.format(board.get("REG_DATE")));
        System.out.println("-----------------------");
        System.out.println("제목\t: " + board.get("TITLE"));
        System.out.println("-----------------------");
        System.out.println("내용\t: " + board.get("CONTENT"));
        System.out.println("=======================");
    }

    private void delete(HashMap<String, Object> board) {
        // 게시물 삭제 메서드
        System.out.print("정말 삭제 하시겠습니까?(Y/N)>");
        sc.nextLine();
        String input = sc.nextLine();

        switch (input) {
            case "Y":
                for (int i = 0; i < boardTable.size(); i++) {
                    if (board.get("BOARD_NO") == boardTable.get(i).get("BOARD_NO")) {
                        boardTable.remove(i);
                        System.out.println("게시글이 삭제되었습니다.");
                        break;
                    }
                }
                break;
        }
    }

    private void update(HashMap<String, Object> board) {
        // 게시물 수정 메서드
        sc.nextLine();
        System.out.print("제목>");
        board.put("TITLE", sc.nextLine());
        System.out.print("내용>");
        board.put("CONTENT", sc.nextLine());

        System.out.println("게시글이 수정되었습니다.");
    }

    private void insert() {
        // 게시물 등록 메서드
        HashMap<String, Object> board = new HashMap<>();

        int max = 0;
        for (int i = 0; i < boardTable.size(); i++) {
            if (max < (int) boardTable.get(i).get("BOARD_NO")) {
                max = (int) boardTable.get(i).get("BOARD_NO");
            }
        }

        // 새로운 게시물 정보 입력
        board.put("BOARD_NO", max + 1);
        sc.nextLine();
        System.out.print("제목>");
        board.put("TITLE", sc.nextLine());
        System.out.print("내용>");
        board.put("CONTENT", sc.nextLine());
        System.out.print("작성자>");
        board.put("USER_NAME", sc.nextLine());
        board.put("REG_DATE", new Date());

        // 게시물을 게시판에 추가
        boardTable.add(board);

        System.out.println("작성하신 게시글이 등록되었습니다.");
    }
}