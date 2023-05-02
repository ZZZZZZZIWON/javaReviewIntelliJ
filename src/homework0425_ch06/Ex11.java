package homework0425_ch06;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(">> ");
        String sentence = scan.nextLine();
//        StringBuffer sb = new StringBuffer(sentence);

        while (true) {
            System.out.print("명령 : ");
            String command = scan.nextLine();
            if(command.equals("그만")) { // "그만"이 입력되면 프로그램 종료
                break;
            }
            // "!"를 기준으로 나눠서 partCommand 배열에 저장
            String[] partCommand = command.split("!");

            if (partCommand.length != 2) {
                System.out.println("잘못된 명령입니다.");
                return;
            }

            String word = partCommand[0]; // 수정하고 싶은 문자열
            String replaced = partCommand[1]; // 바꿀 문자열

            if (sentence.contains(word)) {
                // 입력받은 문자열이 입력받은 명령의 word부분을 포함하고 있어야 변경 가능
                String result = sentence.replace(word, replaced);
                System.out.println(result);
            }
            else {
                System.out.println("찾을 수 없습니다.");
            }
        }

    }
}

