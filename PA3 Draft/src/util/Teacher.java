package util;

import java.io.PrintWriter;

public class Teacher implements CSVPrintable{
    private String name;
    private int teacherID;
    private int phone;


    public Teacher(String name, String teacherID, String phone) {
        this.name = name;
        this.teacherID = Integer.parseInt(teacherID);
        this.phone = Integer.parseInt(phone);
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
