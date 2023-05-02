package homework0425_ch06;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("���� ��");
        else
            System.out.println("�ٸ� ��");
    }
    static class MyPoint {
        private int x;
        private int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point("+ x + "," + y + ")";
        }
    }
}
