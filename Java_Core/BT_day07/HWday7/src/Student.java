import java.util.Scanner;

public class Student extends Person {
    private String CPA;
    private String email;

    public Student(){
        //The default constructor
    }

    public Student(String name, String gender, String address, String dateOfBirth, String setCPA, String email) {
        super(name, gender, address, dateOfBirth);
        CPA = setCPA;
        this.email = email;
        
    }

    @Override
    public void input() {
        super.input();
        System.out.print("CPA: ");
        setCPA(scan.nextLine());
        System.out.print("Email: ");
        setEmail(scan.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("CPA: %s | Email: %s", getCPA(), getEmail());
    }

    public String getCPA() {
        return CPA;
    }

    public void setCPA(String setCPA) {
        CPA = setCPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
