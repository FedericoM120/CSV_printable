package util;

import java.io.PrintWriter;

public class Teacher implements CSVPrintable{
    private String name;
    private int teacherID;
    private int phone;


    public Teacher(String name, String teacherID, String phone) {
        this.name = name;
        this.teacherID = Integer.parseInt(teacherID);
        this.phone = Integer.parseInt(String.valueOf(phone).substring(Math.max(String.valueOf(phone).length() - 4, 0)));
    }


    @Override
    public String getName() {
        String str = name;
        String newName = str.replace(",", " ");

        return newName;
    }

    @Override
    public int getID() {

        return teacherID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {
        out.println(getName() + "," + getID() + "," + phone );
    }
}

