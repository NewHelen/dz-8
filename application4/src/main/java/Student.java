public class Student {

    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;

    public int getStudentId() {
        return id;
    }

    Student(String firstName, String lastName) {
        this.id = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}