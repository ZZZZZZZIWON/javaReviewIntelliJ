package homework_0509;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex11_Vector {
    // Vector를 생성
    Vector<String> countries = new Vector<String>();
    Vector<String> capitals = new Vector<String>();

    public Ex11_Vector() {
        // 생성자 method를 이용 -> 나라와 수도 정보 저장
        countries.add("체코");
        capitals.add("프라하");
        countries.add("영국");
        capitals.add("런던");
        countries.add("독일");
        capitals.add("베를린");
        countries.add("프랑스");
        capitals.add("파리");
        countries.add("태국");
        capitals.add("방콕");
        countries.add("미국");
        capitals.add("워싱턴");
        countries.add("스위스");
        capitals.add("제네바");
        countries.add("오스트리아");
        capitals.add("빈");
        countries.add("그리스");
        capitals.add("아테네");
    }

    // Method 1 ] 나라와 수도를 입력받아서 Vector에 추가
    private void input() {
        Scanner scan = new Scanner(System.in);
        // size() method를 이용해서 현재 Vector에 저장되어 있는 정보들의 수를 파악
        System.out.println("현재 " + countries.size() + "개 나라와 수도가 입력되어 있습니다");
        while (true) {
            System.out.print("나라와 수도 입력 " + (countries.size() + 1) + ">>");
            // 공백을 기준으로 첫 번째 nextToken은 country 변수에 저장
            StringTokenizer st = new StringTokenizer(scan.nextLine(), " ");
            String country = st.nextToken();

            // 첫 번째 입력받은 nextToken이 "그만"과 일치할 시 입력 종료
            if (country.equals("그만")) {
                System.out.println("입력을 종료합니다");
                break;
            }
            // 공백 뒤 두 번째 token은 capital 변수에 저장
            String capital = st.nextToken();

            // Vector에 이미 존재하는 나라와 수도는 pass
            if (countries.contains(country)) {
                System.out.println(country + "은/는 이미 입력된 나라입니다");
                continue;
            }
            // Vector에 추가
            countries.add(country);
            capitals.add(capital);
        }
    }

    private void quiz() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int index;
        String country;
        String capital;

        while (true) {
            // countries Vector의 크기를 이용해 랜덤한 index를 구한다
            index = rand.nextInt(countries.size());
            // index에 해당하는 나라를 country 변수에 저장
            country = countries.get(index);
            System.out.print(country + "의 수도는? ");
            capital = scan.nextLine();

            if (capital.equals("그만")) {
                System.out.println("퀴즈를 종료합니다.");
                break;
            }

            // 입력받은 capital과 해당 나라의 수도를 비교하여 결과 출력
            if (capital.equals(capitals.get(index))) {
                System.out.println("정답");
            } else {
                System.out.println("오답입니다");
            }
        }
    }

    public static void main(String[] args) {
        // 게임을 진행할 객체 생성
        Ex11_Vector ex = new Ex11_Vector();

        // System.out.println(ex.v);
        System.out.println("===== 수도 맞추기 게임을 시작합니다 =====");

        // 입력받는 숫자를 저장할 gameNum 변수
        // 입력받는 숫자를 저장할 gameNum 변수
        int gameNum = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("입력: 1    퀴즈: 2   종료: 3");
            gameNum = scan.nextInt();
            if (gameNum == 3) {
                System.out.println("게임을 종료합니다");
                break;
            } else if (gameNum == 2) {
                ex.quiz();
            } else if (gameNum == 1) {
                ex.input();
            } else {
                System.out.println("다시 입력하세요");
            }
        }
    }
}
