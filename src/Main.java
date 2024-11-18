import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Задание 1.1
        System.out.print("1.1 Необходимо создать три точки с разными координатами и вывести на экран их текстовое представление. \n");
        try {
            System.out.print("Введите координаты X и Y для первой точки: ");
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();
            Point point1 = new Point(x1, y1);

            System.out.print("Введите координаты X и Y для второй точки: ");
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();
            Point point2 = new Point(x2, y2);

            System.out.print("Введите координаты X и Y для третьей точки: ");
            double x3 = in.nextDouble();
            double y3 = in.nextDouble();
            Point point3 = new Point(x3, y3);

            System.out.println("Точки:");
            System.out.println(point1);
            System.out.println(point2);
            System.out.println(point3 + ("\n"));

        }catch (InputMismatchException e){
            System.out.println("Ошибка: введенное значение не является числом.\n");
        }

        //Задание 2.1
        System.out.print("2.1 Линии: \n");
        // Линия 1
        Point line1Start = new Point(1, 3);
        Point line1End = new Point(23, 8);
        Line line1 = new Line(line1Start, line1End);
        System.out.println("1. "+line1);
        // Линия 2
        Point line2Start = new Point(5, 10);
        Point line2End = new Point(25, 10);
        Line line2 = new Line(line2Start, line2End);
        System.out.println("2. "+line2);
        // Линия 3
        Line line3 = new Line(line1.getStart(), line2.getEnd());
        System.out.println("3. "+line3+"\n");
        // Изменение координат первой и второй линий
        try {
            System.out.print("Введите новые координаты начала первой линии (x y): ");
            int newX1 = in.nextInt();
            int newY1 = in.nextInt();
            Point newStart1 = new Point(newX1, newY1);
            line1.setStart(newStart1);

            System.out.print("Введите новые координаты конца второй линии (x y): ");
            int newX2 = in.nextInt();
            int newY2 = in.nextInt();
            Point newEnd2 = new Point(newX2, newY2);
            line2.setEnd(newEnd2);

            line3.setStart(line1.getStart());
            line3.setEnd(line2.getEnd());

            System.out.println("Новая Линия 1: " + line1);
            System.out.println("Новая Линия 2: " + line2);
            System.out.println("Новая Линия 3: " + line3+("\n"));

            // Изменение координат первой линии без изменения третьей линии
            System.out.print("Введите новые координаты конца первой линии (x y): ");
            int newX3 = in.nextInt();
            int newY3 = in.nextInt();
            Point newEnd1 = new Point(newX3, newY3);
            line1.setEnd(newEnd1);

            System.out.println("Новая Линия 1: " + line1);
            System.out.println("Линия 3: " + line3+("\n"));
        }catch (InputMismatchException e){
            System.out.println("Ошибка: введенное значение не является числом.\n");
        }

        //Задание 3.1
        System.out.print("3.1 Оценки: \n");
        Student vasya = new Student("Вася", new int[]{3, 4, 5});
        Student petya = new Student("Петя", vasya.grades);
        petya.grades[0] = 5;
        System.out.println(vasya);
        System.out.println(petya);
        Student andrey = new Student("Андрей", vasya.grades.clone());
        System.out.println(andrey+"\n");

        //Задание 4.1
        System.out.print("4.1 Точки: \n");
        Point point1 = new Point(3, 5);
        System.out.println(point1);
        Point point2 = new Point(25, 6);
        System.out.println(point2);
        Point point3 = new Point(7, 8);
        System.out.println(point3+"\n");

        //Задание 4.2
        System.out.print("4.2 Линии: \n");
        Line line4 = new Line(new Point(1, 3), new Point(23, 8));
        System.out.println(line4);
        Line line5 = new Line(5, 10, 25, 10);
        System.out.println(line5);
        Line line6 = new Line(line4.getStart(), line5.getEnd());
        System.out.println(line6+"\n");

        //Задание 5.3
        System.out.print("5.3 Линия: \n");
        Line line = new Line(1, 1, 10, 15);
        System.out.println(line);
        System.out.println("Длина линии: " + line.getLength());
    }
}