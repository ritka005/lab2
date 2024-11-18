public class Student { //Определение класса
    private final String name;
    int[] grades;

    //Конструктор
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades.clone();
    }

    //Метод toString()
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ": [");
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i < grades.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}