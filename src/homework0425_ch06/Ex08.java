package homework0425_ch06;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("���ڿ��� �Է��ϼ���(��ĭ, ����, �ѱ� ����)");

        String text = scan.nextLine();
        StringBuffer sb = new StringBuffer(text);

        System.out.println(sb); // �Է¹��� ���ڿ� 1ȸ ���

        // �� ���� ����(index 0)�� �����(delete) �� �ڿ� �߰�(append)
        // 1ȸ ���� �ڵ�
//        char first = sb.charAt(0); // �� ���� ����
//        sb.deleteCharAt(0);
//        sb.append(first);
//        System.out.println(sb);

        // �ݺ���
        while (true) {
            char first = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(first);
            System.out.println(sb);
            if (sb.toString().equals(text)) {
                // sb�� ����ִ� ���ڿ��� �Է¹��� ���ڿ�(text)�� ���ٸ� �ݺ��� Ż��
                break;
            }
        }
    }

}
