class RectangleObj {
    private int length;
    private int width;

    public RectangleObj(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }
}

class AreaCalculator {
    public int calculateArea(RectangleObj rect) {
        return rect.getLength() * rect.getWidth();
    }
}

public class ObjectParameterDemo {
    public static void main(String[] args) {
        RectangleObj box = new RectangleObj(5, 8);
        AreaCalculator calc = new AreaCalculator();
        int area = calc.calculateArea(box);
        System.out.println("Area of rectangle (5x8): " + area);
    }
}
