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
        //parse string
        //when string encounters comma, remove comma and add a space
       String str = name;
       String newName = str.replace(",", " ");

        return newName;
    }

    @Override
    public int getID() {

        return studentID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {
        out.println(getName() + "," + getID() + "," + phone);
    }
}
