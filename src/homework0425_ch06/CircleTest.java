package homework0425_ch06;

public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); // �߽� (2,3)�� ������ 5�� ��
        Circle b = new Circle(2, 3, 30); // �߽� (2,3)�� ������ 30�� ��
        System.out.println("�� a : " + a);
        System.out.println("�� b : " + b);
        if (a.equals(b))
            System.out.println("���� ��");
        else
            System.out.println("�ٸ� ��");
    }

    static class Circle {
        private int x;
        private int y;
        private int radius;

        public Circle(int x, int y, int radius) { // Constructor
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        @Override
        public boolean equals(Object obj) { // ��ü�� �߽�(x,y)�� ���Ƶ� true��,�� ��ȯ�ϵ��� �������̵�
            if (this == obj) { // �� ��ü�� ���� ���������� ������ ���
                return true;
            }
            if (obj instanceof Circle) { // �ٸ� ���� ���� but ������ x,y��
                return this.x == x && this.y == y;
            }
            return false;
        }


        @Override
        public String toString() {
            return "Circle(" + x + "," + y + ") ������" + radius;
        }
    }
}
