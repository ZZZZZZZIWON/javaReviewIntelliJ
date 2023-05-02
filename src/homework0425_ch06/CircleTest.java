package homework0425_ch06;

public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); // 중심 (2,3)에 반지름 5인 원
        Circle b = new Circle(2, 3, 30); // 중심 (2,3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if (a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("다른 원");
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
        public boolean equals(Object obj) { // 객체의 중심(x,y)만 같아도 trueㄹ,ㄹ 반환하도록 오버라이딩
            if (this == obj) { // 두 객체가 같은 참조변수를 가지는 경우
                return true;
            }
            if (obj instanceof Circle) { // 다른 참조 변수 but 동일한 x,y값
                return this.x == x && this.y == y;
            }
            return false;
        }


        @Override
        public String toString() {
            return "Circle(" + x + "," + y + ") 반지름" + radius;
        }
    }
}
