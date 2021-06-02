import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner (System.in);
        //num of student
        System.out.println("Welcome to the Student Management");
        System.out.print("Fill number of students : ");
        int numOfStudent = scan.nextInt();
        
        //Fill in all infor
        Person[] student = new Person[numOfStudent];
        System.out.println("Now fill in all Students' information!");
        for (int i = 0; i<numOfStudent; i++) {
            System.out.println("Fill student number "+ (i+1) );
            student[i] = new Student();
            student[i].input();
        }
        System.out.println();
        scan.close();

        //log out Infor
        System.out.println("There are "+ numOfStudent + " students in the system");
        System.out.print("Information of all Students: ");
        for (int i = 0; i<numOfStudent; i++) {
            student[i].display();
        }
        System.out.println();
        System.out.println("End of List!");
    }
}
