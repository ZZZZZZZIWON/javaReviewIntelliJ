package homework_0502;

import java.util.*;

public class Ex11_HashMap {
        HashMap<String, String> h;

    public Ex11_HashMap() {
        h = new HashMap<String, String>(10);
        h.put("체코", "프라하");
        h.put("영국", "런던");
        h.put("독일", "베를린");
        h.put("프랑스", "파리");
        h.put("태국", "방콕");
        h.put("미국", "워싱턴");
        h.put("스위스", "제네바");
        h.put("오스트리아", "빈");
        h.put("그리스", "아테네");
    }
    private void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("현재 "+ h.size() +"개 나라와 수도가 입력되어 있습니다");
        while(true) {
            System.out.print("나라와 수도 입력 " + (h.size() + 1) + ">>");
            StringTokenizer st = new StringTokenizer(scan.nextLine(), " ");
            String country = st.nextToken();

            if(country.equals("그만")) {
                System.out.println("입력을 종료합니다");
                break;
            }
            String capital = st.nextToken();

            if(h.containsKey(country)) {
                System.out.println(country + "은/는 이미 입력된 나라입니다");
                continue;
            }
            h.put(country, capital);
        }
    }

    private void quiz() {

    }

    public static void main(String[] args) {
        Ex11_HashMap ex = new Ex11_HashMap();
//        System.out.println(ex.h.entrySet());
        System.out.println("===== 수도 맞추기 게임을 시작합니다 =====");

        int gameNum = 0;
        Scanner scan = new Scanner(System.in);
        while(true) {
        System.out.println("입력: 1    퀴즈: 2   종료: 3");
        gameNum = scan.nextInt();
            if(gameNum == 3) {
                System.out.println("게임을 종료합니다");
                break;
            }
            else if (gameNum == 2) {
                ex.quiz();
            }
            else if (gameNum == 1) {
                ex.input();
            }
            else {
                System.out.println("다시 입력하세요");
            }
        }
    }

}
