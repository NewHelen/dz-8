public class Main {
    public static void main(String[] args) {
        //creating student
        Student student1 = new Student("1","Thomas", "Taylor");
        Student student2 = new Student("2", "James", "Anderson");
        Student student3 = new Student("3","Martin", "Johnson");

        //creating group
        StudentsGroup group1 = new StudentsGroup(student1);

        //adding student to group
        group1.addStudentToGroup(student2);
        group1.addStudentToGroup(student3);
        group1.addStudentToGroup(null);

        //adding task
        group1.addTask("9","Вивчити інтерфейси");
        group1.addTask("10","Вивчити інкапсуляцію");

        //mark task as completed for particular student
        group1.markTaskCompletedForStudent(student1,"9");
        group1.markTaskCompletedForStudent(student1,"non existing id");
        group1.markTaskCompletedForStudent(null,"non existing id");

        //change headman
        group1.changeHeadmanOfGroup(student2);

        //remove student from group
        group1.deleteStudentFromGroup(student3);
    }
}