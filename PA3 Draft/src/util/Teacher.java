package util;

import java.io.PrintWriter;

public class Teacher implements CSVPrintable{
    private String firstName;
    private String lastName;
    private int teacherID;
    private long phone;
    @Override
    public String getName() {

        return firstName + "" + lastName;
    }

    @Override
    public int getID() {

        return teacherID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {

    }
}
