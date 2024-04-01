import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    ArrayList<Student> students = new ArrayList<>();

    Student student1 = new Student("홍길동",178,75);
    Student student2 = new Student("이서경",180,78);
    Student student3 = new Student("이영희",155,49);
    Student student4 = new Student("김멋사",182,82);

    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    int max=0;
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getBMI(students.get(i).getHeight(),students.get(i).getWeight()) > students.get(max).getBMI(students.get(max).getHeight(),students.get(max).getWeight())) {
                max = i;
            }
        }
        students.remove(max);

        // max 값을 가진 학생을 제외하고 출력
        for (int i = 0; i < students.size(); i++) {
            if (i != max) {
                students.get(i).printIntro();
                students.get(i).say();
            }
        }
    }
}
