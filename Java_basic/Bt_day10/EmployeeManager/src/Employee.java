import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String position;
    private String address;
    private float salary;

    Scanner scan = new Scanner (System.in);

    public Employee(int id, String name, String position, String address, float salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nId:" + id + "|name:" + name + "|Position:" + position + "|address:" + address + "|Salary:"
                + String.format("%.3f", salary);
    }

    public void input(){
        System.out.println("Nhap id nhan vien: ");
        id = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap ten nhan vien: ");
        name = scan.nextLine();
        System.out.println("Nhap vi tri : ");
        position = scan.nextLine();
        System.out.println("Nhap dia chi: ");
        address = scan.nextLine();
        System.out.println("Nhap Salary: ");
        salary = Float.parseFloat(scan.nextLine());
        
    }

    public Employee() {
        //default
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
