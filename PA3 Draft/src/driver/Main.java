package driver;
import java.util.*;
import java.io.*;
import util.*;
public class Main {
    private static boolean verify(String position, String name, String studentID, String teacherID, String phone){
        switch(position){
            case "student":
                if (!name.contains(",") || (studentID.equals("0")) || studentID.length() != 5 ||
                !teacherID.equals("0") || phone.length() != 10) {
                    return false;
                }
                break;
            case "teacher":
                if (!name.contains(",") || !studentID.equals("0") || teacherID.length() != 5 ||
                        !studentID.equals("0") || phone.length() != 4) {
                    return false;
                }
                break;
            case "TA":
                if (!name.contains(",") || studentID.equals("0") || studentID.length() != 5 ||
                        teacherID.equals("0") || teacherID.length() != 5 || phone.length() != 10) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }
    private static CSVPrintable createPerson(String position, String name,
                                             String studentID, String teacherID,
                                             String phone){
        CSVPrintable person;
        switch(position){
            case "teacher":
                person = new Teacher(position, name, teacherID, phone);
                break;
            case "TA":
                person = new TA(position, name, studentID, phone);
                break;
            default:
                person = new Student(position, name, studentID, phone);

        }
        return person;
    }
    public static final String OUTPUT_PATH = System.getProperty("user.dir") + "/output/";
    public static void main(String[] args) throws IOException{
        // write your code here
        PrintWriter p = new PrintWriter(OUTPUT_PATH + "out.csv");
        CSVPrintable person;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of persons: ");
        int n = scanner.nextInt();

        while(n < 0){
            System.out.println("A Negative number is entered. Please try again!");
            n = scanner.nextInt();
        }

        for(int i = 0; i < n;i++){
            String[] tokens = scanner.nextLine().split(" ");
            if(tokens.length != 5){
                i--;
                System.out.println("Try again");
                continue;
            }
            String position = tokens[0];//scanner.next();
            String name = tokens[1];//scanner.next();
            String studentID = tokens[2];//scanner.next();
            String teacherID = tokens[3];// scanner.next();
            String phone = tokens[4];// scanner.next();
            if(!verify(position, name, studentID, teacherID, phone)){
                i--;
                System.out.println("Try again");
                continue;
            }
            person = createPerson(position, name, studentID, teacherID, phone);
            person.csvPrintln(p);
        }
        p.close();

    }
}