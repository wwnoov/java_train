package train.Nov03;
/**
 * 요구명세서
 * 문자열 배열을
 * 	A
 *  C   B
 * 	D   E   F
 *  J   I   H   G
 *  K   L   M   N   O
 *  다음과 같이 출력하시오.
 * */
public class PrintAlphabet {
    public static void main(String[] args) {

        final int len = 5;
        char startA = 'A';
        char[][] c = new char[5][5];

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) { // o
                for (int j = 0; j <= i; j++) {

                    c[i][j] = startA++;

                }
            } else if (i % 2 == 1) {
                for (int j = i; j >= 0; j--) {

                    c[i][j] = startA++;

                }
            }
        }

        // 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

}