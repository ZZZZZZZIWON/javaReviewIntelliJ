package homework0425_ch06;

import java.util.Scanner;
import java.util.Random;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // 입력 받는 숫자에 맞는 문자열을 rps 배열에 저장
        String[] rps = {"가위", "바위", "보"};
        System.out.print("이름을 입력하세요 >>");
        String name = scan.nextLine();

        while (true) {
            System.out.print(name + ">>");
            int keyByPlayer = scan.nextInt(); // player가 입력한 key를 keyByPlayer 변수에 저장

            if (keyByPlayer == 4 ) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            if (keyByPlayer < 1 || keyByPlayer > 4) {
                System.out.println("다시 입력하세요.");
                continue;
            }

            // 컴퓨터가 난수를 생성함 (1, 2, 3)
            int keyByCom = random.nextInt(3) + 1;

            // 입력한 숫자에 맞는 가위, 바위, 보 문자열을 저장 (both keyByPlayer and keyByCom)
            // 1 입력 -> rps[0]("가위")가 keyByPlayerStr / keyByComStr에 저장
            // 2 입력 -> rps[1]("바위")가 keyByPlayerStr / keyByComStr에 저장
            // 3 입력 -> rps[2]("보")가 keyByPlayerStr / keyByComStr에 저장
            String keyByPlayerStr = rps[keyByPlayer - 1];
            String keyByComStr = rps[keyByCom - 1];

            String result = "";
            if (keyByPlayer == keyByCom) {
                result = "비겼습니다.";
            }
            else if ( // 컴퓨터가 이기는 경우
                    (keyByPlayer == 1 && keyByCom == 2) || // player (1 - 가위) && computer (2 - 주먹)
                            (keyByPlayer == 2 && keyByCom == 3) || // player (2 - 주먹) && computer (3 - 보)
                            (keyByPlayer == 3 && keyByCom == 1))   // player (3 - 보)   && computer (1 - 가위)
            {
                result = "컴퓨터가 이겼습니다.";
            } else {
                result = name + "(이/가) 이겼습니다.";
            }

            // 입력한 숫자에 맞는 문자열 & 결과 출력
            System.out.println(name+"("+ keyByPlayerStr + ") : 컴퓨터(" + keyByComStr + ")");
            System.out.println(result);
        }
    }
}
