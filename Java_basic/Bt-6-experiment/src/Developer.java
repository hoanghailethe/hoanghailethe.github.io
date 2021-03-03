public class Developer extends Staff {
    public float overTimeHours;
    private float salaryPerHour = 200_000;

    public Developer() {
    }

    public Developer(int id, String name, int age, String phoneNumber, String email, float basicS, float overTime) {
        super(id, name, age, phoneNumber, email, basicS);
        this.overTimeHours = overTime;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap time lam them gio :");
        this.setOverTimehour(scan.nextFloat());
    }

    public float getOverTimehour() {
        return overTimeHours;
    }

    public void setOverTimehour(float overTime) {
        this.overTimeHours = overTime;
    }

    public float totalSalary() {
        return (basicSalary + overTimeHours * salaryPerHour);
    }

    public void showDetail() {
        System.out.printf(
                "Id: %d |Name: %s |Age: %d |Phone: %s |Email %s |Lương cơ bản: %.2f |OverTime(hours) : %.1f |Tổng lương: %.2f %n",
                id, fullName, age, phoneNumber, email, basicSalary, overTimeHours, totalSalary());
    }

}