package homework0425_ch06;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요(빈칸, 영어, 한글 가능)");

        String text = scan.nextLine();
        StringBuffer sb = new StringBuffer(text);

        System.out.println(sb); // 입력받은 문자열 1회 출력

        // 맨 앞의 문자(index 0)를 지우고(delete) 맨 뒤에 추가(append)
        // 1회 실행 코드
//        char first = sb.charAt(0); // 맨 앞의 문자
//        sb.deleteCharAt(0);
//        sb.append(first);
//        System.out.println(sb);

        // 반복문
        while (true) {
            char first = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(first);
            System.out.println(sb);
            if (sb.toString().equals(text)) {
                // sb에 들어있는 문자열과 입력받은 문자열(text)이 같다면 반복문 탈출
                break;
            }
        }
    }

}
