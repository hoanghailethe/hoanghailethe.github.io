
public abstract class Employee{
    private int id;
    private String name;
    private int age;
    private float basicSalary;

    public abstract float calculateSalary();
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id: "+id+", name: "+name+", age: " +age+", basic salary: "+String.format("%.3f", basicSalary);
    }
    
    protected Employee(int id, String name, int age, float basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    

    
}