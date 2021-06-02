public class Waiter extends Employee {
    private float compensate;

    @Override
    public float calculateSalary() {
        return compensate + getBasicSalary();
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+", Total Salary: "+ String.format("%.3f", calculateSalary()) ;
    }

    public Waiter(int id, String name, int age, float basicSalary, float compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public float getCompensate() {
        return compensate;
    }

    public void setCompensate(float compensate) {
        this.compensate = compensate;
    }

    
    
}
