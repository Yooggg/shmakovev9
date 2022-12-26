import java.util.HashSet;
import java.util.Objects;

public class University {
    private String name;
    private int studentsNumber;
    private int tutorsNumber;
    private float avgEGE;

    public University(String name, int studentsNumber, int tutorsNumber, float avgEGE) {
        this.name = name;
        this.studentsNumber = studentsNumber;
        this.tutorsNumber = tutorsNumber;
        this.avgEGE = avgEGE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return studentsNumber == that.studentsNumber && tutorsNumber == that.tutorsNumber && Float.compare(that.avgEGE, avgEGE) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentsNumber, tutorsNumber, avgEGE);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", studentsNumber=" + studentsNumber +
                ", tutorsNumber=" + tutorsNumber +
                ", avgEGE=" + avgEGE +
                '}';
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public static void getInfo(HashSet<University> b){
        int stud = 0;
        float tutor = 0;
        float ege = 0;
        for (University a : b) {
            stud += a.studentsNumber;
            tutor += a.tutorsNumber;
            ege += a.avgEGE;
        }
        System.out.println("Число студентов в множестве - " + stud + "\nСреднее количество преподавателей множества - " + tutor/b.size() + "\nСредний балл ЕГЭ во множестве - " + ege/b.size() + "\n");
    }
}
