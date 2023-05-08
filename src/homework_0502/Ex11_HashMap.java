package homework_0502;

import java.util.*;

public class Ex11_HashMap {
    HashMap<String, String> h;

    public Ex11_HashMap() {
        // 생성자 method를 이용 ->  나라와 수도 정보 저장
        // 각각의 key값은 country, value값은 capital을 저장
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

    // Method 1 ] 나라와 수도를 입력받아서 HashMap에 추가
    private void input() {
        Scanner scan = new Scanner(System.in);
        // size() method를 이용해서 현재 HashMap에 저장되어 있는 정보들의 수를 파악
        System.out.println("현재 " + h.size() + "개 나라와 수도가 입력되어 있습니다");
        while (true) {
            System.out.print("나라와 수도 입력 " + (h.size() + 1) + ">>");
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

            // HashMap에 이미 존재하는 나라와 수도는 pass
            if (h.containsKey(country)) {
                System.out.println(country + "은/는 이미 입력된 나라입니다");
                continue;
            }
            // HashMap에 없다면 put() method를 이용해서 정보 추가
            h.put(country, capital);
        }
    }

    // Method 2 ] 랜덤하게 문제 생성 -> 입력받은 답과 비교
    private void quiz() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        // h의 key값들을 toArray() 메소드를 사용해서 Object[] 배열로 반환
        Object[] keys = h.keySet().toArray();
        int index;
        String country;
        String capital;

        while(true) {
            // h에 저장된 key-value 개수의 랜덤한 정수를 index에 저장
            index = rand.nextInt(h.size());
            // 랜덤한 index가 가리키는 배열의 값(key)를 country 변수에 저장
            // keys는 Object[] type이기 때문에 String으로 downcasting
            country = (String) keys[index];
            System.out.print(country + "의 수도는? ");
            // 입력받은 답을 capital에 저장
            capital = scan.nextLine();

            if (capital.equals("그만")) {
                System.out.println("퀴즈를 종료합니다.");
                break;
            }

            // 입력받은 capital과 country에 담긴 랜덤한 index가 가리키는 배열의 값이 일치할 때
            if (capital.equals(h.get(country))) {
                System.out.println("정답");
            } else {
                System.out.println("오답입니다");
            }
        }
    }

    public static void main(String[] args) {
        // 게임을 진행할 객체 생성
        Ex11_HashMap ex = new Ex11_HashMap();
//        System.out.println(ex.h.entrySet());
        System.out.println("===== 수도 맞추기 게임을 시작합니다 =====");

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
