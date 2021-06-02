public class Teacher extends Person implements Comparable {
    private float Salary;

    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - Salary: " + String.format("%.2f", Salary);
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        if (this.getSalary() > ((Teacher) o).getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }

    public Teacher(int id, String name, int age, String address, float salary) {
        super(id, name, age, address);
        Salary = salary;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    
    
    
}
