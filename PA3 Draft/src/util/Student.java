package util;

import java.io.PrintWriter;

public class Student implements CSVPrintable{
    private String firstName;
    private String lastName;
    private int studentID;
    private long phone;

    //DO I NEED TO MAKE A CONSTRUCTOR?
    @Override
    public String getName() {
        return firstName + "" + lastName;
    }

    @Override
    public int getID() {
        return studentID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {

    }
}
