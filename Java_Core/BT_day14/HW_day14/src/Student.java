public class Student extends Person implements Comparable {
    private float gpa;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - GPA: " + String.format("%.2f", gpa);
    }

    public Student(int id, String name, int age, String address, float gpa) {
        super(id, name, age, address);
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        if (this.getGpa() > ((Student) o).getGpa()) {
            return 1;
        } else {return (-1);}
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    

    



}
    

