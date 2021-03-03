import java.util.Scanner;

public class Staff {
    public int id;
    public String fullName;
    public int age;
    public String phoneNumber;
    public String email;
    public float basicSalary;

    public Staff() {
    }

    public Staff(int id, String name, int age, String phoneNumber, String email, float basicS) {
        this.id = id;
        this.fullName = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicS;
    }

    Scanner scan = new Scanner(System.in);
    public void input() {
        System.out.println("Mã nhân viên : ");
		this.setId(Integer.valueOf(scan.nextLine()));
        System.out.println();
        System.out.println("Họ tên : ");
        this.setFullName(scan.nextLine());
        System.out.println();
        System.out.println("Tuổi : ");
        this.setAge(Integer.valueOf(scan.nextLine()));
        System.out.println();
        System.out.println("Số điện thoại : ");
        this.setPhoneNumber(scan.nextLine());
        System.out.println();
        System.out.println("Email : ");
        this.setEmail(scan.nextLine());
        System.out.println();
        System.out.println("Lương cơ bản : ");
        this.setBasicSalary(Float.valueOf(scan.nextLine()));
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void showDetail() {

    }

}