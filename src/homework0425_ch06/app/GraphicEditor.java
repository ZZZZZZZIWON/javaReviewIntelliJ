package homework0425_ch06.app;

import homework0425_ch06.base.Shape;
import homework0425_ch06.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
