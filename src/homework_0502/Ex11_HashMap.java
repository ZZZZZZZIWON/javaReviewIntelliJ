package homework_0502;

import java.util.*;

public class Ex11_HashMap {
        HashMap<String, String> h;

    public Ex11_HashMap() {
        h = new HashMap<String, String>(10);
        h.put("ü��", "������");
        h.put("����", "����");
        h.put("����", "������");
        h.put("������", "�ĸ�");
        h.put("�±�", "����");
        h.put("�̱�", "������");
        h.put("������", "���׹�");
        h.put("����Ʈ����", "��");
        h.put("�׸���", "���׳�");
    }
    private void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("���� "+ h.size() +"�� ����� ������ �ԷµǾ� �ֽ��ϴ�");
        while(true) {
            System.out.print("����� ���� �Է� " + (h.size() + 1) + ">>");
            StringTokenizer st = new StringTokenizer(scan.nextLine(), " ");
            String country = st.nextToken();

            if(country.equals("�׸�")) {
                System.out.println("�Է��� �����մϴ�");
                break;
            }
            String capital = st.nextToken();

            if(h.containsKey(country)) {
                System.out.println(country + "��/�� �̹� �Էµ� �����Դϴ�");
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
        System.out.println("===== ���� ���߱� ������ �����մϴ� =====");

        int gameNum = 0;
        Scanner scan = new Scanner(System.in);
        while(true) {
        System.out.println("�Է�: 1    ����: 2   ����: 3");
        gameNum = scan.nextInt();
            if(gameNum == 3) {
                System.out.println("������ �����մϴ�");
                break;
            }
            else if (gameNum == 2) {
                ex.quiz();
            }
            else if (gameNum == 1) {
                ex.input();
            }
            else {
                System.out.println("�ٽ� �Է��ϼ���");
            }
        }
    }

}
