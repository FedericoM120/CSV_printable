package util;

import java.io.PrintWriter;

public class Student implements CSVPrintable{
    private String name;
    private int studentID;
    private long phone;

    public Student(String name, String studentID, String phone) {
        this.name = name;
        this.studentID = Integer.parseInt(studentID);
        this.phone = Long.parseLong(phone);
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
