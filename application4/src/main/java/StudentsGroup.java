import java.util.ArrayList;

public class StudentsGroup {
    private Student headman;
    private ArrayList<Student> students;
    private ArrayList<String> tasks;

    StudentsGroup(Student headman) {
        this.headman = headman;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void changeHeadmanOfGroup(Student newHeadman) {
        this.headman = newHeadman;
    }

    public void addStudentToGroup(Student student) {
        this.students.add(student);
    }

    public void deleteStudentFromGroup(Student student) {
        this.students.remove(student);
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void markTaskCompleted(Student student, String task) {
        System.out.println("Task '" + task + "' market as completed for student " + student.getFullName());
    }
}