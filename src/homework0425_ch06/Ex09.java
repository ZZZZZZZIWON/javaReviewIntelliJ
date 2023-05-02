package homework0425_ch06;

import java.util.Scanner;
import java.util.Random;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // �Է� �޴� ���ڿ� �´� ���ڿ��� rps �迭�� ����
        String[] rps = {"����", "����", "��"};
        System.out.print("�̸��� �Է��ϼ��� >>");
        String name = scan.nextLine();

        while (true) {
            System.out.print(name + ">>");
            int keyByPlayer = scan.nextInt(); // player�� �Է��� key�� keyByPlayer ������ ����

            if (keyByPlayer == 4 ) {
                System.out.println("������ �����մϴ�.");
                break;
            }
            if (keyByPlayer < 1 || keyByPlayer > 4) {
                System.out.println("�ٽ� �Է��ϼ���.");
                continue;
            }

            // ��ǻ�Ͱ� ������ ������ (1, 2, 3)
            int keyByCom = random.nextInt(3) + 1;

            // �Է��� ���ڿ� �´� ����, ����, �� ���ڿ��� ���� (both keyByPlayer and keyByCom)
            // 1 �Է� -> rps[0]("����")�� keyByPlayerStr / keyByComStr�� ����
            // 2 �Է� -> rps[1]("����")�� keyByPlayerStr / keyByComStr�� ����
            // 3 �Է� -> rps[2]("��")�� keyByPlayerStr / keyByComStr�� ����
            String keyByPlayerStr = rps[keyByPlayer - 1];
            String keyByComStr = rps[keyByCom - 1];

            String result = "";
            if (keyByPlayer == keyByCom) {
                result = "�����ϴ�.";
            }
            else if ( // ��ǻ�Ͱ� �̱�� ���
                    (keyByPlayer == 1 && keyByCom == 2) || // player (1 - ����) && computer (2 - �ָ�)
                            (keyByPlayer == 2 && keyByCom == 3) || // player (2 - �ָ�) && computer (3 - ��)
                            (keyByPlayer == 3 && keyByCom == 1))   // player (3 - ��)   && computer (1 - ����)
            {
                result = "��ǻ�Ͱ� �̰���ϴ�.";
            } else {
                result = name + "(��/��) �̰���ϴ�.";
            }

            // �Է��� ���ڿ� �´� ���ڿ� & ��� ���
            System.out.println(name+"("+ keyByPlayerStr + ") : ��ǻ��(" + keyByComStr + ")");
            System.out.println(result);
        }
    }
}
