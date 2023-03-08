package driver;
import java.util.*;
import java.io.*;
import util.*;
public class Main {
    private static boolean verify(String position, String name, String studentID, String teacherID, String phone){
        switch(position){
            case "student":
                //return studentID.length() ==
                break;
            case "teacher":
                break;
            case "TA":
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
                person = new Teacher();
                break;
            case "TA":
                person = new TA();
                break;
            default:
                person = new Student();

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