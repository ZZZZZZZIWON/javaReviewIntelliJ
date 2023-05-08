package homework_0502;

import java.util.*;

public class Ex11_HashMap {
    HashMap<String, String> h;

    public Ex11_HashMap() {
        // ������ method�� �̿� ->  ����� ���� ���� ����
        // ������ key���� country, value���� capital�� ����
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

    // Method 1 ] ����� ������ �Է¹޾Ƽ� HashMap�� �߰�
    private void input() {
        Scanner scan = new Scanner(System.in);
        // size() method�� �̿��ؼ� ���� HashMap�� ����Ǿ� �ִ� �������� ���� �ľ�
        System.out.println("���� " + h.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�");
        while (true) {
            System.out.print("����� ���� �Է� " + (h.size() + 1) + ">>");
            // ������ �������� ù ��° nextToken�� country ������ ����
            StringTokenizer st = new StringTokenizer(scan.nextLine(), " ");
            String country = st.nextToken();

            // ù ��° �Է¹��� nextToken�� "�׸�"�� ��ġ�� �� �Է� ����
            if (country.equals("�׸�")) {
                System.out.println("�Է��� �����մϴ�");
                break;
            }
            // ���� �� �� ��° token�� capital ������ ����
            String capital = st.nextToken();

            // HashMap�� �̹� �����ϴ� ����� ������ pass
            if (h.containsKey(country)) {
                System.out.println(country + "��/�� �̹� �Էµ� �����Դϴ�");
                continue;
            }
            // HashMap�� ���ٸ� put() method�� �̿��ؼ� ���� �߰�
            h.put(country, capital);
        }
    }

    // Method 2 ] �����ϰ� ���� ���� -> �Է¹��� ��� ��
    private void quiz() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        // h�� key������ toArray() �޼ҵ带 ����ؼ� Object[] �迭�� ��ȯ
        Object[] keys = h.keySet().toArray();
        int index;
        String country;
        String capital;

        while(true) {
            // h�� ����� key-value ������ ������ ������ index�� ����
            index = rand.nextInt(h.size());
            // ������ index�� ����Ű�� �迭�� ��(key)�� country ������ ����
            // keys�� Object[] type�̱� ������ String���� downcasting
            country = (String) keys[index];
            System.out.print(country + "�� ������? ");
            // �Է¹��� ���� capital�� ����
            capital = scan.nextLine();

            if (capital.equals("�׸�")) {
                System.out.println("��� �����մϴ�.");
                break;
            }

            // �Է¹��� capital�� country�� ��� ������ index�� ����Ű�� �迭�� ���� ��ġ�� ��
            if (capital.equals(h.get(country))) {
                System.out.println("����");
            } else {
                System.out.println("�����Դϴ�");
            }
        }
    }

    public static void main(String[] args) {
        // ������ ������ ��ü ����
        Ex11_HashMap ex = new Ex11_HashMap();
//        System.out.println(ex.h.entrySet());
        System.out.println("===== ���� ���߱� ������ �����մϴ� =====");

        // �Է¹޴� ���ڸ� ������ gameNum ����
        int gameNum = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("�Է�: 1    ����: 2   ����: 3");
            gameNum = scan.nextInt();
            if (gameNum == 3) {
                System.out.println("������ �����մϴ�");
                break;
            } else if (gameNum == 2) {
                ex.quiz();
            } else if (gameNum == 1) {
                ex.input();
            } else {
                System.out.println("�ٽ� �Է��ϼ���");
            }
        }
    }

}
