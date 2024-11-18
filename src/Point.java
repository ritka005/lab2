public class Point { //Определение класса
    private final double x;
    private final double y;
    //final зн. этих переменных не могут быть изменены после их назначения.

    //Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //Методы-геттеры: позволяют получить доступ к значениям этих переменных из-за пределов класса.
    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }
    //Метод toString()
    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
