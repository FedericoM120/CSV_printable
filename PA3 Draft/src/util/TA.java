package util;

public class TA extends Student{
    private int teacherID;
    public TA(String name, String studentID, String teacherID, String phone) {
        super(name, studentID, phone);
        this.teacherID = Integer.parseInt(teacherID);
    }

    public int getID() {
        int studentID = super.getID();
        return Math.max(studentID, teacherID);
    }
}
