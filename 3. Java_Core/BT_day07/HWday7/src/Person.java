import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;

    public Person() {
        // this is the default constructor
    }

    public Person(String name, String gender, String address, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Full name: ");
        setName(scan.nextLine());
        System.out.print("Gender: ");
        setGender(scan.nextLine());
        System.out.print("Address: ");
        setAddress(scan.nextLine());
        System.out.print("Date of Birth: ");
        setDateOfBirth(scan.nextLine());
    }

    public void display() {
        System.out.printf("%nName : %s | Gender: %s | Address: %s | DOB: %s |", getName(), getGender(), getAddress(),
                getDateOfBirth());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
