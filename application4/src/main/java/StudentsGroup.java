import java.util.HashMap;
import java.util.HashSet;

public class StudentsGroup {

    private class TaskDetails {
        String description;
        HashSet<Student> completed;

        private TaskDetails(String description) {
            this.description = description;
        }
    }

    private Student headman;
    private int studentIdCounter;
    private HashMap<Integer, Student> students;
    private HashMap<String, TaskDetails> tasks;  //taskId and taskDetails

    StudentsGroup(Student headman) {
        this.headman = headman;
        this.students = new HashMap();
        this.students.add(headman);
        this.tasks = new HashMap<>();
    }

    public void changeHeadmanOfGroup(Student newHeadman) {
        this.headman = newHeadman;
    }

    public void addStudentToGroup(Student student) {
        if (student == null) {
            System.out.println("Set the right student");
        }
        if (this.students.add(student)){
            System.out.println("Student added to the group");
        }else {
        System.out.println("Student added to the group");
        }
    }

    public void deleteStudentFromGroup(Student student) {
        this.students.remove(student);
    }

    public boolean addTask(String taskId, String taskDescription) {
        if (this.tasks.containsKey(taskId)) {
            System.out.println("Such Task Id already exists. Should be unique");
            return false;
        }
        this.tasks.put(taskId, new TaskDetails(taskDescription));
        return true;
    }

    public boolean markTaskCompletedForStudent(Student student, String taskId) {
        if (!this.students.contains(student)) {
            System.out.println("Such student does not exists");
            return false;
        }
        if (!this.tasks.containsKey(taskId)) {
            System.out.println("Such task does not exists");
            return false;
        }
        this.tasks.get(taskId).completed.add(student);
        System.out.println("Task marked as completed for student with ID " + student.getStudentId());
        return true;
    }
}
