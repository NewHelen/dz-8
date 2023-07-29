public class Main {
    public static void main(String[] args) {
        //create students
        Student student1 = new Student("Thomas", "Taylor");
        Student student2 = new Student("James", "Anderson");
        Student student3 = new Student("Martin", "Johnson");
        Student stranger = new Student("Some", "Stranger");

        //create group
        StudentsGroup group1 = new StudentsGroup(student1);

        //add student to group
        group1.addStudent(student2); //ok
        group1.addStudent(student3); //ok
        group1.addStudent(null); //error
        group1.addStudent(student3); //warning

        //remove student
        group1.removeStudent(-1); //error
        group1.removeStudent(stranger.getId()); //error
        group1.removeStudent(student1.getId()); //error, current headman
        group1.removeStudent(student3.getId()); //ok

        //change headman
        group1.changeHeadman(-1); //error
        group1.changeHeadman(stranger.getId()); //error
        group1.changeHeadman(student1.getId()); //warning, current headman
        group1.changeHeadman(student2.getId()); //ok

        //add task
        int task1Id = group1.addTask("Вивчити інтерфейси"); //ok
        int task2Id = group1.addTask("Вивчити інкапсуляцію"); //ok

        //mark task as solved for a specific student
        group1.markTaskSolved(-1, student1.getId()); //error
        group1.markTaskSolved(task2Id, stranger.getId()); //error
        group1.markTaskSolved(task1Id, student1.getId()); //ok
    }
}