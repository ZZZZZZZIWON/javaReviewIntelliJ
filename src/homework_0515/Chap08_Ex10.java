package homework_0515;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chap08_Ex10 {
    static Scanner scan = new Scanner(System.in);
    File f = new File("C:\\javaex\\phone.txt");
    StringTokenizer st;
    HashMap<String, String> map;

    public Chap08_Ex10() {
        map = new HashMap<String, String>(10);
    }

    public static void main(String[] args) throws IOException {
        Chap08_Ex10 ex = new Chap08_Ex10();

        while (true) {
            System.out.println("1 �Է�    2 �˻�    3 ����");
            int num = scan.nextInt();
            if (num == 3) {
                System.out.println("���α׷��� �����մϴ�");
                break;
            }
            if (num == 1) {
                ex.enter();
            } else if (num == 2) {
                ex.search();
            } else {
                System.out.println("�߸��� �Է��Դϴ�");
                continue;

            }
        }
    }

    private void search() throws IOException {
        InputStreamReader is = new InputStreamReader(new FileInputStream(f), "UTF-8");
        BufferedReader br = new BufferedReader(is);
        String line;

        while (!(line = br.readLine()).equals("q")) {
            st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                map.put(st.nextToken(), st.nextToken());
            }
        }

        System.out.println("�� " + map.size() + "���� ��ȭ��ȣ�� �о����ϴ�");

        while (true) {
            System.out.print("�̸� >> ");
            String name = scan.next();

            if (name.equals("�׸�")) {
                System.out.println("�˻��� �����մϴ�");
                break;
            }

            if (map.containsKey(name)) {
                String phone = map.get(name);
                System.out.println(phone);
            } else {
                System.out.println("ã�� �̸��� �����ϴ�");
                continue;
            }
        }
    }

    private void enter() throws IOException {
        FileWriter fw = new FileWriter(f, true);
        System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���");

        while (true) {
            String info = scan.nextLine();

            if (info.equals("�׸�")) {
                fw.append("q\n");
                System.out.println("�Է��� �����մϴ�");
                break;
            }
            st = new StringTokenizer(info, " ");
            if (st.hasMoreTokens()) {
                String name = st.nextToken();
                String phone = st.nextToken();
                fw.append(name + " " + phone);
                fw.append(System.lineSeparator());
                map.put(name, phone);
            }
        }
            fw.close();
    }
}

