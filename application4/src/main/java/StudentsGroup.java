import java.util.HashMap;
import java.util.HashSet;

public class StudentsGroup {

    private Student headman;
    private HashMap<Integer, Student> students;
    private HashMap<Integer, GroupTask> tasks;
    private int tasksCounter;

    StudentsGroup(Student headman) {
        students = new HashMap<>();
        students.put(headman.getId(), headman);
        this.headman = headman;
        this.tasks = new HashMap<>();
        tasksCounter = 0;
    }
    private class GroupTask {
        private String description;
        private HashSet<Integer> studentsCompleted;

        private GroupTask(String description) {
            this.description = description;
            this.studentsCompleted = new HashSet<>();
        }

        private void setStudentCompleted(int studentId) {
            this.studentsCompleted.add(studentId);
        }
    }

    public boolean changeHeadman(int studentId) {
        if (!this.students.containsKey(studentId)) {
            System.out.println("ERROR: Student is not in the group.");
            return false;
        }
        if (headman.getId() == (studentId)) {
            System.out.println("WARNING: Current student is already a headmen. Student ID " + studentId);
            return false;
        }
        this.headman = students.get(studentId);
        System.out.println("INFO: Changed the headmen. " + this.headman.getFirstName() + " " + this.headman.getLastName() + " is a new headman of the group.");
        return true;
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            System.out.println("ERROR: Student cannot be null.");
            return false;
        }
        if (students.containsKey(student.getId())) {
            System.out.println("WARNING: Student with ID" + student.getId() + " is already in the group.");
            return false;
        }
        this.students.put(student.getId(), student);
        System.out.println("INFO: Added " + student.getFirstName() + " " + student.getLastName() + " to the group. Student ID " + student.getId());
        return true;

    }

    public boolean removeStudent(int studentId) {
        if (headman.getId() == (studentId)) {
            System.out.println("ERROR: Group cannot exist without a headmen. Change the headmen before removing this student.");
            return false;
        }
        if (!this.students.containsKey(studentId)) {
            System.out.println("ERROR: Student is not in the group. Student ID " + studentId);
            return false;
        }
        this.students.remove(studentId);
        System.out.println("INFO: Removed student from the group. Student ID " + studentId);
        return true;
    }

    public int addTask(String description) {
        int taskId = ++tasksCounter;
        tasks.put(taskId, new GroupTask(description));
        System.out.println("INFO: Added a new task to the group. Task ID " + taskId);
        return taskId;
    }

    public boolean markTaskSolved(int taskId, int studentId) {
        if (!this.tasks.containsKey(taskId)) {
            System.out.println("ERROR: Group does not contain a task with ID " + taskId);
            return false;
        }
        if (!this.students.containsKey(studentId)) {
            System.out.println("ERROR: Group does not contain a student with ID " + studentId);
            return false;
        }
        this.tasks.get(taskId).setStudentCompleted(studentId);
        System.out.println("INFO: Task with ID " + taskId + " has been marked as completed for student with ID " + studentId);
        return true;
    }
}
