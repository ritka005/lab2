public class Point { //Определение класса
    //Объявление полей
    private final double x;
    private final double y;
    //final зн. этих переменных не могут быть изменены после их назначения.

    //Конструктор
    //Инициализация полей
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //геттеры: позволяют получить доступ к значениям этих переменных из-за пределов класса.
    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }
    //Метод toString()
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
