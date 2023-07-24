
public class Main {
    public static void main(String[] args) {
        //creating student
        Student student1 = new Student(1, "Thomas", "Taylor");
        Student student2 = new Student(2, "James", "Anderson");
        Student student3 = new Student(1, "Martin", "Johnson");

        //creating group
        StudentsGroup group1 = new StudentsGroup(student1);

        //adding student to group
        group1.addStudentToGroup(student1);
        group1.addStudentToGroup(student2);
        group1.addStudentToGroup(student3);

        //adding task
        group1.addTask("Вивчити інкапсуляцію");
        group1.addTask("Вивчити інтерфейси");

        //mark task as completed for particular student
        group1.markTaskCompleted(student1, "Вивчити інкапсуляцію");

        //change headman
        group1.changeHeadmanOfGroup(student2);

        //remove student from group
        group1.deleteStudentFromGroup(student3);
    }
}