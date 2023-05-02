package homework0425_ch06;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(">> ");
        String sentence = scan.nextLine();
//        StringBuffer sb = new StringBuffer(sentence);

        while (true) {
            System.out.print("��� : ");
            String command = scan.nextLine();
            if(command.equals("�׸�")) { // "�׸�"�� �ԷµǸ� ���α׷� ����
                break;
            }
            // "!"�� �������� ������ partCommand �迭�� ����
            String[] partCommand = command.split("!");

            if (partCommand.length != 2) {
                System.out.println("�߸��� ����Դϴ�.");
                return;
            }

            String word = partCommand[0]; // �����ϰ� ���� ���ڿ�
            String replaced = partCommand[1]; // �ٲ� ���ڿ�

            if (sentence.contains(word)) {
                // �Է¹��� ���ڿ��� �Է¹��� ����� word�κ��� �����ϰ� �־�� ���� ����
                String result = sentence.replace(word, replaced);
                System.out.println(result);
            }
            else {
                System.out.println("ã�� �� �����ϴ�.");
            }
        }

    }
}

