import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.awt.desktop.OpenURIEvent;

public class asm2 {
    static List<student> studentList = new ArrayList<>();

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n ;i++){
            input();
        }
        System.out.println("Print student list: ");
        output();
    }

    public static void input() {
        System.out.println("Enter student information: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student registration:");
        String code = scanner.nextLine();
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter point:");
        float grade = scanner.nextFloat();
        student student = new student(code, name, grade);
        studentList.add(student);


    }

    public static void output() {
        for (student student : studentList) {
            System.out.println(student.toString());
        }
    }

    public static void removeByCode(String code) {


    }

    public static void sortByGradeDesc() {


    }

    public static student findByCodeOrName(String keyword) {


        return null;
    }

    public static List<student> filterByGrade(float x) {

        return null;
    }
}
