package train.oc31;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
/**
 * 요구명세서
 * 학년 반별 총점을 구하는 프로그램
 * Map 연습
 * */
class GradeStudent {
    String name;
    boolean isMale; // 성별
    int hak; // 학년
    int ban; // 반
    int score;
    GradeStudent(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }
    String getName() { return name;}
    boolean isMale() { return isMale;}
    int getHak() { return hak;}
    int getBan() { return ban;}
    int getScore() { return score;}
    public String toString() {
        return String.format("[%s, %s, %d학년 %d 반, %3d점 ]", name, isMale ?
                "남 ":"여", hak, ban, score);
    }
}
class GradeStudentExample {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("강윤식", true, 1, 1, 300),
                new Student("권진철", true, 1, 1, 250),
                new Student("김지원", false, 1, 3, 200),
                new Student("남원우", true, 1, 2, 150),
                new Student("노하은", false, 1, 2, 100),
                new Student("박석은", true, 1, 2, 50),
                new Student("변재혁", true, 2, 3, 100),
                new Student("신수진", false, 2, 3, 150),
                new Student("유지호", true, 1, 3, 200),
                new Student("이무현", true, 2, 1, 300),
                new Student("이양진", false, 2, 1, 250),
                new Student("이지연", false, 2, 1, 200),
                new Student("이창규", true, 2, 2, 150),
                new Student("차소영", false, 2, 2, 100),
                new Student("최경락", true, 2, 2, 50),
                new Student("최영주", false, 2, 1, 100),
                new Student("최재혁", true, 2, 3, 150),
                new Student("최지혜", false, 2, 3, 200)
        };
        Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan =
                Stream.of(stuArr)
                        .collect(
                                groupingBy(
                                        Student::getHak,
                                        groupingBy(
                                                Student::getBan,
                                                summingLong(Student::getScore)
                                        )
                                )
                        );
        for(Object e : totalScoreByHakAndBan.entrySet()) {
            System.out.println(e);
        }
    } // main의 끝
}