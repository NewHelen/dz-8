public class Student {

    private int studentId;
    private String firstName;
    private String lastName;

    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return  firstName+" "+lastName;
    }

    Student (int studentId, String firstName, String lastName){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    };
}
