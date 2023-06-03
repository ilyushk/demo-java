package proj2;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите ширину и высоту прямоугольного треугольника: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Student t1 = new Student(a,b);

        System.out.println("Гипотенуза: " + t1.getHeight());
        System.out.println("Площадь прямоугольного треугольника: " + t1.getArea());
        System.out.println("Периметр прямоугольного треугольника: " + t1.getPerimeter());
    }
}
