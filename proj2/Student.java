package proj2;

public class Student {
    private double width;
    private double height;
    private static int count = 0;

    public Student() {
        this.width = 0;
        this.height = 0;
        count++;
    }

    public Student(double width, double height) {
        this.width = width;
        this.height = height;
        count++;
    }
    public Student(double height) {
        this(0, height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (width * height) / 2.0;
    }

    public double getPerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return width + height + hypotenuse;
    }

    public static int getCount() {
        return count;
    }
}
