package util;

import java.io.PrintWriter;

public class Student implements CSVPrintable{
    private String name;
    private int studentID;
    private long phone;
    private String position;

    public Student(String position, String name, String studentID, String phone) {
        this.name = name;
        this.studentID = Integer.parseInt(studentID);
        this.phone = Long.parseLong(phone);
        this.position = position;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public int getID() {

        return studentID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {
        out.println(String.format("%s,%d,%d", getName(), getID(), phone));
    }
}
