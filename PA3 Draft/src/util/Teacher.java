package util;

import java.io.PrintWriter;

public class Teacher implements CSVPrintable{
    private String name;
    private int teacherID;
    private int phone;
    private String position;

    public Teacher(String position, String name, String teacherID, String phone) {
        this.name = name;
        this.teacherID = Integer.parseInt(teacherID);
        this.phone = Integer.parseInt(phone);
        this.position = position;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public int getID() {

        return teacherID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {
        out.println(String.format("%s,%d,%d", getName(), getID(), phone));
    }
}
