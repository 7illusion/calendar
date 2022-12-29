
package honux.calendar;

import java.util.Scanner;

// 프로젝트 창 열고 닫기 alt + 1   클릭 + 스페이스 바 로 클래스 코딩 볼 수 있음   메소드 위치 및 찿기 ctrl + b
public class calendar {
    public static void main(String[] args) {
        System.out.println("일"+"\t"+"월"+"\t"+"화"+"\t"+"수"+"\t"+"목"+"\t"+"금"+"\t"+"토");
        System.out.println("--------------------------");
        System.out.println("1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"\t"+"5"+"\t"+"6"+"\t"+"7");
        System.out.println("8"+"\t"+"9"+"\t"+"10"+"\t"+"11"+"\t"+"12"+"\t"+"13"+"\t"+"14");
        System.out.println("15"+"\t"+"16"+"\t"+"17"+"\t"+"18"+"\t"+"19"+"\t"+"20"+"\t"+"21");
        System.out.println("22"+"\t"+"23"+"\t"+"24"+"\t"+"25"+"\t"+"26"+"\t"+"27"+"\t"+"28");

        System.out.println("두 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number+number2);

    }
}
