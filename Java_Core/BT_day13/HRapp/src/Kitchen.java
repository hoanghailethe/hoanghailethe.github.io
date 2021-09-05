public class Kitchen extends Employee {
    private float serviceCharge;

    @Override
    public float calculateSalary() {
        // TODO Auto-generated method stub
        return serviceCharge + getBasicSalary();
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+", Total Salary: "+ String.format("%.3f", calculateSalary()) ;
    }

    public Kitchen(int id, String name, int age, float basicSalary, float serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public float getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(float serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    
}
    

