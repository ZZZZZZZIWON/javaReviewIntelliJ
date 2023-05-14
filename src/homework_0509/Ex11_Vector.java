package homework_0509;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex11_Vector {
    // Vector�� ����
    Vector<String> countries = new Vector<String>();
    Vector<String> capitals = new Vector<String>();

    public Ex11_Vector() {
        // ������ method�� �̿� -> ����� ���� ���� ����
        countries.add("ü��");
        capitals.add("������");
        countries.add("����");
        capitals.add("����");
        countries.add("����");
        capitals.add("������");
        countries.add("������");
        capitals.add("�ĸ�");
        countries.add("�±�");
        capitals.add("����");
        countries.add("�̱�");
        capitals.add("������");
        countries.add("������");
        capitals.add("���׹�");
        countries.add("����Ʈ����");
        capitals.add("��");
        countries.add("�׸���");
        capitals.add("���׳�");
    }

    // Method 1 ] ����� ������ �Է¹޾Ƽ� Vector�� �߰�
    private void input() {
        Scanner scan = new Scanner(System.in);
        // size() method�� �̿��ؼ� ���� Vector�� ����Ǿ� �ִ� �������� ���� �ľ�
        System.out.println("���� " + countries.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�");
        while (true) {
            System.out.print("����� ���� �Է� " + (countries.size() + 1) + ">>");
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

            // Vector�� �̹� �����ϴ� ����� ������ pass
            if (countries.contains(country)) {
                System.out.println(country + "��/�� �̹� �Էµ� �����Դϴ�");
                continue;
            }
            // Vector�� �߰�
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
            // countries Vector�� ũ�⸦ �̿��� ������ index�� ���Ѵ�
            index = rand.nextInt(countries.size());
            // index�� �ش��ϴ� ���� country ������ ����
            country = countries.get(index);
            System.out.print(country + "�� ������? ");
            capital = scan.nextLine();

            if (capital.equals("�׸�")) {
                System.out.println("��� �����մϴ�.");
                break;
            }

            // �Է¹��� capital�� �ش� ������ ������ ���Ͽ� ��� ���
            if (capital.equals(capitals.get(index))) {
                System.out.println("����");
            } else {
                System.out.println("�����Դϴ�");
            }
        }
    }

    public static void main(String[] args) {
        // ������ ������ ��ü ����
        Ex11_Vector ex = new Ex11_Vector();

        // System.out.println(ex.v);
        System.out.println("===== ���� ���߱� ������ �����մϴ� =====");

        // �Է¹޴� ���ڸ� ������ gameNum ����
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
