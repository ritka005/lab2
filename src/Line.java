public class Line { //Определение класса
    private Point start;
    private Point end;

    //Конструктор
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    //сеттеры и геттеры
    //Геттер просто возвращает значение свойства, а сеттер его меняет.
    public void setStart(Point start) {
        this.start = start;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public Point getStart() {
        return start;
    }
    public Point getEnd() {
        return end;
    }

    //Метод getLength()
    public int getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    //Метод toString()
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}